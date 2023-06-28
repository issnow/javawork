package java1;

import org.junit.Test;

public class StringBufferBuilderTest {
  @Test
  public void test1() {
    StringBuilder sb = new StringBuilder();
    sb.append("abc").append("123");
    System.out.println(sb);
    sb.delete(1, 2);
    System.out.println(sb);
    sb.deleteCharAt(0);
    System.out.println(sb);
    sb.replace(0, 1, "s");
    System.out.println(sb);
    sb.insert(1, "i");
    System.out.println(sb);
    System.out.println(sb.length());
    System.out.println(sb.charAt(4));
    System.out.println(sb.reverse());
  }

  @Test
  public void test2() {
    StringBuilder sb = new StringBuilder("hello");
    sb.setLength(2);
    System.out.println(sb);
    System.out.println(sb.append("1"));
    sb.setLength(10);
    System.out.println(sb);
    System.out.println(sb.append("2"));
  }

  @Test
  public void test3() {
    //初始设置
    long startTime = 0L;
    long endTime = 0L;

    String text = "";
    StringBuffer buffer = new StringBuffer("");
    StringBuilder builder = new StringBuilder("");

    //开始对比
    startTime = System.currentTimeMillis();
    for (int i = 0; i < 20000; i++) {
      buffer.append(String.valueOf(i));
    }
    endTime = System.currentTimeMillis();
    System.out.println("StringBuffer的执行时间：" + (endTime - startTime));

    startTime = System.currentTimeMillis();
    for (int i = 0; i < 20000; i++) {
      builder.append(String.valueOf(i));
    }
    endTime = System.currentTimeMillis();
    System.out.println("StringBuilder的执行时间：" + (endTime - startTime));

    startTime = System.currentTimeMillis();
    for (int i = 0; i < 20000; i++) {
      text = text + i;
    }
    endTime = System.currentTimeMillis();
    System.out.println("String的执行时间：" + (endTime - startTime));
  }
}
