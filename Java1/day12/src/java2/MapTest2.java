package java2;

import java1.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class MapTest2 {
  @Test
  public void test1(){
    TreeMap treeMap = new TreeMap();
    treeMap.put("a", 122);
    treeMap.put("b", 12);
    treeMap.put("c", 34);
    treeMap.put("ac", 14);

    Set set = treeMap.entrySet();
    for(Object obj:set){
      System.out.println(obj);
    }
  }
  @Test
  public void test(){
    TreeMap arr = new TreeMap();
    arr.put(new Person("tom2", 14), 21);
    arr.put(new Person("tom1", 15), 1);
    arr.put(new Person("tom4", 12), 1);
    arr.put(new Person("tom3", 13), 12);
    arr.put(new Person("tom5", 15), 34);
    //System.out.println(arr);
    Set set = arr.entrySet();
    for (Object obj:set) {
      System.out.println(obj);
    }
    System.out.println(arr.containsKey(new Person("sfd", 12)));//具体看compareTo方法用什么属性
  }
  @Test
  public void test3(){
    TreeMap arr = new TreeMap(new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if(o1 instanceof Person && o2 instanceof Person ) {
          Person p1 = (Person) o1;
          Person p2 = (Person) o2;
          return p1.getAge() - p2.getAge();
        }
        throw new RuntimeException("sdf");
      }
    });
    arr.put(new Person("tom2", 14), 21);
    arr.put(new Person("tom1", 15), 1);
    arr.put(new Person("tom4", 12), 1);
    arr.put(new Person("tom3", 13), 12);
    arr.put(new Person("tom5", 15), 34);
    //System.out.println(arr);
    Set set = arr.entrySet();
    for (Object obj:set) {
      System.out.println(obj);
    }
  }
}
