package exec1.review;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Review1 {
  @Test
  public void test1() {
    String s = "a";
    String s1 = "b";
    String s2 = "ab";
    String s3 = new String("ab");
    String s4 = s + "b";
    System.out.println(s2 == s3);
    System.out.println(s2 == s4);
    System.out.println(s3);
    System.out.println(s4);
    String s5 = "a" + "b";
    System.out.println(s2 == s5);
    String s6 = "a".concat("b");

    System.out.println(s6 == s2);
  }

  @Test
  public void test2() {
    char[] arr = new char[]{'a', 'c', 'd'};
    byte[] arr1 = new byte[]{1, 2};
    System.out.println(arr);
    System.out.println(arr1);
    System.out.println(Arrays.toString(arr1));

    String s = new String(arr1);
    System.out.println(s);
    String s2 = new String(arr);
    System.out.println(s2);
    System.out.println(Arrays.toString(s2.toCharArray()));
  }

  @Test
  public void test3() throws UnsupportedEncodingException {
    String s = "abc";
    String s1 = "abc中国";
    byte[] arr = s.getBytes();
    byte[] arr1 = s1.getBytes();
    byte[] arr2 = s1.getBytes("gbk");
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    System.out.println("===================");

    String s2 = new String(arr1);
    String s3 = new String(arr2);
    System.out.println(s2);
    System.out.println(s3);
  }

  @Test
  public void test4() {
    StringBuffer s = new StringBuffer("asdf");
    System.out.println(s);
    s.append("sss");
    System.out.println(s);
    s.delete(1, 2);
    System.out.println(s);
    s.deleteCharAt(0);
    System.out.println(s);
    s.replace(2, 3, "---");
    System.out.println(s);
    s.setCharAt(0, 'p');
    System.out.println(s);
    s.insert(3, "+++");
    System.out.println(s);
  }

  @Test
  public void test5() {
    StringBuilder s = new StringBuilder("hello");
    String s1 = s.substring(0, 3);
    StringBuilder s2 = new StringBuilder(s1);
    System.out.println(s1);
    System.out.println(s2);
  }

  @Test
  public void test6() throws ParseException {
    Date d = new Date();
    System.out.println(d);
    System.out.println(d.getTime());
    java.sql.Date d2 = new java.sql.Date(1287280089265l);
    System.out.println(d2);
    System.out.println(d2.getTime());
    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(s.format(new Date()));

    System.out.println(s.parse("2024-06-21 00:59:00"));

  }

  @Test
  public void test7() {
    Calendar c = Calendar.getInstance();
    System.out.println(c.get(Calendar.DAY_OF_MONTH));
    c.set(Calendar.DAY_OF_MONTH, 5);
    System.out.println(c.get(Calendar.DAY_OF_MONTH));
    System.out.println(c.getTime());
  }

  /*
练习：
如何将一个java.util.Date的实例转换为java.sql.Date的实例
拓展：
将控制台获取的年月日（比如：2022-12-13）的字符串数据，保存在数据库中。
（简化为得到java.sql.Date的对象，此对象对应的时间为2022-12-13）。
   */
  @Test
  public void test8() {
    Date d = new Date();
    java.sql.Date d1 = new java.sql.Date(d.getTime());
    System.out.println(d1);
  }

  public static void main(String[] args) throws ParseException {
    Scanner s = new Scanner(System.in);
    String dataStr = s.next();
    SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-DD");
    java.sql.Date d3 = new java.sql.Date(s1.parse(dataStr).getTime());
    System.out.println(d3);
    System.out.println(s1.format(d3));
  }
}

