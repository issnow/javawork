package java1;
/*
面向对象特征之二：继承性
1. 继承性的理解
  > 生活上：财产的继承、颜值的继承
  > 代码层面：
       > 自上而下：定义了一个类A，在定义另一个类B时，发现类B的功能与类A相似，考虑类B继承于类A
       > 自下而上：定义了类B,C,D等，发现B、C、D有类似的属性和方法，则可以考虑将相同的属性和方法进行抽取，
                 封装到类A中，让类B、C、D继承于类A,同时，B、C、D中的相似的功能就可以删除了。
2. 继承性的好处
  - 继承的出现减少了代码冗余，提高了代码的复用性。
  - 继承的出现，更有利于功能的扩展。
  - 继承的出现让类与类之间产生了`is-a`的关系，为多态的使用提供了前提。
    - 继承描述事物之间的所属关系，这种关系是：`is-a` 的关系。可见，父类更通用、更一般，子类更具体。
3. 继承的格式：
  class A{
      //属性、方法
  }
  class B extends A{

  }
  继承中的基本概念：
  类A: 父类、superClass、超类、基类
  类B: 子类、subClass、派生类
4. 有了继承性以后：
  > 子类就获取到了父类中声明的所有的属性和方法。
  > 但是，由于封装性的影响，可能子类不能直接调用父类中声明的属性或方法。
  > 子类在继承父类以后，还可以扩展自己特有的功能（体现：增加特有的属性、方法）
    extends:延展、扩展、延伸
    子类和父类的理解，要区别于集合和子集
  > 不要为了继承而继承。在继承之前，判断一下是否有is a的关系。
5. 默认的父类：
  Java中声明的类，如果没有显式的声明其父类时，则默认继承于java.lang.Object
6. 补充说明：
  > Java是支持多层继承。
     > 概念：直接父类、间接父类
  > Java中的子父类的概念是相对的。
  > Java中一个父类可以声明多个子类。反之，一个子类只能有一个父类（Java的单继承性）
 */
public class InheritanceTest {
  public static void main(String[] args) {
    Student s = new Student();
    s.name = "guocheng";
    s.age = 30;
    System.out.println(s.toString());
    System.out.println(s.getClass());//class java1.Studen
    System.out.println(s.getClass().getSuperclass());//class java1.Person
    System.out.println(s.getClass().getSuperclass().getSuperclass());//class java.lang.Object
  }
}
class Person {
  String name;
  int age;
  public void eat(){
    System.out.println("eat");
  }
}
class Student extends Person {
  public void sleep(){
    System.out.println("sleep");
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}