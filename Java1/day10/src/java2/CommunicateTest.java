package java2;
/*
1. 线程间通信的理解
当我们`需要多个线程`来共同完成一件任务，并且我们希望他们有规律的执行，那么多线程之间需要一些通信机制，
可以协调它们的工作，以此实现多线程共同操作一份数据。
2. 涉及到三个方法的使用：
wait():线程一旦执行此方法，就进入等待状态。同时，会释放对同步监视器的调用
notify():一旦执行此方法，就会唤醒被wait()的线程中优先级最高的那一个线程。（如果被wait()的多个线程的优先级相同，则
         随机唤醒一个）。被唤醒的线程从当初被wait的位置继续执行。
notifyAll():一旦执行此方法，就会唤醒所有被wait的线程。
3. 注意点：
> 此三个方法的使用，必须是在同步代码块或同步方法中。
  (超纲：Lock需要配合Condition实现线程间的通信)
> 此三个方法的调用者，必须是同步监视器。否则，会报IllegalMonitorStateException异常
> 此三个方法声明在Object类中。
4. 案例：
案例1：使用两个线程打印 1-100。线程1, 线程2 交替打印
案例2：生产者&消费者
生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有
固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品
了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来
取走产品。
5. wait() 和 sleep()的区别？
相同点：一旦执行，当前线程都会进入阻塞状态
不同点：
> 声明的位置：wait():声明在Object类中
            sleep():声明在Thread类中，静态的
> 使用的场景不同：wait():只能使用在同步代码块或同步方法中
               sleep():可以在任何需要使用的场景
> 使用在同步代码块或同步方法中：wait():一旦执行，会释放同步监视器
                          sleep():一旦执行，不会释放同步监视器
> 结束阻塞的方式：wait(): 到达指定时间自动结束阻塞 或 通过被notify唤醒，结束阻塞
               sleep(): 到达指定时间自动结束阻塞
 */
public class CommunicateTest {
  public static void main(String[] args) {

  }
}
