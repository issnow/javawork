package java1;

public class SubOrder4<E> extends Order<Integer>{
  //此时SubOrder4是泛型类
  E e;

  public SubOrder4() {
  }

  public SubOrder4(Integer integer, int orderId, E e) {
    super(integer, orderId);
    this.e = e;
  }
}
