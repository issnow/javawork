package java1;

import java.util.concurrent.locks.ReentrantLock;

/*
除了使用synchronized同步机制处理线程安全问题之外，还可以使用jdk5.0提供的Lock锁的方式
1. 步骤：
步骤1. 创建Lock的实例，需要确保多个线程共用同一个Lock实例!需要考虑将此对象声明为static final
步骤2. 执行lock()方法，锁定对共享资源的调用
步骤3. unlock()的调用，释放对共享数据的锁定
2. 面试题：
synchronized同步的方式 与Lock的对比 ？
synchronized不管是同步代码块还是同步方法，都需要在结束一对{}之后，释放对同步监视器的调用。
Lock是通过两个方法控制需要被同步的代码，更灵活一些。
Lock作为接口，提供了多种实现类，适合更多更复杂的场景，效率更高。
 */
public class LockTest {
  public static void main(String[] args) {
    Thread t1 = new WindowTicket1();
    Thread t2 = new WindowTicket1();
    t1.start();
    t2.start();
  }
}

class WindowTicket1 extends Thread {
  static int ticket = 100;
  //1.创建lock的实例,需要确保多个线程公用同一个lock实例!加static final
  private static final ReentrantLock lock = new ReentrantLock();

  @Override
  public void run() {
    while (true) {
      try {
        //2.执行lock方法,锁定对共享资源的调用
        lock.lock();
        if (ticket > 0) {
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(Thread.currentThread().getName() + "售票,票号为" + ticket);
          ticket--;
        } else {
          break;
        }
      } finally {
        //3.释放对共享数据的锁定
        lock.unlock();
      }
    }
  }
}
