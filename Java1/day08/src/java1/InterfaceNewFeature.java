package java1;
/*
方法：jdk8之前：声明抽象方法，修饰为public abstract
             jdk8:声明静态方法、默认方法
             jdk9:声明私有方法
 */
public class InterfaceNewFeature {
  public static void main(String[] args) {
    Sub s = new Sub();
    //1.接口中的静态方法只能被接口调用
    CompareA.fn1();
    //CompareA.fn2();
    //Sub.fn1();
    //s.fn1();
    //2.接口中声明的默认方法可以被实现类继承,可以调用,如果重写,则调用重写的方法
    s.fn2();
    //3.两个接口定义了同名同参数的默认方法,实现类没有重写此方法,则报错,必须重写
    s.fn3();
    //4.类优先原则-->父类与接口有重名方法,子类调用的是父类的方法
    s.fn4();
  }
}
interface CompareA {
  //属性:public static final
  //方法:jdk8之前:只能声明抽象方法
  //jdk8:静态方法,默认方法
  //jdk9:私有方法

  public static void fn1(){
    System.out.println("fn1");
  }

  public  default void fn2(){
    System.out.println("fn2");
  }
  public default void fn3(){
    System.out.println("a fn3");
  }
  public default void fn4(){
    System.out.println("a fn4");
    fn5();
  }
  //jdk9:私有方法
  private void fn5(){
    System.out.println("fn5");
  }
}
interface CompareB{
  public default void fn3(){
    System.out.println("b fn3");
  }
}
class Sub extends Super implements CompareA, CompareB {
  public void fn2(){
    System.out.println("sub fn2");
  }
  public void fn3(){
    System.out.println("sub fn3");
  }
  public void fn4(){
    System.out.println("sub fn4");
    CompareA.super.fn4();
  }

  public void fn(){
    //5.在子类调用父类与接口中的方法
    this.fn4();//本类
    super.fn4();//-->父类
    CompareA.super.fn4();//-->接口a中的fn4方法
  }
}

class Super {
  public void fn4(){
    System.out.println("super fn4");
  }
}