package java1;
/*
运算符3:比较运算符
==  !=  >  <  >=  <=   instanceof
• 比较运算符的结果都是 boolean 型，也就是要么是 true ，要么是 false 。
• > < >= <= ：只适用于基本数据类型（除 boolean 类型之外）
  == != ：适用于基本数据类型和引用数据类型
• 比较运算符 不能误写成 =
 */
public class CompareTest {
  public static void main(String[] args) {
    int i = 10;
    long l = 10l;
    System.out.println(i == l);//true
    //注意
    int i1 = 20;
    System.out.println(i = i1);//20
  }
}
