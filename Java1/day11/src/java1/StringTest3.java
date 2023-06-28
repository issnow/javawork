package java1;

import org.junit.Test;

public class StringTest3 {
  @Test
  public void test6(){
    char[] arr = {'a','b'};
    System.out.println(arr);
    System.out.println(new String(arr));

    String str = " hello";
    System.out.println(str.charAt(0) == '0');
    System.out.println(str.charAt(0) == 0);
    System.out.println(str.charAt(0));
    System.out.println(str.toCharArray());
  }
  @Test
  public void test5(){
    String s = "hello";
    String s1 = s.replace("l", "w");
    String s2 = s.replace("l", "ss");
    String s3 = s.replaceAll("\\D", "1");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

  }
  @Test
  public void test4(){
    String s = "hello";
    System.out.println(s.startsWith("h"));
    System.out.println(s.startsWith("he"));
    System.out.println(s.startsWith("he", 2));
    System.out.println(s.startsWith("l", 2));
    System.out.println(s.endsWith("o"));
    System.out.println(s.endsWith("llo"));
  }
  @Test
  public void test3(){
    String s = "hello world";
    System.out.println(s.charAt(6));
    String s2 = String.valueOf(new char[]{'a', 'b'});
    String s3 = String.copyValueOf(new char[]{'a', 'b'});
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s3 == s2);
  }
  @Test
  public void test2(){
    String s = "hello world";
    System.out.println(s.substring(2));
    System.out.println(s.substring(2, 8));
  }
  @Test
  public void test1(){
    String s = "sadf";
    System.out.println(String.valueOf(new char[]{'a','b'}));
  }
}
