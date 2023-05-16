package java1;
/*
while循环
理解：循环语句具有在 某些条件满足的情况下， 反复执行特定代码的功能。
• 循环结构 四要素
  – 初始化部分
  – 循环条件部分-->一定是boolean类型或表达式
  – 循环体部分
  - 迭代部分
语法格式：
①初始化部分 while(②循环条件部分)｛ ③循环体部分; ④迭代部分; }
执行过程：①-②-③-④-②-③-④-②-③-④-...-②
说明：
• while( 循环条件 中循环条件必须是 boolean 类型。
• 注意不要忘记声明 ④ 迭代部分。否则，循环将不能结束，变成死循环。
• for 循环和 while 循环可以相互转换。二者没有性能上的差别。实际开发中，根据具体
结构的情况，选择哪个格式更合适、美观。
• for 循环与 while 循环的区别：初始化条件部分的作用域不同。
 */
public class WhileTest {
  public static void main(String[] args) {
    int i = 0;
    while (i++<5) {
      System.out.println("hello");
    }

    do{
      System.out.println("world");
    }while (40>50);
  }
}
