package java1;

import org.junit.Test;

public class StringTest1 {
  @Test
  public void test(){
    String s1 = "hello";
    String s2 = "hello";
    String s3 = new String("hello");
    String s4 = new String("hello");
    System.out.println(s1 == s2);//true
    System.out.println(s1 == s3);//false
    System.out.println(s3 == s4);//false

    System.out.println(s1.equals(s2));//true
    System.out.println(s1.equals(s3));//true
    System.out.println(s3.equals(s4));//true
  }
  @Test
  public void test1(){//重点
    String s1 = "a";
    String s2 = "b";
    String s3 = "ab";
    String s4 = "a" + "b";
    String s5 = s1 + "b";//底层通过StringBuilder调用toString()方法-->new String()
    String s6 = "a" + s2;
    String s7 = s1 + s2;
    System.out.println(s3 == s4);//true
    System.out.println(s3 == s5);//false
    System.out.println(s3 == s6);//false
    System.out.println(s3 == s7);//false
    System.out.println(s5 == s6);//false
    System.out.println(s5 == s7);//false

    String s8 = s5.intern();//放回的是字符串常量池中字面量的地址
    System.out.println(s3 == s8);//true
  }
  @Test
  public void test2(){
    final String s1 = "a";
    String s2 = "b";
    String s3 = "ab";
    String s4 = "a" + "b";
    String s5 = s1 + "b";
    String s6 = "a" + s2;
    String s7 = s1 + s2;

    System.out.println(s3 == s5);//true
    System.out.println(s3 == s6);//false
  }

  @Test
  public void test3(){
    String s1 = "a";
    String s2 = "b";
    String s3 = s1.concat(s2);
    String s4 = "a".concat(s2);
    String s5 = s1.concat("b");
    System.out.println(s3 == s4);//false
    System.out.println(s3 == s5);//false
    System.out.println(s4 == s5);//false
  }
}
