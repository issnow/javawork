package com.atguigu06.polymorphism.exer3;

public class Test {
  public static void main(String[] args) {
    Test t = new Test();
    t.fn(new Person());
    t.fn(new Student());
    t.fn(new Graduate());
    Person p = new Graduate();
    System.out.println("____________");
    System.out.println(p.getInfo());
    if (p instanceof Graduate) {
      Graduate g = (Graduate)p;
      g.show();
    }


  }

  public void fn(Person e) {
    System.out.println(e.getInfo());
  }
}

class Person {
  protected String name = "person";
  protected int age = 50;

  public String getInfo() {
    return "Name: " + name + "\n" + "age: " + age;
  }
}

class Student extends Person {
  protected String school = "pku";

  public String getInfo() {
    return "Name: " + name + "\nage: " + age
            + "\nschool: " + school;
  }
}

class Graduate extends Student {
  public String major = "IT";

  public String getInfo() {
    return "Name: " + name + "\nage: " + age
            + "\nschool: " + school + "\nmajor:" + major;
  }

  public void show() {
    System.out.println("show");
  }
}
