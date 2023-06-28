package java1;
/*
1. 程序、进程和线程的区分：
程序(program)：为完成特定任务，用某种语言编写的`一组指令的集合`。即指一段静态的代码。
进程(process)：程序的一次执行过程，或是正在内存中运行的应用程序。程序是静态的，进程是动态的。
              进程作为操作系统调度和分配资源的最小单位。
线程(thread)：进程可进一步细化为线程，是程序内部的一条执行路径。
             线程作为CPU调度和执行的最小单位
2. 线程调度策略
分时调度：所有线程`轮流使用` CPU 的使用权，并且平均分配每个线程占用 CPU 的时间。
抢占式调度：让`优先级高`的线程以`较大的概率`优先使用 CPU。如果线程的优先级相同，那么会随机选择一个(线程随机性)，Java使用的为抢占式调度。
3. 了解
> 单核CPU与多核CPU
> 并行与并发
 */
public class ConceptTest {
  public static void main(String[] args) {

  }
}
