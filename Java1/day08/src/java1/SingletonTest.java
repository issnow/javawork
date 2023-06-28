package java1;
/*
1. 设计模式概述：
设计模式是在大量的`实践中总结`和`理论化`之后优选的代码结构、编程风格、
以及解决问题的思考方式。设计模式免去我们自己再思考和摸索。
就像是经典的棋谱，不同的棋局，我们用不同的棋谱。"套路"
经典的设计模式一共有23种。
2. 何为单例模式(Singleton)：
所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，
对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法。
3. 如何实现单例模式（掌握）:
> 饿汉式
> 懒汉式
4. 对比两种模式（特点、优缺点）
特点：
 > 饿汉式：“立即加载”,随着类的加载，当前的唯一实例就创建了
 > 懒汉式："延迟加载",在需要使用的时候，进行创建。
优缺点：
 > 饿汉式：（优点）写法简单，由于内存中较早加载，使用更方便、更快。是线程安全的。 （缺点）内存中占用时间较长。
 > 懒汉式：（缺点）线程不安全 （放到多线程章节时解决）（优点）在需要的时候进行创建，节省内存空间。
 */
public class SingletonTest {
  public static void main(String[] args) {
    Bank b1 = Bank.getInstance();
    Bank b2 = Bank.getInstance();
    System.out.println(b1 == b2);
  }
}
class Bank {
  private Bank(){

  }
  private static Bank instance = new Bank();
  public static Bank getInstance(){
    return instance;
  }
}