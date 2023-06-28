package com.atguigu08._interface.exer3;

public class Car extends Vehicle implements IPower{
  private String carName;

  public Car(String brand, String color, String carName) {
    super(brand, color);
    this.carName = carName;
  }

  public String getCarName() {
    return carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  @Override
  public void power() {
    System.out.println("烧油");
  }

  @Override
  public void run() {
    System.out.println("加油");
  }
}
