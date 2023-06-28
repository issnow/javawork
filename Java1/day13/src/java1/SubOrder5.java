package java1;

public class SubOrder5<T, E> extends Order<T>{
  //此时SubOrder5是泛型类
  E e;

  public SubOrder5() {
  }

  public SubOrder5(T t, int orderId, E e) {
    super(t, orderId);
    this.e = e;
  }
}
