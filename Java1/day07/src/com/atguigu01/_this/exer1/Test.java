package com.atguigu01._this.exer1;

public class Test {
}
class Boy {
  private String name;
  private int age;
  public Boy(){}

  public Boy(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public void marry(Girl girl){
    System.out.println(girl.toString());
  }
  public void shout(){
    System.out.println("shout");
  }

  @Override
  public String toString() {
    return "Boy{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}

class Girl{
  private String name;
  private int age;
  public Girl(){

  }
  public Girl(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void marry(Boy boy){
    System.out.println(boy.toString());
    boy.marry(this);
  }
  public void compare(Girl girl){

  }

  @Override
  public String toString() {
    return "Girl{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}