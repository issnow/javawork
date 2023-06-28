package java2;

import java1.Person;
import org.junit.Test;

import java.util.*;

public class MapTest {
  @Test//hashmap可以添加null值
  public void test1() {
    Map map = new HashMap();
    map.put(1, 2);
    map.put(null, null);
    System.out.println(map);
    System.out.println(map.get(null));
  }

  @Test//Hashtable不可以添加null值
  public void test2() {
    Map map = new Hashtable();
    //map.put(null,null);//java.lang.NullPointerException
    //map.put("aa", null);//java.lang.NullPointerException
  }

  @Test//linkedHashMap顺序是确定的
  public void test3() {
    Map arr = new LinkedHashMap();
    arr.put(1.2, 43);
    arr.put("tom", "a");
    arr.put("bb", 3);
    System.out.println(arr);
  }

  @Test//测试map的方法
  public void test4() {
    HashMap map = new HashMap();
    map.put("a", 12);
    map.put("b", 32);
    map.put(11, 3);
    map.put("c", new Person("tom", 123));
    System.out.println(map);
    System.out.println(map.size());
    Object val = map.remove("c");
    System.out.println(val);
    System.out.println(map);
    //HashMap m2 = new HashMap();
    //m2.putAll(map);
    //System.out.println(m2);
    Object val2 = map.put("a", 13);//原来的值
    System.out.println(map);
    System.out.println(val2);
    System.out.println(map.get(11));

  }

  @Test//测试map的遍历方法
  public void test5() {
    HashMap map = new HashMap();
    map.put("a", 12);
    map.put("b", 32);
    map.put(11, 3);
    map.put(new Person("tom", 123), "sss");
    Set set = map.keySet();
    for (Object obj : set) {
      System.out.println(obj);//获取key
      System.out.println(map.get(obj));//获取value
    }
    for (Object value : map.values()) {
      System.out.println(value);//获取value
    }
    System.out.println("_______________________");

    //方式1
    //Set ens = map.entrySet();
    //Iterator iterator = ens.iterator();
    //while (iterator.hasNext()) {
    //  //System.out.println(iterator.next());
    //  Map.Entry entry = (Map.Entry) iterator.next();
    //  System.out.println(entry.getKey() + "-->" + entry.getValue());
    //}

    //方式2
    Iterator iterator2 = set.iterator();
    while (iterator2.hasNext()) {
      Object key = iterator2.next();
      Object val = map.get(key);

      System.out.println(key +"--->"+ val);

    }
  }
}
