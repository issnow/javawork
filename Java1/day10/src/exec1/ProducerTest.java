package exec1;

/*
生产者消费者
 */
public class ProducerTest {
  public static void main(String[] args) {
    Clerk c = new Clerk();
    Thread producer = new Producer(c, "生产1");
    Thread consumer = new Consumer(c, "消费1");
    Thread consumer1 = new Consumer(c, "消费2");
    producer.start();
    consumer.start();
    consumer1.start();
  }
}

class Clerk {
  private int n = 0;

  public synchronized void add() {
    if (n >= 20) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    } else {
      n++;
      System.out.println(Thread.currentThread().getName() + "造-产品的序号:" + n);
      notifyAll();
    }
  }

  public synchronized void minus() {
    if (n <= 0) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    } else {
      System.out.println(Thread.currentThread().getName() + "吃-产品的序号:" + n);
      n--;
      notifyAll();
    }
  }
}

class Producer extends Thread {
  private Clerk clerk;

  public Producer(Clerk clerk, String name) {
    super(name);
    this.clerk = clerk;
  }

  @Override
  public void run() {
    System.out.println("造");
    while (true) {
      try {
        Thread.sleep(30);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      clerk.add();
    }
  }
}

class Consumer extends Thread {
  private Clerk clerk;

  public Consumer(Clerk clerk, String name) {
    super(name);
    this.clerk = clerk;
  }

  @Override
  public void run() {
    System.out.println("吃");
    while (true) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      clerk.minus();
    }
  }
}