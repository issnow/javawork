package exer1.test2;
/*
编写应用程序DivisionDemo.java，接收命令行的两个参数，要求不能输入负数，计算两数相除。
	对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException、
  	除0(ArithmeticException)及输入负数(BelowZeroException 自定义的异常)进行异常处理。
提示：
	(1)在主类(DivisionDemo)中定义异常方法(divide)完成两数相除功能。
	(2)在main()方法中调用divide方法，使用异常处理语句进行异常处理。
	(3)在程序中，自定义对应输入负数的异常类(BelowZeroException)。
	(4)运行时接受参数 java DivisionDemo 20 10   //args[0]="20" args[1]="10"
	(5)Interger类的static方法parseInt(String s)将s转换成对应的int值。
        如：int a=Interger.parseInt("314");	//a=314;
 */

public class DivisionDemo {
  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int result = fn1(a,b);
      System.out.println(result);
    }catch (ArrayIndexOutOfBoundsException e){
      e.printStackTrace();
    }catch (NumberFormatException e) {
      e.printStackTrace();
    }catch (ArithmeticException e) {
      e.printStackTrace();
    }catch (BelowZeroException e) {
      e.printStackTrace();
    }
  }
  public static int fn1(int a, int b) throws BelowZeroException{
    if(a < 0 || b < 0) {
      throw new BelowZeroException("不能为负数");
    }
    return a / b;
  }
}
class BelowZeroException extends Exception {
  static final long serialVersionUID = -7034897190745661939L;
  public BelowZeroException() {
  }

  public BelowZeroException(String message) {
    super(message);
  }

  public BelowZeroException(String message, Throwable cause) {
    super(message, cause);
  }
}