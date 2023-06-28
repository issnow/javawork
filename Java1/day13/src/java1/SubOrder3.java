package java1;

public class SubOrder3<T> extends Order<T>{
  //此时SubOrder3是泛型类
  public T show() {
    return this.t;
  }
}
