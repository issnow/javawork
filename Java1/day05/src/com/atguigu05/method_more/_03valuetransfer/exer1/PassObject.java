package com.atguigu05.method_more._03valuetransfer.exer1;

public class PassObject {
  public void printAreas(Circle c, int time){
    for (int i = 0; i < time; i++) {
      c.radius = i+1;
      double area = c.findArea();
      System.out.println("radius:"+c.radius +",area:"+area);
    }
  }
}
