package java1;
/*
for循环
理解：循环语句具有在 某些条件满足的情况下， 反复执行特定代码的功能。
• 循环结构分类：
  – for 循环
  – while 循环
  – do while 循环
• 循环结构 四要素
  – 初始化部分
  – 循环条件部分-->一定是boolean类型或表达式
  – 循环体部分
  - 迭代部分
for循环 语法格式：
for (①初始化部分; ②循环条件部分; ④迭代部分)｛ ③循环体部分; ｝
说明：
• for(;;) 中的两个；不能多也不能少
• ① 初始化部分可以声明多个变量，但必须是同一个类型，用逗号分隔
• ② 循环条件部分为 boolean 类型表达式，当值为 false 时，退出循环
• ④ 可以有多个变量更新，用逗号分隔
1、我们可以在循环中使用break。一旦执行break，就跳出当前循环结构。
 */
public class ForTest {
  public static void main(String[] args) {
    //输出5行HelloWorld
    for(int i = 0; i < 5; i++) {
      System.out.println("hello world");
    }


    //题目：遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
    int sum,count;
    sum = 0;
    count = 0;
    for(int j = 1; j <= 100;j++) {
      if(j% 2 == 0) {
        System.out.println(j);
        sum += j;
        count ++;
      }
    }
    System.out.println(sum);
    System.out.println(count);
  }
}
