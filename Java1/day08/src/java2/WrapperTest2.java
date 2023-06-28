package java2;

import org.junit.Test;

/*
4. String 与 基本数据类型、包装类之间的转换。
   基本数据类型、包装类 ---> String类型：
    ① 调用String的重载的静态方法valueOf(xxx xx) ;
    ② 基本数据类型的变量 + ""
   String类型 ---> 基本数据类型、包装类: 调用包装类的静态方法：parseXxx()
 */
public class WrapperTest2 {
  @Test
  public void test(){
    //基本数据类型、包装类 ---> String类型：
    int i1 = 10;
    System.out.println(String.valueOf(i1));

    System.out.println(String.valueOf(false));

    System.out.println(String.valueOf(12.2));

    System.out.println('a' + "");

    System.out.println(12L + "");
  }
  @Test
  public void test1(){
    System.out.println(Integer.parseInt("12"));
    String i1 = "213";
    int i2 = Integer.parseInt(i1);
    System.out.println(i2);

    Integer i3 = Integer.parseInt(i1);
    System.out.println(i3);

    String s2 = "true";
    boolean b1 = Boolean.parseBoolean(s2);
    System.out.println(b1);

    String s3 = "12.3";
    float f1 = Float.parseFloat(s3);
    System.out.println(f1);

    String s4 = "1231";
    Integer int1 = Integer.valueOf(s4);
    System.out.println(int1);

  }
  @Test
  public void test2(){
    System.out.println(100 == 100.0);
  }
}























