package java2;

/*
两个线程交替打印0-100
 */
public class PrintNumberTest {
  public static void main(String[] args) {
    Print p1 = new Print();
    Thread t1 = new Thread(p1, "线程1");
    Thread t2 = new Thread(p1, "线程2");
    t1.start();
    t2.start();
  }

}

class Print implements Runnable {
  private int n = 1;
  Object obj = new Object();
  @Override
  public void run() {
    while (true) {
      //synchronized (this) {
      synchronized (obj) {
        obj.notify();
        if (n <= 100) {
          //try {
          //  Thread.sleep(20);
          //} catch (InterruptedException e) {
          //  e.printStackTrace();
          //}
          System.out.println(Thread.currentThread().getName() + ":" + n++);
          try {
            obj.wait();//线程等待,释放对同步监视器的调用
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        } else {
          break;
        }
      }
    }
  }
}