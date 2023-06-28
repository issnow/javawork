package java1;

public class Order<T> {
  //声明了类的泛型参数以后,就可以在类的内部使用此泛型参数
  T t;
  int orderId;

  public Order() {
  }

  public Order(T t, int orderId) {
    this.t = t;
    this.orderId = orderId;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  @Override
  public String toString() {
    return "Order{" +
            "t=" + t +
            ", orderId=" + orderId +
            '}';
  }
  //不可以在静态方法中使用类的泛型
  //public static void fn(){
  //  System.out.println(t);
  //}
  //自定义泛型方法
  public <E>E fn(E e) {
    return null;
  }
  public <O> int fn2() {
    StringBuilder s = new StringBuilder();

    return 1;
  }
}
