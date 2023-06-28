package exer1;

import org.junit.Test;

import java.util.Arrays;

public class view3 {
  public static <E> void fn1(E[] e, int a, int b) {
    E temp = e[a];
    e[a] = e[b];
    e[b] = temp;
  }
  @Test
  public void test1(){
    Integer[] arr = new Integer[]{1,2,3,4};
    fn1(arr, 1,2);
    System.out.println(Arrays.toString(arr));
  }
  public static <E> void fn2(E[] e) {
    for (int i = 0; i < e.length/2;i++) {
      //e[i], e[e.length - 1 - i];
      E temp = e[i];
      e[i] = e[e.length - 1 - i];
      e[e.length - 1 - i] = temp;
    }
  }
  @Test
  public void test(){
    Integer[] arr = new Integer[]{1,2,3,4};
    fn2(arr);
    System.out.println(Arrays.toString(arr));
  }
}

class Student<T> {
  String name;
  T rank;
}
class Math1 extends Student<Integer> {

}
class English extends Student<String> {

}