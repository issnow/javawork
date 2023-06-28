package java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest1 {
  @Test
  public void test(){
    Collection arr = new ArrayList();
    arr.add("a");
    arr.add(123);//自动装箱
    arr.add(new Person("tom", 12));

    Iterator iterator = arr.iterator();
    //System.out.println(iterator.getClass());
    //System.out.println(iterator.hasNext());
    //System.out.println(iterator.next());
    //System.out.println(iterator.hasNext());
    //System.out.println(iterator.next());
    //System.out.println(iterator.hasNext());
    //System.out.println(iterator.next());
    //System.out.println(iterator.hasNext());
    //System.out.println(iterator.next());//java.util.NoSuchElementException

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
  @Test
  public void test1(){
    Collection arr = new ArrayList();
    arr.add("a");
    arr.add(123);//自动装箱
    arr.add(new Person("tom", 12));

    Iterator iterator = arr.iterator();

    //while (iterator.hasNext()) {
    //  System.out.println(iterator.next());
    //}

    //错误的遍历
    //while (iterator.next() !=null) {
    //  System.out.println(iterator.next());
    //}
  }
  @Test
  public void test2(){
    Collection arr = new ArrayList();
    arr.add("a");
    arr.add(123);//自动装箱
    arr.add(new Person("tom", 12));

    for(Object obj:arr){
      System.out.println(obj);
    }
    int[] arr1 = new int[]{1,2,3};
    for(int a:arr1) {
      a = 10;
      System.out.println(a);
    }
    System.out.println(Arrays.toString(arr1));
  }
  @Test
  public void test3(){
    Collection arr = new ArrayList();
    arr.add(1);
    arr.add("a");
    arr.add(new Person("tom", 12));
    System.out.println(arr);
    System.out.println(arr.isEmpty());
    System.out.println(arr.size());
    System.out.println(Arrays.toString(arr.toArray()));
    System.out.println(Arrays.asList(1, 2, 3));

    Iterator iterator = arr.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }
}
