package java1;
/*
对象的内存解析
其中我们主要关心的是运行时数据区部分
堆（Heap）：此内存区域的唯一目的就是存放对象实例，几乎所有的对象实例都在这里分配内存。所有的对象实例以及数组都要在堆上分配。
栈（Stack）：是指虚拟机栈。虚拟机栈用于存储局部变量等。局部变量表存放了编译期可知长度的各种基本数据类型
  （boolean、byte、char、short、int、float、long、double）、对象引用（reference类型，它不等同于对象本身，
  是对象在堆内存的首地址）。 方法执行完，自动释放。
方法区（Method Area）：用于存储已被虚拟机加载的类信息、常量、静态变量、即时编译器编译后的代码等数据。
 */
public class Person {
  String name;
  int age;
  char gender;

  public void eat(){
    System.out.println("eat");
  }
  public void sleep(int hour){
    System.out.println(hour+"hour");
  }
  public void sleep(String hobby){
    System.out.println("hobby");
  }
}
