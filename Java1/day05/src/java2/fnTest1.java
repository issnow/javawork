package java2;
/*
方法的重载 overload
方法重载
  - 在同一个类中，允许存在一个以上的同名方法，只要它们的参数列表不同即可。
  – 参数列表不同，意味着参数个数或参数类型的不同
重载的特点：与修饰符、返回值类型无关，只看参数列表，且参数列表必须不同(参数个数或参数类型 )。
  调用时，根据方法参数列表的不同来区别。
重载方法调用:JVM 通过方法的参数列表，调用匹配的方法。
  – 先找个数、类型最匹配的
  – 再找个数和类型可以兼容的，如果同时多个方法可以兼容将会报错
 */
public class fnTest1 {
  //public void add(int i, int j){
  //
  //}
  public void add(double i, double j){

  }
  public void add(int i, int j, int m){

  }
  public void add(String i, int j){
    add(1,2);
  }
}
