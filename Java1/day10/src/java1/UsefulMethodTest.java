package java1;
/*
一、线程的常用结构
1. 线程中的构造器
- public Thread() :分配一个新的线程对象。
- public Thread(String name) :分配一个指定名字的新的线程对象。
- public Thread(Runnable target) :指定创建线程的目标对象，它实现了Runnable接口中的run方法
- public Thread(Runnable target,String name) :分配一个带有指定目标新的线程对象并指定名字。
2.线程中的常用方法：
> start():①启动线程 ②调用线程的run()
> run():将线程要执行的操作，声明在run()中。
> currentThread():获取当前执行代码对应的线程
> getName(): 获取线程名
> setName(): 设置线程名
> sleep(long millis):静态方法，调用时，可以使得当前线程睡眠指定的毫秒数
> yield():静态方法，一旦执行此方法，就释放CPU的执行权
> join(): 在线程a中通过线程b调用join()，意味着线程a进入阻塞状态，直到线程b执行结束，线程a才结束阻塞状态，继续执行。
> isAlive():判断当前线程是否存活
过时方法：
> stop():强行结束一个线程的执行，直接进入死亡状态。不建议使用
> void suspend() / void resume() :可能造成死锁，所以也不建议使用
3. 线程的优先级：
getPriority():获取线程的优先级, 默认5
setPriority():设置线程的优先级。范围[1,10]
Thread类内部声明的三个常量：
- MAX_PRIORITY（10）：最高优先级
- MIN _PRIORITY （1）：最低优先级
- NORM_PRIORITY （5）：普通优先级，默认情况下main线程具有普通优先级。
二、线程的生命周期
 */
public class UsefulMethodTest {
  public static void main(String[] args) {
    GetNumber n1 = new GetNumber("number");
    n1.setName("子线程1");
    n1.setPriority(Thread.MAX_PRIORITY);
    n1.start();
    Thread.currentThread().setName("主线程");
    System.out.println(Thread.currentThread().getName());
    for (int i = 1; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() +"-->" + i);
      //if(i%20 == 0) {
      //  try {
      //    n1.join();
      //  } catch (InterruptedException e) {
      //    e.printStackTrace();
      //  }
      //}
    }
    //System.out.println(n1.isAlive());
    System.out.println(n1.getPriority());
  }
}
class GetNumber extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      //try {
      //  Thread.sleep(100);
      //} catch (InterruptedException e) {
      //  e.printStackTrace();
      //}
      System.out.println(Thread.currentThread().getName() +"-->" + i);
      //if(i % 20 == 0) {
      //  Thread.yield();
      //}
      //System.out.println(this.isAlive());
    }
    //System.out.println(Thread.currentThread());
    //System.out.println(Thread.currentThread().getName());
  }

  public GetNumber() {
  }

  public GetNumber(String name) {
    super(name);
  }

  public GetNumber(Runnable task, String name) {
    super(task, name);
  }
}