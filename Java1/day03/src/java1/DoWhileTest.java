package java1;
/*
do-while循环
理解：循环语句具有在 某些条件满足的情况下， 反复执行特定代码的功能。
• 循环结构 四要素
  – 初始化部分
  – 循环条件部分-->一定是boolean类型或表达式
  – 循环体部分
  - 迭代部分
语法格式：
①初始化部分; do{ ③循环体部分 ④迭代部分 }while(②循环条件部分);
执行过程：①-③-④-②-③-④-②-③-④-...-②
说明：
  • 结尾 while( 循环条件 中循环条件必须是 boolean 类型
  • do{}while(); 最后有一个分号
  • do while 结构的循环体语句是至少会执行一次，这个和 for 和 while 是不一样的
  • 循环的三个结构 for 、 while 、 do while 三者是可以相互转换的。


对比三种循环结构
三种循环结构都具有四个要素：
– 循环变量的初始化条件
– 循环条件
– 循环体语句块
– 循环变量的修改的迭代表达式
从循环次数角度分析
– do while 循环至少执行一次循环体语句。
– for 和 while 循环先判断循环条件语句是否成立，然后决定是否执行循环
体。
如何选择:
– 遍历有明显的循环次数（范围）的需求，选择 for 循环
– 遍历没有明显的循环次数（范围）的需求，选择 while 循环
– 如果循环体语句块至少执行一次，可以考虑使用 do while 循环
– 本质上：三种循环之间完全可以互相转换，都能实现循环的功能
 */
public class DoWhileTest {
  public static void main(String[] args) {
    //案例1：遍历1-100的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
    int i = 1;
    int sum = 0;
    int count = 0;
    do{
      if(i++%2==0) {
        sum += i;
        count++;
      }
    }while (i <= 100);
    System.out.println(sum);
    System.out.println(count);
  }
}
