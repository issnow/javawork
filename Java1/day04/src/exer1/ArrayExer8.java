package exer1;
/*
1.线性查找
顺序查找：挨个查看
 */
public class ArrayExer8 {
  public static void main(String[] args) {
    int[] arr = {4,5,6,1,9};
    int target = 11;
    boolean f = false;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == target){
        f = true;
        System.out.println(i);
        break;
      }
    }
    if(!f){
      System.out.println("没找到");
    }
  }
}
