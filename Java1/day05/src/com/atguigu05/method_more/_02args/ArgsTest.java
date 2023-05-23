package com.atguigu05.method_more._02args;

/*
 练习：可变形参的方法
 n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
 */
public class ArgsTest {
  public static void main(String[] args) {
    String a = fn("12","34", "sdfsf", "过程");
    System.out.println(a);
  }
  public static String fn(String ...arr){
    String str = "";
    for (int i = 0; i < arr.length; i++) {
      str += arr[i] + "-";
    }
    return  str;
  }
}
