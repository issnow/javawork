package java1;
/*
1. 线程的创建方式一：继承Thread类
1.1 步骤：
① 创建一个继承于Thread类的子类
② 重写Thread类的run() --->将此线程要执行的操作，声明在此方法体中
③ 创建当前Thread的子类的对象
④ 通过对象调用start(): 1.启动线程 2.调用当前线程的run()
1.2 例题：创建一个分线程1，用于遍历100以内的偶数
【拓展】 再创建一个分线程2，用于遍历100以内的偶数
2. 线程的创建方式二：实现Runnable接口
2.1 步骤：
① 创建一个实现Runnable接口的类
② 实现接口中的run() -->将此线程要执行的操作，声明在此方法体中
③ 创建当前实现类的对象
④ 将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
⑤ Thread类的实例调用start():1.启动线程 2.调用当前线程的run()
2.2 例题：创建分线程遍历100以内的偶数
3. 对比两种方式？
   共同点：① 启动线程，使用的都是Thread类中定义的start()
         ② 创建的线程对象，都是Thread类或其子类的实例。
   不同点：一个是类的继承，一个是接口的实现。
        建议：建议使用实现Runnable接口的方式。
        Runnable方式的好处：① 实现的方式，避免的类的单继承的局限性 ② 更适合处理有共享数据的问题。
                          ③ 实现了代码和数据的分离。
   联系：public class Thread implements Runnable （代理模式）
 */
public class ThreadTest {
  public static void main(String[] args) {
    //MyThread m = new MyThread();
    //MyThread m1 = new MyThread();
    //m.start();
    //m1.start();
    //OddThread o1 = new OddThread();
    //o1.start();
    //new OddThread().start();
    //for (int i = 0; i < 10000; i++) {
    //  if(i%2 == 0)
    //    System.out.println(Thread.currentThread().getName() + i + "-----------");
    //}

    new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          if(i%2 == 1)
            System.out.println(Thread.currentThread().getName()+"-->" + i);
        }
      }
    }.start();

  }
}
class MyThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if(i%2 == 0)
        System.out.println(Thread.currentThread().getName() +"-->"+ i);
    }
  }
}
class OddThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if(i%2 == 1)
        System.out.println(Thread.currentThread().getName()+"-->" + i);
    }
  }
}