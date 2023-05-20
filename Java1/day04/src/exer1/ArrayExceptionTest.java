package exer1;
/*
数组异常
1.当访问数组元素时，下标指定超出[0, 数组名.length-1]的范围时，就会报数组下标越界异常：
ArrayIndexOutOfBoundsException。
2.空指针异常
  因为此时数组的每一行还未分配具体存储元素的空间，此时arr[0]是null，此时访问
  arr[0][0]会抛出NullPointerException 空指针异常。
 */
public class ArrayExceptionTest {
  public static void main(String[] args) {
    //1.角标越界异常
    int[] arr = new int[2];
    //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2

    //2.空指针异常
    int[][] arr1 = new int[3][];
    //System.out.println(arr1[0][0]);//.NullPointerException: Cannot load from int array because "arr1[0]" is null

  }
}
