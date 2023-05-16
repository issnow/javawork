package exer1;

import java.util.Scanner;
/*
用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 */
public class ArrayExer2 {
  public static void main(String[] args) {
    String[] strs = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    System.out.println(strs[--i]);
    sc.close();
  }
}
