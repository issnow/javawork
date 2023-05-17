package exer1;
/*
练习:数组扩容与缩容
题目：现有数组 int[] arr = new int[]{1,2,3,4,5}; ，现将数组长度扩容1倍，
并将10,20,30三个数据添加到arr数组中，如何操作？
 */
public class ArrayExer6 {
  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3,4,5};
    int[] arr2 = {10,20,30};
    int[] arr1 = new int[arr.length *2];
    for (int i = 0; i < arr.length; i++) {
      arr1[i] = arr[i];
    }
    for (int i = 0; i < arr2.length; i++) {
      arr1[arr.length +i] = arr2[i];
    }
    arr = arr1;
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ",");
    }
  }
}
