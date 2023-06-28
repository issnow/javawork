package exer2.review;

import org.junit.Test;

import java.util.*;

public class view1 {
  @Test
  public void test1() {
    Collection arr = new ArrayList();
    arr.add(1);
    arr.add("a");
    arr.add("b");
    arr.add(new Person("tom", 12));
    System.out.println(arr.hashCode());
    System.out.println(arr.iterator());

    Iterator ite = arr.iterator();
    while (ite.hasNext()) {
      System.out.println(ite.next());
    }

    System.out.println(Arrays.asList(1, 2, 3));
    //arr.add(p);
    //arr.clear();
    //System.out.println(arr);
    //System.out.println(arr.isEmpty());
    //System.out.println(arr.size());
    //System.out.println(arr.contains(1));
    //arr.remove(1);
    //arr.remove(p);
    //arr.remove(new Person("tom", 12));
    System.out.println(arr);
    //System.out.println(arr.contains(new Person("tom", 12)));


    Collection arr1 = new ArrayList();
    //arr1.add(2);
    arr1.add(1);
    arr1.add("a");
    arr1.add(new Person("tom", 12));
    //arr1.addAll(arr);
    //arr1.add(1);
    //arr1.add(2);
    //arr1.add("b");
    //arr1.add(new Person("tom", 12));
    //System.out.println(arr.equals(arr1));
    System.out.println(arr1);

    System.out.println(arr);
    System.out.println(arr.retainAll(arr1));


    System.out.println(arr);
    //System.out.println(arr1.containsAll(arr));
  }

  @Test
  public void test2() {
    ArrayList arr = new ArrayList();
    arr.add(1);
    arr.add("a");
    arr.add(new Person("tom", 12));
    Iterator iter = arr.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
    for (Object obj : arr) {
      System.out.println(obj);
    }
  }

  @Test
  public void test3() {
    ArrayList arr = new ArrayList();
    arr.add(1);
    arr.add("a");
    arr.add(new Person("tom", 12));
    //arr.remove(Integer.valueOf(1));
    System.out.println(arr);
    arr.set(0, 2);
    System.out.println(arr);
    System.out.println(arr.get(1));
    arr.add(1, 3);
    System.out.println(arr);
  }

  @Test
  public void test4() {
    List arr = new ArrayList();
    arr.add(1);
    arr.add(2);
    arr.add(2);
    arr.add("a");
    arr.add(new Person("tom", 21));
    arr.add(new Person("tom", 21));
    System.out.println(arr);
    HashSet arr1 = new HashSet(arr);
    System.out.println(arr);
    System.out.println(arr1);
  }

  @Test
  public void test5() {
    TreeSet arr = new TreeSet(new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if (o1 instanceof Person && o2 instanceof Person) {
          Person p1 = (Person) o1;
          Person p2 = (Person) o2;
          return p2.getAge() - p1.getAge();
        }
        throw new RuntimeException("sdf");
      }
    });
    arr.add(new Person("tom", 12));
    arr.add(new Person("tom", 13));
    arr.add(new Person("tom", 14));
    arr.add(new Person("tom", 10));
    arr.add(new Person("tom", 9));
    Iterator iter = arr.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
  }

  @Test
  public void test6() {
    HashMap arr = new HashMap();
    arr.put(1, 2);
    arr.put("a", 5);
    arr.put("b", 111);

    Set set2 = arr.entrySet();
    Iterator it3 = set2.iterator();
    while (it3.hasNext()) {
      Map.Entry item = (Map.Entry) it3.next();
      System.out.println(item.getKey() + "-->" + item.getValue());
    }
  }
  @Test
  public void test7(){
    TreeMap arr = new TreeMap(new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if(o1 instanceof Person && o2 instanceof Person) {
          Person p1 = (Person) o1;
          Person p2 = (Person) o2;
          return -(p1.age - p2.age);
        }
        throw new RuntimeException("sdf");
      }
    });
    arr.put(new Person("tom", 12), 1);
    arr.put(new Person("tom", 11), 1);
    arr.put(new Person("tom", 10), 1);
    arr.put(new Person("tom", 14), 1);
    arr.put(new Person("tom2", 14), 1);
    System.out.println(arr);

    Set set = arr.entrySet();
    Iterator it = set.iterator();
    while (it.hasNext()) {
      Map.Entry item = (Map.Entry)it.next();
      System.out.println(item.getKey() +"-->"+ item.getValue());

    }
  }
}
