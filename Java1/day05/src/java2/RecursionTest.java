package java2;
/*
递归 (方法)
递归方法调用：方法自己调用自己的现象就称为递归。
递归方法包含了一种隐式的循环。
递归方法会重复执行某段代码，但这种重复执行无须循环控制。
递归一定要向已知方向递归，否则这种递归就变成了无穷递归，停不下来，类似于 死循环。最终发生 栈内存溢出。
 */
public class RecursionTest {
  public static void main(String[] args) {
    int res = getSum(100);
    System.out.println(res);
    int res2 = mul(10);
    System.out.println(res2);
  }
  public static int getSum(int n){
    if(n == 1){
      return 1;
    }
    return n+getSum(n-1);
  }
  public static  int mul(int n){
    if(n == 1){
      return  1;
    }
    return n * mul(n -1);
  }

}
