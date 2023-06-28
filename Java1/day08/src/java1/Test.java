package java1;

abstract class Aa{
  public abstract double findArea();
  public abstract double findLength();
}
class Ba extends Aa {
  public double findArea(){
    return 01.2;
  }
  public double findLength(){
    return 3.2;
  }
}