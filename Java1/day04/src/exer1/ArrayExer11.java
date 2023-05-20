package exer1;
/*
1.实现冒泡排序
 */
public class ArrayExer11 {
  public static void main(String[] args) {
    int[] arr = {6,9,2,9,1};
    for (int i = 0; i < arr.length - 1; i++) {
      boolean f = true;
      for (int j = 0; j < arr.length-1-i; j++) {
        if(arr[j] > arr[j+1]) {
          arr[j] = arr[j]+arr[j+1];
          arr[j+1] = arr[j] - arr[j+1];
          arr[j] = arr[j] - arr[j+1];
          f = false;
        }
      }
      if(f){
        break;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+",");
    }
  }
}
