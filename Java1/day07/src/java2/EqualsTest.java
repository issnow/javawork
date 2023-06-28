package java2;

import java.util.Objects;

public class EqualsTest {
  public static void main(String[] args) {
    EqualsTest e = new EqualsTest(123,"格式");
    EqualsTest e1 = new EqualsTest(123,"格式");
    System.out.println(e.equals(e1));
  }
  int OrderId;
  String OrderName;

  public EqualsTest(int orderId, String orderName) {
    OrderId = orderId;
    OrderName = orderName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EqualsTest that = (EqualsTest) o;
    return OrderId == that.OrderId && Objects.equals(OrderName, that.OrderName);
  }
}
