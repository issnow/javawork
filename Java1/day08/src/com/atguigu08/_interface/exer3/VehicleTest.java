package com.atguigu08._interface.exer3;

public class VehicleTest {
  public static void main(String[] args) {
    Vehicle[] arr = new Vehicle[3];
    arr[0] = new Bicycle("捷安特", "red");
    arr[1] = new ElectricVehicle("雅迪", "white");
    arr[2] = new Car("奔驰", "black", "轿车");
    for (int i = 0; i < arr.length; i++) {
      arr[i].run();
      if(arr[i] instanceof IPower){
        ((IPower) arr[i]).power();
      }
    }
    Developer d1 = new Developer("guocheng", 30 );
    d1.takingVehicle(arr[0]);
  }
}
