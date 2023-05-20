package java1;
/*
1.学习面向对象内容的三条主线
• Java 类及类的成员：（重点）属性、方法、构造器；（熟悉）代码块、内部类
• 面向对象的特征：封装、继承、多态、（抽象）
• 其他关键字的使用： this 、 super 、 package 、 import 、 static 、 final 、 interface 、
abstract 等
2. Java语言的基本元素：类和对象
  类(Class)和对象(Object)是面向对象的核心概念。
  1、什么是类
  类：具有相同特征的事物的抽象描述，是抽象的、概念上的定义。
  2、什么是对象
  对象：实际存在的该类事物的每个个体，是具体的，因而也称为实例(instance)。
3.面向对象程序设计的重点是类的设计,类的设计，其实就是类的成员的设计
Java中用类 class 来描述事物也是如此。类，是一组相关 属性和 行为的集合，这也是类最基本的两个成员。
  属性：
  该类事物的状态信息。对应类中的 成员变量
  • 成员变量 <=> 属性 <=> Field
  行为：
  该类事物要做什么操作，或者基于事物的状态能做什么。对应类中的 成员方法
  • 成员方法 <=> 函数 <=> Method
4.面向对象完成功能的三步骤（重要）
  4.1类的定义 修饰符 class xx{}
  4.2.对象创建,使用new关键字
    类 xx = new 类();
  4.3.使用类的属性和方法,使用.语法
 */
public class oopTest {
  public static void main(String[] args) {
    Phone p = new Phone();
    p.call();
  }
}

class Phone {
  double price;//价格
  String name;//品牌
  public void call(){
    System.out.println("call");
  }
  public void sendMsg(){
    System.out.println("sendMsg");
  }
}