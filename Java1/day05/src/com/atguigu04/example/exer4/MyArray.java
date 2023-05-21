package com.atguigu04.example.exer4;
/*
案例：
根据上一章数组中的常用算法操作，自定义一个操作int[]的工具类。
涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、
             数组反转、数组排序(默认从小到大排序)、查找等
 */
public class MyArray {
  public int getMax(int[] arr){
    int max = arr[0];//最大值
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }
  public int getMin(int[] arr){
    int min = arr[0];//最小值
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] < min){
        min = arr[i];
      }
    }
    return min;
  }
  public int getSum(int[] arr){
    int sum = 0;//总和
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
  public int getAverage(int[] arr){
    return getSum(arr)/arr.length;
  }
}
