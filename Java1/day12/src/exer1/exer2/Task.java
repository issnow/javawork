package exer1.exer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Task {
  public static void main(String[] args) {
    //ArrayList arr = new ArrayList();
    //arr.addAll(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "c", "a", "b", "c", "a", "b", "c", "a"));

    Random r = new Random();
    ArrayList arr = new ArrayList();
    for (int i = 0; i < 90; i++) {
      int i1 = r.nextInt(26) + 97;
      String c = String.valueOf((char)i1);
      arr.add(c);
    }
    int n = listTest(arr, "c");
    System.out.println(arr);
    System.out.println(n);
  }

  public static int listTest(Collection list, String s) {
    int n = 0;
    for (Object obj : list) {
      String str = (String) obj;
      if (s == (String) str.intern()) {
        n++;
      }
    }
    return n;
  }

  @Test
  public void test() {
    Random r = new Random();
    ArrayList arr = new ArrayList();
    for (int i = 0; i < 30; i++) {
      int i1 = r.nextInt(26) + 97;
      char c = (char)i1;
      arr.add(c);
    }
    System.out.println(arr);
  }
}
