package exer1;
/*
练习:数组复制
 */
public class ArrayExer4 {
  public static void main(String[] args) {
    int[] arr1 = {2,3,5,7,11,13,17,19};
    //int[] arr2 = arr1;
    int[] arr2 = new int[arr1.length];
    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
      if(i%2 == 0){
        arr2[i] = i;
      }
    }
  }
}
