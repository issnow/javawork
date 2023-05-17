package exer1;
/*
数组最大值,最小值,总和,平均值
 */
public class ArrayExer3 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int)(Math.random() * 90) + 10;
      System.out.print(arr[i] + "\t");
    }
    int max = arr[0];//最大值
    int min = arr[0];//最小值
    int sum = 0;//总和
    double average;//平均值
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > max){
        max = arr[i];
      }
      if(arr[i] < min){
        min = arr[i];
      }
      sum += arr[i];
    }
    average = sum / arr.length;
    System.out.println(max);
    System.out.println(min);
    System.out.println(sum);
    System.out.println(average);
  }
}
