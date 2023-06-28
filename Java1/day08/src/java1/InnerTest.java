package java1;
/*
类的成员之五：内部类
1. 什么是内部类？
将一个类A定义在另一个类B里面，里面的那个类A就称为`内部类（InnerClass）`，类B则称为`外部类（OuterClass）`。
2. 为什么需要内部类？
具体来说，当一个事物A的内部，还有一个部分需要一个完整的结构B进行描述，而这个内部的完整的结构B又只为外部事物A
提供服务，不在其他地方单独使用，那么整个内部的完整结构B最好使用内部类。
总的来说，遵循`高内聚、低耦合`的面向对象开发原则。
3. 内部类使用举例：
Thread类内部声明了State类，表示线程的生命周期
HashMap类中声明了Node类，表示封装的key和value
4. 内部类的分类：（参考变量的分类）
    > 成员内部类：直接声明在外部类的里面。
        > 使用static修饰的：静态的成员内部类
        > 不使用static修饰的：非静态的成员内部类
    > 局部内部类：声明在方法内、构造器内、代码块内的内部类
        > 匿名的局部内部类
        > 非匿名的局部内部类
5. 内部类这节要讲的知识：
  > 成员内部类的理解
  > 如何创建成员内部类的实例
  > 如何在成员内部类中调用外部类的结构
  > 局部内部类的基本使用
6. 关于成员内部类的理解：
   > 从类的角度看：
        - 内部可以声明属性、方法、构造器、代码块、内部类等结构
        - 此内部类可以声明父类，可以实现接口
        - 可以使用final修饰
        - 可以使用abstract修饰
   > 从外部类的成员的角度看：
        - 在内部可以调用外部类的结构。比如：属性、方法等
        - 除了使用public、缺省权限修饰之外，还可以使用private、protected修饰
        - 可以使用static修饰
7. 关于局部内部类的说明：
 */
public class InnerTest {
  public static void main(String[] args) {
    //1.创建People中的Dog实例
    People.Dog d1 = new People.Dog();
    d1.fn1();
    //2.创建people中的bird实例
    //new People.Bird();//报错
    People p1 = new People();
    People.Bird b1 = p1.new Bird();
    b1.eat();
    b1.fn("麻雀");
    b1.fn1();
  }
}
class People {
  String name = "Tom";
  int age;
  private int id;
  static class Dog {
    public void fn1(){
      System.out.println("dog eat");
    }
  }
  class Bird {
    String name = "小鸟";
    public void eat(){
      System.out.println("bird eat");
    }
    public void fn(String name){
      System.out.println(age);//省略了People.this
      System.out.println(name);
      System.out.println(this.name);
      System.out.println(People.this.name);//调用外层类的属性
    }
    public void fn1(){
      eat();
      People.this.eat();
    }

    public Bird() {
    }
    {}

  }
  public void eat(){
    System.out.println("people eat");
  }
  public void fn(){
    class C1{

    }
  }
  public void fn1(){
    class C1{

    }
  }
  {
    class C1{

    }
  }
}
