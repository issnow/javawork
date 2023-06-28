package java2;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
1. 创建多线程的方式三：实现Callable （jdk5.0新增的）
与之前的方式的对比：与Runnable方式的对比的好处
> call()可以有返回值，更灵活
> call()可以使用throws的方式处理异常，更灵活
> Callable使用了泛型参数，可以指明具体的call()的返回值类型，更灵活
有缺点吗？如果在主线程中需要获取分线程call()的返回值，则此时的主线程是阻塞状态的。
2. 创建多线程的方式四：使用线程池
此方式的好处：
> 提高了程序执行的效率。（因为线程已经提前创建好了）
> 提高了资源的复用率。（因为执行完的线程并未销毁，而是可以继续执行其他的任务）
> 可以设置相关的参数，对线程池中的线程的使用进行管理
 */
//1.创建一个实现Callable的实现类
class NumThread implements Callable {
  //2.实现call方法，将此线程需要执行的操作声明在call()中
  @Override
  public Object call() throws Exception {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
        sum += i;
      }
      //Thread.sleep(1000);
    }
    return sum;
  }
}


public class CallableTest {
  public static void main(String[] args) {
    //3.创建Callable接口实现类的对象
    NumThread numThread = new NumThread();

    //4.将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
    FutureTask futureTask = new FutureTask(numThread);

    //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
    Thread t1 = new Thread(futureTask);
    t1.start();

    System.out.println("main()线程");

    try {
      //6.获取Callable中call方法的返回值
      //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。
      Object sum = futureTask.get();
      System.out.println("总和为：" + sum);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
