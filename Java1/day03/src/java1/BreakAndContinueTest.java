package java1;
/*
关键字 break 和 continue 的使用
            适用范围                     在循环结构中使用的作用                   相同点
break     switch-case,循环结构    一旦执行，就结束(或跳出)当前循环结构     此关键字的后面，不能声明语句
continue  循环结构                一旦执行，就结束(或跳出)当次循环结构     此关键字的后面，不能声明语句
此外，很多语言都有goto语句，goto语句可以随意将控制转移到程序中的任意一条语句上，然后执行它，
但使程序容易出错。Java中的break和continue是不同于goto的。
 */
public class BreakAndContinueTest {
  public static void main(String[] args) {
    //找3,5,7的最小公倍数
    for(int i = 7;;i++){
      if(i % 3 == 0 && i % 5 == 0 && i % 7 ==0) {
        System.out.println(i);
        break;
      }
    }

    //忽略3和3的倍数
    for(int i = 0; i < 10; i++) {
      if(i%3 == 0)
        continue;
      System.out.println(i);
    }
  }
}
