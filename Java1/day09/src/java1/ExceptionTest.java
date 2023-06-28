package java1;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;
/*
运行时异常
|---- ArrayIndexOutOfBoundsException
|---- NullPointerException
|---- ClassCastException
|---- NumberFormatException
|---- InputMismatchException
|---- ArithmeticException
 */

public class ExceptionTest {
  @Test
  public void test1(){
    //1.java.lang.ArrayIndexOutOfBoundsException
    int[] arr = new int[10];
    System.out.println(arr[10]);
  }
  @Test
  public void test2(){
    //2.java.lang.NullPointerException
    //String str = null;
    //System.out.println(str.length());

    //NullPointerException
    //int[][] arr = new int[4][];
    //System.out.println(arr[0][0]);

    int[] arr1 = null;
    System.out.println(arr1[0]);
  }
  @Test
  public void test3(){
    //3.java.lang.ClassCastException
    Object obj = new String();
    Date d = (Date) obj;
  }
  @Test
  public void test4(){
    //java.lang.NumberFormatException
    String str = "123abc";
    int i = Integer.parseInt(str);
    System.out.println(i);
  }
  @Test
  public void test5(){
    //java.util.InputMismatchException
    Scanner s = new Scanner(System.in);
    int i = s.nextInt();//输入数字,结果输入字符串,报异常
    System.out.println(i);
  }
  @Test
  public void test6(){
    //java.lang.ArithmeticException
    int n = 10;
    System.out.println(n / 0);//算符异常,数字0不能做分母
  }
}
