package exer1;
/*
2.二分查找
 */
public class ArrayExer9 {
  public static void main(String[] args) {
    int[] arr = new int[]{-99,-54,-2,0,2,33,43,256,999};
    int target = 33;
    int h = 0;
    int e = arr.length - 1;
    while (h <= e){
      int m = (h +e)/2;
      if(target == arr[m]) {
        System.out.println("index:"+m);
        break;
      }
      if(target > arr[m]) {
        h = m+1;
      }if(target < arr[m]) {
        e = m - 1;
      }
    }
  }
}
