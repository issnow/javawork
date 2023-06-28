package com.atguigu10._enum.exer2;
/*

案例：颜色枚举类Color(使用enum声明)

1、声明颜色枚举类：7个常量对象：RED, ORANGE, YELLOW, GREEN, CYAN, BLUE,PURPLE;

2、在测试类中，使用枚举类，获取绿色对象，并打印对象。

 */
public class Exer2Test {
  public static void main(String[] args) {
    System.out.println(Color.RED);
  }
}
enum Color {
  RED("红"),ORANGE("橙");
  private String desc;
  private Color(String desc) {
    this.desc = desc;
  }

  //@Override
  //public String toString() {
  //  return "Color{" +
  //          "desc='" + desc + '\'' +
  //          '}';
  //}
}