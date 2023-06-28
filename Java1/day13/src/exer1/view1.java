package exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Predicate;

/*
1. 定义一个Employee类。
   该类包含：private成员变量name,age,birthday，其中 birthday 为 MyDate 类的对象；
   并为每一个属性定义 getter, setter 方法；
   并重写 toString 方法输出 name, age, birthday
2. MyDate类包含:
   private成员变量year,month,day；并为每一个属性定义 getter, setter 方法；
3. 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（TreeSet 需使用泛型来定义）
4. 分别按以下两种方式对集合中的元素进行排序，并遍历输出：
   1). 使Employee 实现 Comparable 接口，并按 name 排序
   2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
 */
public class view1 {
  public static void main(String[] args) {
    TreeSet<Employee> arr = new TreeSet<>(new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
      }
    });
    arr.add(new Employee("tom", 12, new MyDate(2022, 10, 1)));
    arr.add(new Employee("jerry", 1, new MyDate(2021, 3, 2)));
    arr.add(new Employee("rose", 22, new MyDate(2002, 5, 20)));
    //Iterator<Employee> it = arr.iterator();
    var it = arr.iterator();
    while (it.hasNext()) {
      Employee next = it.next();
      System.out.println(next);
    }
  }
  @Test
  public void test2(){
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      arr.add((int)(Math.random()*(99+1)));
    }
    for(Integer i:arr) {
      System.out.println(i);
    }
    arr.removeIf(new Predicate<Integer>() {
      @Override
      public boolean test(Integer integer) {
        return integer % 2 == 0;
      }
    });
    Iterator<Integer> it = arr.iterator();
    System.out.println("-----------");
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
