package com.atguigu06.polymorphism.exer1;

public class Test {
  public static void main(String[] args) {
    GeometricObject c = new Circle(3);
    GeometricObject myt = new MyRectangle(2,3);
    GeometricObject ge = new GeometricObject();
    System.out.println(ge.equalsArea(c, myt));
  }
}

class GeometricObject{
  public boolean equalsArea(GeometricObject o1, GeometricObject o2){
    return o1.area() == o2.area();
  }
  public double area(){
    return 0.0;
  }
}
class Circle extends GeometricObject {
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }
  @Override
  public double area() {
    return 3.14 * radius *radius;
  }
}
class MyRectangle extends GeometricObject {
  double width;
  double height;

  public MyRectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double area() {
    return height * width;
  }
}