package com.atguigu08._interface.exer3;

public class ElectricVehicle extends Vehicle implements IPower{
  public ElectricVehicle(String brand, String color) {
    super(brand, color);
  }

  @Override
  public void run() {
    System.out.println("充电");
  }

  @Override
  public void power() {
    System.out.println("电力");
  }

}
