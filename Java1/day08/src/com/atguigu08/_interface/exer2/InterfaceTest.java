package com.atguigu08._interface.exer2;

public class InterfaceTest {
  public static void main(String[] args) {
    ComparableCircle c1 = new ComparableCircle(4.4);
    ComparableCircle c2 = new ComparableCircle(4.4);
    int res = c1.compareTo(c2);
    System.out.println(res);
  }
}
