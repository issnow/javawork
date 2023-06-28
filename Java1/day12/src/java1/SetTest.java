package java1;

import org.junit.Test;

import java.util.*;

public class SetTest {
  @Test
  public void test1(){
    Set arr = new HashSet();
    arr.add("a");
    arr.add(123);
    arr.add("b");
    arr.add(new Person("tom", 12));
    Iterator it = arr.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println(arr.contains(new Person("tom", 12)));
  }
  @Test
  public void test2(){
    Set arr = new LinkedHashSet();
    arr.add("a");
    arr.add(1);
    arr.add("b");
    arr.add(new Person("tom", 12));
    System.out.println(arr);
    Iterator it = arr.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
  @Test
  public void test3(){
    TreeSet arr = new TreeSet();
    arr.add("a");
    arr.add("b");
    arr.add("aa");
    arr.add("cc");
    arr.add("ac");
    arr.addAll(Arrays.asList("it", "is", "unblieable"));
    System.out.println(arr);
    Iterator iterator = arr.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
  @Test//treeset排序Person对象
  public void test4(){
    TreeSet arr = new TreeSet();
    arr.add(new Person("tom2", 14));
    arr.add(new Person("tom1", 15));
    arr.add(new Person("tom4", 12));
    arr.add(new Person("tom3", 13));
    arr.add(new Person("tom5", 15));
    for (Object obj:arr) {
      System.out.println(obj);
    }
    //System.out.println(arr.size());
    //System.out.println(arr.isEmpty());
    //arr.clear();
    //System.out.println(arr);
    //System.out.println(arr.isEmpty());
  }
  @Test//treeset 定制排序Person对象
  public void test5(){
    TreeSet arr = new TreeSet(new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if(o1 instanceof Person && o2 instanceof Person) {
          Person other = (Person) o1;
          Person other1 = (Person) o2;
          return -Integer.compare(other.age, other1.age);
        }
        throw new RuntimeException("错误");
      }
    });
    arr.add(new Person("tom2", 14));
    arr.add(new Person("tom1", 15));
    arr.add(new Person("tom4", 12));
    arr.add(new Person("tom3", 13));
    arr.add(new Person("tom5", 15));
    Iterator iterator = arr.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
