package exer4;
/*
练习2：
编写程序，定义三个重载方法并调用。方法名为mOL。
三个方法分别接收一个int参数、两个int参数、一个字符串参数。
分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。

练习3：
定义三个重载方法max()：
第一个方法求两个int值中的最大值，
第二个方法求两个double值中的最大值，
第三个方法求三个double值中的最大值，并分别调用三个方法。
 */
public class OverloadTest {
  public void mOL(int a){
    System.out.println(a*a);
  }
  public void mOL(String a){
    System.out.println(a);
  }
  public void mOL(int a, int b){
    System.out.println(a*b);
  }

  public int max(int a,int b){
    return a > b? a : b;
  }
  public double max(double a,double b){
    return a > b? a : b;
  }
  public double max(double a,double b, double c){
    return max(max(a,b), c);
  }
}
