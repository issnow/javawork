package java1;

import java.util.Scanner;

/*
 if...else
嵌套
案例4：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else)，并且从小到大输出。
注意:if-else的执行语句只有一行,则这个语句{}可以省略,不建议省略


拓展:使用Scanner类
1.导包import java.util.Scanner
2.创建scanner实例
3.调用nextxxx方法
  sc.nextInt();//获取int
  sc.next();//获取string
  sc.nextDouble();//获取double
  sc.nextBoolean();//获取boolean
4.关闭资源,调用scanner类中的close()
 */
public class IfElseTest2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n1:");
    int n1 = sc.nextInt();
    System.out.print("n2:");
    int n2 = sc.nextInt();
    System.out.print("n3:");
    int n3 = sc.nextInt();

    //获取第一个字符
    System.out.print("男还是女:");
    char gender = sc.next().charAt(0);
    System.out.println(gender);

    String str = "";
    if(n1 > n2){
      if(n2 > n3)
        str = str + n3 + ',' + n2 + ',' + n1;
      else if(n1 >n3){
        str = str + n2 + ',' + n3 + ',' + n1;
      }else {
        str = str + n2 + ',' + n1 + ',' + n3;
      }
    }else {
      if(n1 > n3){
        str = str +n3 + ',' + n1 + ',' + n2;
      }else if(n2 > n3) {
        str = str +n1 + ',' + n3  + ','+ n2;
      }else {
        str = str +n1 + ',' + n2  + ','+ n3;
      }
    }
    System.out.println(str);
    sc.close();
  }
}
