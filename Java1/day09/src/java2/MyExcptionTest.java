package java2;

import org.junit.Test;

/*
1. 如何自定义异常类？
① 继承于现有的异常体系。通常继承于RuntimeException \ Exception
② 通常提供几个重载的构造器
③ 提供一个全局常量，声明为：static final long serialVersionUID;
2. 如何使用自定义异常类？
> 在具体的代码中，满足指定条件的情况下，需要手动的使用"throw + 自定义异常类的对象"方式，将异常对象抛出。
> 如果自定义异常类是非运行时异常，则必须考虑如何处理此异常类的对象。（具体的：① try-catch-finally ② throws）
3. 为什么需要自定义异常类？
我们其实更关心的是，通过异常的名称就能直接判断此异常出现的原因。既然如此，我们就有必要在实际开发场景中，
不满足我们指定的条件时，指明我们自己特有的异常类。通过此异常类的名称，就能判断出具体出现的问题。
 */
public class MyExcptionTest {
  public static void main(String[] args) {
    MyExcptionTest me = new MyExcptionTest();
    me.fn1(-1);
  }
  public void fn1(int id){
    if(id < 0){
      throw new MyExcption("不能小于0");
    }
  }
}
class MyExcption extends RuntimeException {
  static final long serialVersionUID = -7034897145766939L;
  public MyExcption() {
  }

  public MyExcption(String message) {
    super(message);
  }

  public MyExcption(String message, Throwable cause) {
    super(message, cause);
  }
  @Test
  public void test1(){

  }
}