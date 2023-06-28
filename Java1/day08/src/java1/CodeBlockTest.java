package java1;
/*
类的成员之四：代码块
回顾：类中可以声明的结构：属性、方法、构造器；代码块（或初始化块）、内部类
1. 代码块（或初始化块）的作用：
用来初始化类或对象的信息（即初始化类或对象的成员变量）
2. 代码块的修饰：
  只能使用static进行修饰。
3. 代码块的分类：
  静态代码块：使用static修饰
  非静态代码块：没有使用static修饰
4. 具体使用：
4.1 静态代码块：
    > 随着类的加载而执行
    > 由于类的加载只会执行一次，进而静态代码块的执行，也只会执行一次
    > 作用：用来初始化类的信息
    > 内部可以声明变量、调用属性或方法、编写输出语句等操作。
    > 静态代码块的执行要先于非静态代码块的执行
    > 如果声明有多个静态代码块，则按照声明的先后顺序执行
    > 静态代码块内部只能调用静态的结构（即静态的属性、方法），不能调用非静态的结构（即非静态的属性、方法）
4.2 非静态代码块：
    > 随着对象的创建而执行
    > 每创建当前类的一个实例，就会执行一次非静态代码块
    > 作用：用来初始化对象的信息
    > 内部可以声明变量、调用属性或方法、编写输出语句等操作。
    > 如果声明有多个非静态代码块，则按照声明的先后顺序执行
    > 非静态代码块内部可以调用静态的结构（即静态的属性、方法），也可以调用非静态的结构（即非静态的属性、方法）
 */
public class CodeBlockTest {
  public static void main(String[] args) {
    //Person p1 = new Person();
    //p1.eat();
    System.out.println(Person.a);
    Person p1 = new Person();
    Person p2 = new Person();
    System.out.println(System.currentTimeMillis());
  }
}

class Person {
  String name;
  int age;
  static int a;
  public void eat(){}
  static {
    System.out.println("static code0");
    a = 10;
    //age = 1;
  }
  {
    System.out.println("code 1");
    a = 10;
    age = 1;
  }
  static {
    System.out.println("static code");
    //1.默认赋值2.显示赋值3.构造器赋值4..属性和方法赋值5.代码块赋值
  }
}