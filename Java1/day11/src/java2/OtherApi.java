package java2;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/*
1. System类
>属性：out、in、err
>方法：currentTimeMillis() / gc() / exit(int status) / getProperty(String property)
2. Runtime类
> 对应着Java进程的内存使用的运行时环境，是单例的
3. Math类
> 凡是与数学运算相关的操作，大家可以在此类中找相关的方法即可
4. BigInteger类和BigDecimal类
    BigInteger:可以表示任意长度的整数
    BigDecimal:可以表示任意精度的浮点数
5. Random类
> 获取指定范围的随机整数： nextInt(int bound)
 */
public class OtherApi {
  @Test
  public void test7(){
    Random r = new Random();
    System.out.println(r.nextBoolean());
    System.out.println(r.nextInt());
    System.out.println(r.nextLong());
    System.out.println(r.nextGaussian());
    System.out.println(r.nextFloat());
    System.out.println(r.nextDouble());

    System.out.println(r.nextInt(10));
  }
  @Test
  public void test6() {
    BigInteger bi = new BigInteger("12433241123");
    BigDecimal bd = new BigDecimal("12435.351");
    BigDecimal bd2 = new BigDecimal("11");
    System.out.println(bi);
    //System.out.println(bd.divide(bd2));
    System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
    System.out.println(bd.divide(bd2, 15, BigDecimal.ROUND_HALF_UP));
  }

  @Test
  public void test5() {
    //long bigNum = 123456789123456789123456789L;
    BigInteger b1 = new BigInteger("12345678912345678912345678");
    BigInteger b2 = new BigInteger("78923456789123456789123456789");
    //System.out.println("和：" + (b1 + b2));//错误的，无法直接使用+进行求和
    System.out.println("和：" + b1.add(b2));
    System.out.println("减：" + b1.subtract(b2));
    System.out.println("乘：" + b1.multiply(b2));
    System.out.println("除：" + b2.divide(b1));
    System.out.println("余：" + b2.remainder(b1));
  }

  @Test
  public void test4() {
    System.out.println(Math.ceil(3.14));
    System.out.println(Math.abs(-3.14));
    System.out.println(Math.round(-3.5));
  }

  @Test
  public void test3() {
    Runtime runtime = Runtime.getRuntime();
    long initialMemory = runtime.totalMemory(); //获取虚拟机初始化时堆内存总量
    long maxMemory = runtime.maxMemory(); //获取虚拟机最大堆内存总量
    String str = ""; //模拟占用内存
    for (int i = 0; i < 10000; i++) {
      str += i;
    }
    long freeMemory = runtime.freeMemory(); //获取空闲堆内存总量
    System.out.println("总内存：" + initialMemory / 1024 / 1024 * 64 + "MB");
    System.out.println("总内存：" + maxMemory / 1024 / 1024 * 4 + "MB");
    System.out.println("空闲内存：" + freeMemory / 1024 / 1024 + "MB");
    System.out.println("已用内存：" + (initialMemory - freeMemory) / 1024 / 1024 + "MB");
  }

  @Test
  public void test1() {
    System.out.println(System.currentTimeMillis());
    System.exit(0);
    System.out.println(12313);
  }

  @Test
  public void test2() {
    String javaVersion = System.getProperty("java.version");
    System.out.println("java的version:" + javaVersion);
    String javaHome = System.getProperty("java.home");
    System.out.println("java的home:" + javaHome);
    String osName = System.getProperty("os.name");
    System.out.println("os的name:" + osName);
    String osVersion = System.getProperty("os.version");
    System.out.println("os的version:" + osVersion);
    String userName = System.getProperty("user.name");
    System.out.println("user的name:" + userName);
    String userHome = System.getProperty("user.home");
    System.out.println("user的home:" + userHome);
    String userDir = System.getProperty("user.dir");
    System.out.println("user的dir:" + userDir);
  }
}
