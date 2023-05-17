package exer1;
/*
练习:数组反转
 */
public class ArrayExer5 {
  public static void main(String[] args) {
    int[] arr1 = {2,3,5,7,11,13,17,19};
    int len = arr1.length;
    int mid = (int)len / 2;
    int temp;
    for (int i = 0; i < mid; i++) {
      //temp = arr1[len - 1 - i];
      //arr1[len - 1 - i] = arr1[i];
      //arr1[i] = temp;
      arr1[i] = arr1[i] +arr1[len - 1 - i];
      arr1[len - 1 - i] = arr1[i] - arr1[len - 1 - i];
      arr1[i] = arr1[i] - arr1[len - 1 - i];
    }
    for (int i = 0; i < len; i++) {
      System.out.print(arr1[i] + ",");
    }
  }
}
