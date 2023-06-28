package com.atguigu03._extends.exer2;

public class Cylinder extends Circle{
  private double length;

  public Cylinder() {
    this.length = 1;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }
  public double findVolume(){
    return super.findArea()*this.getLength();
  }
  @Override
  public double findArea() {
    return super.findArea() * 2 + Math.PI * 2 * getRadius() * length;
  }
}
