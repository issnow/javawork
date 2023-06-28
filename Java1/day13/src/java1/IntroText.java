package java1;

import org.junit.Test;

import java.util.*;

/*
1. 什么是泛型？
所谓泛型，就是允许在定义类、接口时通过一个`标识`表示类中某个`属性的类型`或者是某个方法的
`返回值或参数的类型`。这个类型参数将在使用时（例如，继承或实现这个接口、创建对象或调用方法时）
确定（即传入实际的类型参数，也称为类型实参）。
2. 在集合中使用泛型之前可能存在的问题
问题1：类型不安全。因为add()的参数是Object类型，意味着任何类型的对象都可以添加成功
问题2：需要使用强转操作，繁琐。还有可能导致ClassCastException异常。
3. 在集合、比较器中使用泛型 (重点)
见代码。
4.使用说明
> 集合框架在声明接口和其实现类时，使用了泛型（jdk5.0），在实例化集合对象时，
  如果没有使用泛型，则认为操作的是Object类型的数据。
  如果使用了泛型，则需要指明泛型的具体类型。一旦指明了泛型的具体类型，则在集合的相关的方法中，
  凡是使用类的泛型的位置，都替换为具体的泛型类型。
 */
public class IntroText {
  @Test//测试不使用泛型
  public void test(){
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    //1.类型不安全
    //list.add("a");
    Iterator it = list.iterator();
    while (it.hasNext()) {
      //2.强转可能导致报错
      Integer i = (Integer) it.next();
      System.out.println(i);
    }
  }
  @Test//测试使用泛型--arrayList
  public void test1(){
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    //list.add("sdf");//编辑报错
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      Integer next = iterator.next();
      System.out.println(next);
    }
  }
  @Test//测试使用泛型--map
  public void test2(){
    //HashMap<String, Integer> arr = new HashMap<String, Integer>();
    HashMap<String, Integer> arr = new HashMap<>();//类型推断,可以省略后面的<>中的内容
    arr.put("a", 1);
    arr.put("b", 2);
    //Set<Map.Entry<String, Integer>> entries = arr.entrySet();
    //Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
    var es = arr.entrySet();
    var it = es.iterator();
    while (it.hasNext()){
      //Map.Entry<String, Integer> item =  it.next();
      var item =  it.next();
      System.out.println(item.getKey());
      System.out.println(item.getValue());
    }
  }
}
