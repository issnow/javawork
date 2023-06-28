package java1;

/*
解决单例模式中的懒汉式的线程安全问题
> 饿汉式：不存在线程安全问题。
> 懒汉式：存在线程安全问题，（需要使用同步机制来处理）
 */
public class ThreadMoreTest {
  static SingleTon b1 = null;
  static SingleTon b2 = null;

  public static void main(String[] args) {
    Thread t1 = new Thread() {
      @Override
      public void run() {
        b1 = SingleTon.getInstance();
      }
    };
    Thread t2 = new Thread() {
      @Override
      public void run() {
        b2 = SingleTon.getInstance();
      }
    };
    t1.start();
    t2.start();
    try {
      t1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    try {
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b2 == b1);
  }
}

class SingleTon {
  //volatile:避免指令重排,加上volatile关键字
  private static volatile SingleTon instance = null;
  private SingleTon() {
  }

  //方式1
  //public static synchronized SingleTon getInstance() {//SingleTon.class-->是唯一的
  //  if(instance == null) {
  //    try {
  //      Thread.sleep(1000);
  //    } catch (InterruptedException e) {
  //      e.printStackTrace();
  //    }
  //    instance = new SingleTon();
  //  }
  //  return instance;
  //}
  //方式2:指令重排
  public static SingleTon getInstance() {//SingleTon.class-->是唯一的
    if (instance == null) {
      synchronized (SingleTon.class) {
        if (instance == null) {
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          instance = new SingleTon();
        }
      }
    }
    return instance;
  }
}