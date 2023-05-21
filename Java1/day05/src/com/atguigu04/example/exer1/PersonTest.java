package com.atguigu04.example.exer1;


public class PersonTest {
  public static void main(String[] args) {
    Person p = new Person();
    p.name = "guocheng";
    p.age = 30;
    p.gender = '男';
    p.study();
    p.showAge();
    p.addAge(2);
    System.out.println(p.showAge());
  }
}
