package java1;

public class OutClassTest2 {
  public static void main(String[] args) {
    new InterA() {
      @Override
      public void fn() {
        System.out.println("intera fn");
      }
    }.fn();

    new C1(){
      @Override
      public void fn() {
        System.out.println("c1 sub fn");
      }
    }.fn();

    C2 c2 = new C2(){};
    System.out.println(c2.getClass());
    System.out.println(c2.getClass().getSuperclass());

    new C2(){
      public void fn2(){
        System.out.println("fn2");
      }
    }.fn2();
  }
}
interface InterA {
  public abstract void fn();
}
abstract class C1{
  public abstract void fn();
}
class C2 {
  public void fn(){
    System.out.println("c2");
  }
}