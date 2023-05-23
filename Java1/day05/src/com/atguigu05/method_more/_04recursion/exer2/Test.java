package com.atguigu05.method_more._04recursion.exer2;

public class Test {
  public static void main(String[] args) {
    int res =  fn(24);
    System.out.println(res);
  }
  public static int fn(int n){
    if(n == 1 || n == 2){
      return 1;
    }
    return fn(n-1) + fn(n-2);
  }
}
