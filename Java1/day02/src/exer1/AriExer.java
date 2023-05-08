package exer1;
/*
案例1：
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
格式如下： 数字xxx的情况如下： 个位数： 十位数： 百位数：
例如： 数字153的情况如下： 个位数：3 十位数：5 百位数：1
 */
public class AriExer {
  public static void main(String[] args) {
    int i = 153;
    int i1 = i%10;
    int i2 = i/10%10;
    int i3 = i/100;
    System.out.println("个位数："+i1+ "十位数："+i2+"百位数："+i3);
  }
}
