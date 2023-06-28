package com.atguigu09.inner.exer;

public class Unname {
  public static void main(String[] args) {
    new Object(){
      public void eat(){
        System.out.println("eat");
      }
    }.eat();
  }
}
