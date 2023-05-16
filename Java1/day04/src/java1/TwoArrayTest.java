package java1;
/*
多维数组:
对于二维数组的理解，可以看成是一维数组array1又作为另一个一维数组array2的元素而存在。
其实，从数组底层的运行机制来看，其实没有多维数组。
1.二维数组的关注点:
  1.数组的声明和初始化
    int[][] arr1 = new int[][]{{1,2,3},{4,5,6}};
    int[][] arr2 = new int[2][3];//2是外层数组的长度,3是内层数组的长度
    double[][] d = new double[2][];
  2.数组元素的调用
    arr1[0][0];
    arr1[1]
  3.数组的长度 .length
  4.遍历数组 for循环
  5.数组元素的默认值
    byte,short,int -->0
    long-->0L
    float-->0.0f
    double-->0.0
    char-->数字0或写为:'\u0000'(表现为空)
    boolean-->false
    引用类型-->null
  6.一维数组的内存解析
 */
public class TwoArrayTest {
  public static void main(String[] args) {
    int[][] arr1 = new int[][]{{1,2,3},{4,5,6}};
    int[][] arr2 = new int[2][3];
    double[][] d = new double[2][];
    //其他正确的写法
    int arr5[][] = new int[][]{{1,2,3},{4,5,6}};
    int[] arr6[] = new int[][]{{1,2,3},{4,5,6}};
    int  arr7[][] = {{1,2,3},{4,5,6}};//类型推断
    System.out.println(arr2.length);
    System.out.println(arr2[0].length);
    System.out.println(d.length);
    //System.out.println(d[0].length);//NullPointerException


    //其他都是错误的写法

    System.out.println(arr1[0][0]);
    System.out.println(arr1[0]);

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        System.out.println(arr1[i][j]);
      }
    }
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[i].length; j++) {
        System.out.println(arr2[i][j]);
      }
    }
  }
}
