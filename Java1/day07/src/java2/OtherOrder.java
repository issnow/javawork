package java2;

import java1.Order;

public class OtherOrder {
  public static void main(String[] args) {
    Order o  = new Order();
    //o.agePrivate = 1;//agePrivate' has private access in 'java1.Order
    //o.ageDefault = 1;
    //o.ageProtected = 12;
    o.agePublic = 3;
    //o.fnDefault();
    //o.fnProtected();
    o.fnPublic();
    //o.fnPrivate();//'fnPrivate()' has private access in 'java1.Order'
  }
}
