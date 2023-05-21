package com.atguigu04.example.exer3;
/*
案例：
利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
public class Circle {
  double radius;
  public double calculateArea(){
    return Math.round(3.14 * this.radius *this.radius);
  }
}
