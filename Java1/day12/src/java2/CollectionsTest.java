package java2;

import org.junit.Test;

import java.util.*;

public class CollectionsTest {
  @Test
  public void test1(){
    List list = Arrays.asList(1, 2, 4,  6, 7,  5, 3);
    //Collections.reverse(list);
    //Collections.shuffle(list);
    //Collections.sort(list);
    Collections.sort(list, new Comparator() {
      public int compare(Object a, Object b) {
        if(a instanceof Integer && b instanceof Integer) {
          return -((Integer) a).compareTo((Integer) b);
        }
        throw new RuntimeException("sdf");
      }
    });
    //Collections.swap(list, 1,2);
    System.out.println(Collections.max(list, new Comparator() {
      public int compare(Object a, Object b) {
        if(a instanceof Integer && b instanceof Integer) {
          return -((Integer) a).compareTo((Integer) b);
        }
        throw new RuntimeException("sdf");
      }
    }));
    System.out.println(Collections.frequency(list, 2));

  }
  @Test//测试copy方法重点掌握
  public void test2(){
    List list = Arrays.asList(1, 2, 4,  6, 7,  5, 3);
    List list1 = Arrays.asList(new Object[list.size()]);
    Collections.copy(list1, list);
    System.out.println(list1);
  }
  @Test
  public void test3(){
    List list = Arrays.asList(1, 2, 4,  6, 7,  5, 3);
    List list2 = Collections.unmodifiableList(list);
    //list2.add(244);//java.lang.UnsupportedOperationException
    System.out.println(list2);
    System.out.println(list2.get(4));
    list.set(1,99);
    System.out.println(list);
  }
  @Test//test synchronizedList 方法
  public void test4(){
    List arr = new ArrayList();
    List list = Collections.synchronizedList(arr);
    list.add(123);
    System.out.println(list);
  }
}
