package java1;
/*
接口的使用
1. 接口的理解：接口的本质是契约、标准、规范，就像我们的法律一样。制定好后大家都要遵守。
2. 定义接口的关键字：interface
3. 接口内部结构的说明：
   > 可以声明：
        属性：必须使用public static final修饰
        方法：jdk8之前：声明抽象方法，修饰为public abstract
             jdk8:声明静态方法、默认方法
             jdk9:声明私有方法
   > 不可以声明：构造器、代码块等
4. 接口与类的关系 ：实现关系
5. 格式：class A extends SuperA implements B,C{}
A相较于SuperA来讲，叫做子类
A相较于B,C来讲，叫做实现类。
6. 满足此关系之后，说明：
> 类可以实现多个接口。
> 类针对于接口的多实现，一定程度上就弥补了类的单继承的局限性。
> 类必须将实现的接口中的所有的抽象方法都重写（或实现），方可实例化。否则，此实现类必须声明为抽象类。
7. 接口与接口的关系：继承关系，且可以多继承
8. 接口的多态性： 接口名 变量名 = new 实现类对象;
9. 面试题：区分抽象类和接口
> 共性：都可以声明抽象方法
       都不能实例化
> 不同：① 抽象类一定有构造器。接口没有构造器
       ② 类与类之间继承关系，类与接口之间是实现关系，接口与接口之间是多继承关系
 */
public class InterfaceTest {
  public static void main(String[] args) {
    System.out.println(Flyable.MAX_SPEED);
    Plane p1 = new Plane();
    p1.attack();
    p1.eat();
    p1.fly();

    Flyable f1 = new Plane();
    System.out.println(f1.MAX_SPEED);
    f1.fly();

    //创建接口匿名实现类对象
    Flyable f2 = new Flyable() {
      @Override
      public void eat() {
        System.out.println("f2 eat");
      }

      @Override
      public void fly() {
        System.out.println("f2 fly");
      }
    };
    f2.fly();

    //创建接口匿名实现类匿名对象
    new Flyable() {
      @Override
      public void eat() {
        System.out.println("f2 eat");
      }

      @Override
      public void fly() {
        System.out.println("f3 fly");
      }
    }.fly();

    new Attack() {
      @Override
      public void attack() {

      }
    };
  }
}
interface Flyable{
  public static final int MIN_SPEED = 0;
  //属性可以省略public static final
  int MAX_SPEED = 7900;
  public abstract void eat();
  //方法可以省略public abstract
  void fly();
}

interface Attack {
  void attack();
}
class Plane implements Flyable, Attack{

  @Override
  public void eat() {

  }

  @Override
  public void fly() {
    System.out.println("fly");
  }

  @Override
  public void attack() {
    System.out.println("attack");
  }
}

interface AAA {
  void fn1();
}
interface BB {
  void fn2();
}
interface CC extends AAA, BB{
}
class D implements CC{
  @Override
  public void fn1() {
  }
  @Override
  public void fn2() {
  }
}

