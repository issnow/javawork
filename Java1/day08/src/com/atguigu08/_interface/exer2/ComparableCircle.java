package com.atguigu08._interface.exer2;

public class ComparableCircle extends Circle implements CompareObject{
  public ComparableCircle(double radius) {
    super(radius);
  }

  @Override
  public int compareTo(Object o) {
    if(this == o){
      return 0;
    }
    if(o instanceof ComparableCircle) {
      ComparableCircle other = (ComparableCircle) o;
      if(this.getRadius() > other.getRadius()){
        return 1;
      }else if(this.getRadius() < other.getRadius()){
        return -1;
      }else {
        return 0;
      }
    }
    return -1;
  }
}
