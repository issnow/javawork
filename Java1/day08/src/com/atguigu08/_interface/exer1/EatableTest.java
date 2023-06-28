package com.atguigu08._interface.exer1;

public class EatableTest {
  public static void main(String[] args) {
    Eatable[] arr = new Eatable[3];
    arr[0] = new Chinese();
    arr[1] = new American();
    arr[2] = new Indian();
    for (int i = 0; i < arr.length; i++) {
      arr[i].eat();
    }
  }
}
