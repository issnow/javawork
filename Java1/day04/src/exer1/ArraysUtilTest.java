package exer1;

import java.util.Arrays;

/*
java.util.Arrays类即为操作数组的工具类，包含了用来操作数组（比如排序和搜索）的各种方法
数组元素拼接：
  – static String toString(int[] a) ：字符串表示形式由数组的元素列表组成，括
  在方括号（ （"[]""[]"）中。相邻元素用字符 ", "（逗号加空格）分隔。形式为
  元素 1 ，元素 2 ，元素 3 。。。
  – static String toString(Object[] a) ：字符串表示形式由数组的元素列表组
  成，括在方括号（ （"[]""[]"）中。相邻元素用字符 ", "（逗号加空格）分隔。元
  素将自动调用自己从 Object 继承的 toString 方法将对象转为字符串进行拼
  接，如果没有重写，则返回类型 @hash 值，如果重写则按重写返回的字符
  串进行拼接。
数组排序：
  – stati c void sort(int[] a) ：将 a 数组按照从小到大进行排序
  – static void sort(int[] a, int fromIndex, int toIndex) ：将 a 数组的 [fromIndex,
  toIndex) 部分按照升序排列
  – static void sort(Object[] a) ：根据元素的自然顺序对指定对象数组按升序进
  行排序。
  – static void sort(T[] a, Comparator<? super T> c) ：根据指定比较器产生的
  顺序对指定对象数组进行排序。
数组元素的二分查找：
  – static int binarySearch(int[] a, int key) 、 static int binarySearch(Object[] a,
  Object key) ：要求数组有序，在数组中查找 key 是否存在，如果存在返回
  第一次找到的下标，不存在返回负数。
数组的复制：
  – static int[] copyOf(int[] original, int newLength) ：根据 original 原数组复制
  一个长度为 newLength 的新数组，并返回新数组
  – static T[] copyOf(T[] original,int newLength) newLength)：根据 original 原数组复制一
  个长度为 newLength 的新数组，并返回新数组
  – static int[] copyOfRange(int[] original, int from, int to) ：复制 original 原数
  组的 [from, 构成新数组，并返回新数组
  – static T[] copyOfRange(T[] original,int from,int to) to)：复制 original 原数组的
  [from, 构成 新数组，并返回新数组
比较两个数组是否相等：
  – static boolean equals(int[] a, int[] a2) ：比较两个数组的长度、元素是否完
  全相同
  – static boolean equals(Object[] a,Object[] a2)：比较两个数组的长度、元素
  是否完全相同
填充数组：
  – static void fill(int[] a, int val) ：用 val 值填充整个 a 数组
  – static void fill(Object[] a,Object val)val)：用 val 对象填充整个 a 数组
  – static void fill(int[] a, int fromIndex, int toIndex, int val) val)：将 a 数组
  [fromIndex, 部分填充为 val 值
  – static void fill(Object[] a, int fromIndex, int toIndex, Object val) ：将 a 数组
  [fromIndex, 部分填充为 val 对象
 */
public class ArraysUtilTest {
  public static void main(String[] args) {
    int[] arr1 = new int[]{1,2};
    int[] arr2 = new int[]{1,2};
    //1.equals
    boolean b = Arrays.equals(arr1,arr2);
    System.out.println(b);
    //2.toString
    System.out.println(Arrays.toString(arr1));
    //3.fill
    int[] arr3 = new int[3];
    Arrays.fill(arr3, 3);
    System.out.println(Arrays.toString(arr3));
    //4.sort
    int[] arr = {6,9,2,9,1};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    //5.binarySearch
    System.out.println(Arrays.binarySearch(arr2, 0));
  }
}
