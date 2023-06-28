package java1;
/*
final关键字的使用
1. final的理解：最终的
2. final可以用来修饰的结构：类、方法、变量
3. 具体说明：
3.1 final修饰类：表示此类不能被继承。
    比如：String、StringBuffer、StringBuilder类
3.2 final修饰方法：表示此方法不能被重写
    比如：Object类中的getClass()
3.3 final修饰变量：既可以修饰成员变量，也可以修饰局部变量。
    此时的"变量"其实就变成了"常量"，意味着一旦赋值，就不可更改。
    3.3.1 final修饰成员变量: 有哪些位置可以给成员变量赋值？
        > 显式赋值
        > 代码块中赋值
        > 构造器中赋值
   3.3.2 final修饰局部变量：一旦赋值就不能修改
        > 方法内声明的局部变量：在调用局部变量前，一定需要赋值。而且一旦赋值，就不可更改
        > 方法的形参：在调用此方法时，给形参进行赋值。而且一旦赋值，就不可更改
4. final与static搭配：修饰成员变量时，此成员变量称为：全局常量。
   比如：Math的PI
 */
public class FinalTest {
}

class A{
  public final int a;
  final static int b; 
  static  {
    b  =1;
  }
  {
    //一旦赋值就不能修改
    //a = 2;
    //a = 1;
  }
  public A (){
    a = 3;
  }
  public final void fn(final int c){
    //c = 1;
    final int b;
    b = 1;
    //一旦赋值就不能修改
    //b = 3;
  }
  public void fn(byte b){
  }
}

class B extends A {
  //final方法无法被重写
  //public void fn(){}
}