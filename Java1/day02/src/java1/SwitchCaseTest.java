package java1;
/*
语法格式：
switch(表达式){
  case 常量值1:
    语句块1;
    //break;
  case 常量值2:
    语句块2;
    //break;
  // ...
  [default: 语句块n+1; break; ]
}
第1步：根据switch中表达式的值，依次匹配各个case。如果表达式的值等于某个case中的常量值，则执行对应case中的执行语句。
第2步：执行完此case的执行语句以后，
情况1：如果遇到break,则执行break并跳出当前的switch-case结构
情况2：如果没有遇到break，则会继续执行当前case之后的其它case中的执行语句。
--->case穿透 ... 直到遇到break关键字或执行完所有的case及default的执行语句，跳出当前的switch-case结构
使用注意点：
• switch( 表达式 中表达式的值必须是下述几种类型之一： byte short char int ，枚举(jdk String (jdk 7.0)
• case 子句中的值必须是常量，不能是变量名或不确定的表达式值或范围；
• 同一个 switch 语句，所有 case 子句中的常量值互不相同；
• break 语句用来在执行完一个 case 分支后使程序跳出 switch 语句块；
如果没有 break ，程序会顺序执行到 switch 结尾；
• default 子句是可选的。同时，位置也是灵活的。当没有匹配的 case 时，执行 d efault
语句。

if else 语句与 switch case 语句比较
结论：凡是使用 switch case 的结构都可以转换为 if else 结构。反之，不成立。
• 开发经验：如果既可以使用 switch case ，又可以使用 if else ，建议使用 switch
case 。因为效率稍高。
• 细节对比：
– if else 语句优势
  • if 语句的条件是一个布尔类型值， if 条件表达式为 true 则进入分
  支，可以用于范围的判断，也可以用于等值的判断， 使用范围更广。
  • switch 语句的条件是一个常量值（ byte,short,int,char, 枚举 ,String
  只能判断某个变量或表达式的结果是否等于某个常量值， 使用场景较狭窄。
– switch 语句优势
  • 当条件是判断某个变量或表达式是否等于某个固定的常量值时，使
  用 if 和 switch 都可以，习惯上使用 switch 更多。因为 效率稍高。
  当条件是区间范围的判断时，只能使用 if 语句。
  • 使用 switch 可以利用 穿透性，同时执行多个分支，而 if...else 没有
  穿透性。
 */
public class SwitchCaseTest {
  public static void main(String[] args) {
    int n = 1;
    switch (n) {
      case 1:
          System.out.println("one");
          //break;
      case 2:
          System.out.println("two");
          break;
      case 3:
        System.out.println("two");
        break;
      default:
        System.out.println("default");
    }
  }
}
