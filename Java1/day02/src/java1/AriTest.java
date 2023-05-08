package java1;
/*
运算符1:算术运算符
1.+ - + - * / % (前)++ (后)++ (前)-- (后)--
举例2：“+”号的两种用法
第一种：对于
        +两边都是数值的话， ，+就是加法的意思
第二种：对于
        +两边至少有一边是字符串的话， ，+就是拼接的意思
 */
public class AriTest {
  public static void main(String[] args) {
    int m1 = 12;
    int n1 = 5;
    int k1 = m1/n1;
    System.out.println(k1);//2
    System.out.println(m1/n1*n1);//10

    //取模
    int i1 =12;
    int j1 = 5;
    System.out.println(i1%j1);//2

    //结果与被模数符号相同
    System.out.println(5%2);//1
    System.out.println(5%-2);//1
    System.out.println(-5%2);//-1
    System.out.println(-5%-2);//-1


    byte b1 = 127;
    b1++;
    System.out.println(b1);//-128


  }
}
