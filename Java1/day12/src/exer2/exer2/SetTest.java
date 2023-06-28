package exer2.exer2;

import org.junit.Test;

import java.util.HashSet;

public class SetTest {
  @Test
  public void test1(){
    HashSet arr = new HashSet();
    while (arr.size() < 10) {
      int n = (int)(Math.random() * 20 + 1);
      arr.add(n);
    }
    System.out.println(arr);
  }
}
