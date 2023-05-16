package java1;
/*
  5.数组元素的默认值
  int[][] arr1 = new int[3][4];
  外层:地址值,内层0
  像这种外层与内层都确定length的数组,外层是地址值,内层按照一维数组的默认类型来

  int[][] arr1 = new int[3][];
  外层:null,内层不存在,强行调用报异常:NullPointerException
  6.一维数组的内存解析
 */
public class TwoArrayTest2 {
  public static void main(String[] args) {
    int[][] arr1 = new int[3][4];
    int[][] arr2 = new int[3][];

    String[][] arr3 = new String[2][2];
    String[][] arr4 = new String[2][];
    System.out.println(arr1[0]);
    System.out.println(arr1[0][0]);
    System.out.println(arr2[0]);
    //System.out.println(arr2[0][0]);

    System.out.println("--------------");
    System.out.println(arr3[0]);
    System.out.println(arr3[0][0]);
    System.out.println(arr4[0]);
    //System.out.println(arr4[0][0]);
  }
}
