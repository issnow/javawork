package com.atguigu08._interface.exer3;

public class Bicycle extends Vehicle{
  public Bicycle(String brand, String color) {
    super(brand, color);
  }
  public void run(){
    System.out.println("登自行车");
  }
}
