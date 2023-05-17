package exer1;
/*
练习:数组扩容与缩容
题目：现有数组 int[] arr={1,2,3,4,5,6,7}。现需删除数组中索引为4的元素
留着下次做
 */
public class ArrayExer7 {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7};
    int[] narr = new int[arr.length - 1];
    int index = 4;
    for (int i = 0; i < index; i++) {
      narr[i] = arr[i];
    }
    for (int i = index; i < narr.length; i++) {
      narr[i] = arr[i+1];
    }
    arr = narr;
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
