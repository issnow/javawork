package java1;
/*
运算符6:条件运算符
  条件运算符格式：
  (条件表达式)? 表达式1:表达式2
说明：条件表达式是boolean 类型的结果，根据 boolean 的值选择表达式 1 或表达式 2
注意:如果运算后的结果赋给新的变量，要求表达式1 和表达式 2 为同种或兼容的类型
 */
public class ConditionTest {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    String str1 = a > b? "a大":"b大";
    System.out.println(str1);
  }
}
