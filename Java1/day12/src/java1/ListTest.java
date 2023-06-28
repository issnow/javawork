package java1;

import org.junit.Test;

import java.util.*;

public class ListTest {
  @Test
  public void test1() {
    ArrayList arr = new ArrayList();
    System.out.println(arr);
    arr.add(0, "asdf");
    arr.add(1, "abc");
    System.out.println(arr);
  }

  @Test
  public void test2() {
    List arr = new ArrayList();
    arr.add("a");
    arr.add(123);
    arr.add("b");
    arr.add(new Person("tom", 12));
    System.out.println(arr);

    arr.add(2, "c");
    System.out.println(arr);

    List arr1 = new ArrayList();
    arr1.add("r");
    arr1.add(3);
    arr1.add("g");
    arr1.add(new Person("tom1", 22));

    arr.addAll(1, arr1);
    //arr.add(1,arr1);//add与addAll区别:add将参数作为一个整体添加进来
    System.out.println(arr);
  }

  @Test
  public void test3() {
    List arr = new ArrayList();
    arr.add("a");
    arr.add(123);
    arr.add("b");
    arr.add(2);
    arr.add(new Person("tom", 12));
    //Object remove = arr.remove(2);
    //boolean remove = arr.remove(Integer.valueOf(123));
    System.out.println(arr);
    //System.out.println(remove);
    System.out.println(arr.get(2));
    Object sss = arr.set(1, "sss");
    System.out.println(sss);
    System.out.println(arr);
    System.out.println(arr.indexOf(22));
    System.out.println(arr.subList(0, 2));
  }

  @Test
  public void test4() {
    List arr = new ArrayList();
    arr.add("a");
    arr.add(123);
    arr.add("b");
    arr.add(2);
    arr.add(new Person("tom", 12));
    Iterator iterator = arr.iterator();
    //while (iterator.hasNext()) {
    //  System.out.println(iterator.next());
    //}
    //for(Object obj: arr) {
    //  System.out.println(obj);
    //}
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
  }

  @Test
  public void test5() {
    Vector arr = new Vector();
    arr.add(234);
    arr.add("a");
    arr.add(123);
    arr.add("b");
    arr.add(2);
    arr.add(new Person("tom", 12));
    System.out.println(arr);
  }

  @Test
  public void test6() {
    LinkedList arr = new LinkedList();
    arr.add("a");
    arr.add(123);
    arr.add("b");
    arr.add(2);
    arr.add(new Person("tom", 12));
    System.out.println(arr);
    Iterator ite = arr.iterator();

  }
}
