package java2;

import org.junit.Test;

import java.util.Scanner;

/*
JUnit单元测试的使用
1. 需要导入的jar包：
junit-4.12.jar
hamcrest-core-1.3.jar
2. 导入步骤
见课件
3. 创建单元测试类，进行测试
见代码
4. （重点关注）要想能正确的编写单元测试方法，需要满足：
- 所在的类必须是public的，非抽象的，包含唯一的无参构造器。
- @Test标记的方法本身必须是public，非抽象的，非静态的，void无返回值，()无参数的。
5. 默认情况下，单元测试方法中使用Scanner失效。如何解决？
6. 大家可以将单元测试方法设置为一个模板
 */
public class JUnitTest {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
  @Test
  public void test1(){
    System.out.println("hellow");
    fn();
  }
  public void fn(){
    System.out.println("fn");
  }
  @Test
  public void fn2(){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    System.out.println(n);
    s.close();
  }
  @Test
  public void test5(){
    System.out.println("sffds");
  }

}
