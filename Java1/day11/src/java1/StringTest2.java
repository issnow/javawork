package java1;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest2 {
  @Test
  public void test1(){
    String s1 = new String();
    String s2 = new String("");
    String s3 = new String(new char[]{'a', 'b'});
    System.out.println(s3);
  }
  @Test
  public void test2(){
    int n = 10;
    String s = String.valueOf(n);
    System.out.println(s);

    int n1 = Integer.parseInt(s);
    System.out.println(n1);
  }
  @Test
  public void test3(){
    //string --> char[]
    String s = "hello";
    char[] arr = s.toCharArray();
    System.out.println(arr);

    //char[] --> string
    String s2 = new String(arr);
    System.out.println(s2);
  }
  @Test
  public void test4() throws UnsupportedEncodingException {
    //string --> byte[]
    /*
    编码与解码
    编码:String --> 字节或字节数组
    解码:字节或字节数组-->String
    要求:解码与编码字符集必须一致,否则乱码
    utf-8中,一个汉字占用3个字节,一个字母占用1个字节
    gbk字符集中,一个汉字2个字节,一个字母占用1个字节
    utf8 gbk都兼容了ascii
     */
    String s = "abc";
    String s1 = "abc中国";
    byte[] arr = s.getBytes();
    byte[] arr0 = s1.getBytes("gbk");//可以传参
    byte[] arr1 = s1.getBytes();
    System.out.println(Arrays.toString(arr));//[97, 98, 99]
    System.out.println(Arrays.toString(arr0));//[97, 98, 99, -42, -48, -71, -6]
    System.out.println(Arrays.toString(arr1));//[97, 98, 99, -28, -72, -83, -27, -101, -67]

    //byte[] --> string
    String s2 = new String(arr0, "gbk");
    String s3 = new String(arr1);
    System.out.println(s2);
    System.out.println(s3);
  }

  @Test
  public void test5(){
    String s1 = new String(new char[]{97,98,99});
    String s2 = new String(new byte[]{97,98,99, -28, -72, -83, -27, -101, -67});
    System.out.println(s1);
    System.out.println(s2);
  }
}
