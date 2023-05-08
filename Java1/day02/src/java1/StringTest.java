package java1;
/*
基本数据类型与string的运算
String 不是基本数据类型，属于引用数据类型。属于字符串
使用方式与基本数据类型一致。例如：String str= “abcd”。
一个字符串可以串接另一个字符串，也可以直接串接其他类型的数据
String 类型变量的使用：
  1. String 属于引用数据类型 。
  2. 声明 String 类型变量时，使用一对 "" 。
  3. String 可以和 8 种基本数据类型变量做运算，且运算只能是连接运算；+
  4. 运算的结果任然是 String 类型
 */
public class StringTest {
  public static void main(String[] args) {
    String str1 = "hello";
    System.out.println(str1);
    String str2 = "";
    System.out.println(str2);

    String str3 = "a";//char c1 = 'a';
    boolean b1 = true;
    System.out.println(b1+str3);

    int i1 = 10;
    String str4 = str3 +i1;
    System.out.println(str4);

    //String str5 = b1+i1+str3;//报错,布尔值不能和基本类型变量运算

    //如何将String-->基本数据类型
    String s1 = "123";
    int i2 = Integer.parseInt(s1);
    System.out.println(i2+1);

  }
}
