package java1;

/*
线程的安全问题与线程的同步机制
1. 多线程卖票，出现的问题：出现了重票和错票
2. 什么原因导致的？线程1操作ticket的过程中，尚未结束的情况下，其他线程也参与进来，对ticket进行操作。
3. 如何解决？必须保证一个线程a在操作ticket的过程中，其它线程必须等待，直到线程a操作ticket结束以后，其它线程才可以进来
           继续操作ticket。
4. Java是如何解决线程的安全问题的？使用线程的同步机制。
方式1：同步代码块
synchronized(同步监视器){
    //需要被同步的代码
}
说明：
> 需要被同步的代码，即为操作共享数据的代码。
> 共享数据：即多个线程都需要操作的数据。比如：ticket
> 需要被同步的代码，在被synchronized包裹以后，就使得一个线程在操作这些代码的过程中，其它线程必须等待。
> 同步监视器,俗称锁。哪个线程获取了锁，哪个线程就能执行需要被同步的代码。
> 同步监视器，可以使用任何一个类的对象充当。但是，多个线程必须共用同一个同步监视器。
注意：在实现Runnable接口的方式中，同步监视器可以考虑使用：this。
     在继承Thread类的方式中，同步监视器要慎用this，可以考虑使用：当前类.class。
方式2：同步方法
说明：
> 如果操作共享数据的代码完整的声明在了一个方法中，那么我们就可以将此方法声明为同步方法即可。
> 非静态的同步方法，默认同步监视器是this
  静态的同步方法，默认同步监视器是当前类本身。
5. synchronized好处：解决了线程的安全问题。
   弊端：在操作共享数据时，多线程其实是串行执行的，意味着性能低。
 */
public class ThreadSafeTest {
  public static void main(String[] args) {

    BuyTicket buy1 = new BuyTicket();
    Thread t1 = new Thread(buy1);
    Thread t2 = new Thread(buy1);
    Thread t3 = new Thread(buy1);
    t1.setName("线程1");
    t2.setName("线程2");
    t3.setName("线程3");
    t1.start();
    t2.start();
    t3.start();
    System.out.println(buy1.tickets);
  }
}

class BuyTicket implements Runnable {
  int tickets = 100;
  Object o1 = new Object();
  boolean flag = true;
  //@Override
  //public void run() {
  //  while (true) {
  //    synchronized(this) {//this唯一?是的
  //      if(tickets > 0) {
  //        try {
  //          Thread.sleep(10);
  //        } catch (InterruptedException e) {
  //          e.printStackTrace();
  //        }
  //        System.out.println(Thread.currentThread().getName() + "售票,票号为" + tickets);
  //        tickets--;
  //      }else {
  //        break;
  //      }
  //    }
  //  }
  //}


  @Override
  public void run() {
    while (flag) {
      fn();
    }
  }
  public synchronized void fn() {//此时的同步监视器为this,只考虑this是不是唯一的,this是唯一的
    if (tickets > 0) {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + "售票,票号为" + tickets);
      tickets--;
    } else {
      flag = false;
    }
  }
}