package com.atguigu03._extends.exer2;

public class CylinderTest {
  public static void main(String[] args) {
    Cylinder c = new Cylinder();
    c.setRadius(8);
    c.setLength(10);
    System.out.println(c.findVolume());
  }
}
