package java1;

public class OutClassTest1 {
  //说明:局部内部类的使用
  public void fn(){
    class AA{//局部内部类
      //属性,方法
    }
    new Comparable(){

      @Override
      public int compareTo(Object o) {
        return 0;
      }
      public void show(){
        System.out.println("11111111");
      }
    }.show();
  }
  //开发中的场景
  public Comparable getInstance() {
    //提供类实现Comparable
    //方式1:提供了接口的实现类的匿名对象
    //class MyComparable implements Comparable {
    //
    //  @Override
    //  public int compareTo(Object o) {
    //    return 0;
    //  }
    //}
    //return new MyComparable();
    //方式2:提供接口的匿名实现类的匿名对象
    return new Comparable() {
      @Override
      public int compareTo(Object o) {
        return 0;
      }
    };
  }
}
