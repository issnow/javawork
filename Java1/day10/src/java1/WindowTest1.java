package java1;

public class WindowTest1 {
  public static void main(String[] args) {
    WindowTicket w1 = new WindowTicket();
    WindowTicket w2 = new WindowTicket();
    WindowTicket w3 = new WindowTicket();
    w1.setName("窗口1");
    w2.setName("窗口2");
    w3.setName("窗口3");
    w1.start();
    w2.start();
    w3.start();
  }
}
class WindowTicket extends Thread {
  static int ticket = 100;
  static boolean flag = true;
  //@Override
  //public void run() {
  //  while (true) {
  //    synchronized(WindowTicket.class) {//Class clz = WindowTicket.class是唯一的
  //      if(ticket > 0) {
  //        try {
  //          Thread.sleep(10);
  //        } catch (InterruptedException e) {
  //          e.printStackTrace();
  //        }
  //        System.out.println(Thread.currentThread().getName() + "售票,票号为" + ticket);
  //        ticket--;
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
  //public  synchronized void fn() {this不唯一,此时不安全
  public static synchronized void fn() {//同步监视器为当前类本身,WindowTicket.class,是安全的
    //继承Thread的方式不能用this
    if (ticket > 0) {
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + "售票,票号为" + ticket);
      ticket--;
    } else {
      flag = false;
    }
  }
}