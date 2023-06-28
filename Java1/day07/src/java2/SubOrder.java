package java2;

import java1.Order;

public class SubOrder extends Order {
  public void fn(){
    //agePrivate = 1;
    //ageDefault = 1;
    ageProtected = 12;
    agePublic = 3;
    //fnPrivate();
    //fnDefault();
    fnProtected();
    fnPublic();
  }
}
