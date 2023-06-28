package java1;

import org.junit.Test;
/*
1. 什么是异常？
指的是程序在执行过程中，出现的非正常情况，如果不处理最终会导致JVM的非正常停止。
2. 异常的抛出机制
Java中把不同的异常用不同的类表示，一旦发生某种异常，就`创建该异常类型的对象`，并且抛出（throw）。
然后程序员可以捕获(catch)到这个异常对象，并处理；如果没有捕获(catch)这个异常对象，那么这个异常
对象将会导致程序终止。
3. 如何对待异常
 对于程序出现的异常，一般有两种解决方法：一是遇到错误就终止程序的运行。另一种方法是程序员在编写程序时，
 就充分考虑到各种可能发生的异常和错误，极力预防和避免。实在无法避免的，要编写相应的代码进行异常的检测、
 以及`异常的处理`，保证代码的`健壮性`。
4. 异常的体系结构
java.lang.Throwable:异常体系的根父类
    |---java.lang.Error:错误。Java虚拟机无法解决的严重问题。如：JVM系统内部错误、资源耗尽等严重情况。
                         一般不编写针对性的代码进行处理。
               |---- StackOverflowError、OutOfMemoryError
    |---java.lang.Exception:异常。我们可以编写针对性的代码进行处理。
               |----编译时异常：(受检异常)在执行javac.exe命令时，出现的异常。
                    |----- ClassNotFoundException
                    |----- FileNotFoundException
                    |----- IOException
               |----运行时异常：(非受检异常)在执行java.exe命令时，出现的异常。
                    |---- ArrayIndexOutOfBoundsException
                    |---- NullPointerException
                    |---- ClassCastException
                    |---- NumberFormatException
                    |---- InputMismatchException
                    |---- ArithmeticException

【面试题】说说你在开发中常见的异常都有哪些？
开发1-2年：
|----编译时异常：(受检异常)在执行javac.exe命令时，出现的异常。
    |----- ClassNotFoundException
    |----- FileNotFoundException
    |----- IOException
|----运行时异常：(非受检异常)在执行java.exe命令时，出现的异常。
    |---- ArrayIndexOutOfBoundsException
    |---- NullPointerException
    |---- ClassCastException
    |---- NumberFormatException
    |---- InputMismatchException
    |---- ArithmeticException
开发3年以上：OOM。
 */
public class ThrowableTest {
  public static void main(String[] args) {
    //main(args);//java.lang.StackOverflowError
  }
  @Test
  public void test(){
    String str = new String();
  }
}
