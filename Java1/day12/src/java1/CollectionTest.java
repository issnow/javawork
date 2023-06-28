package java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
java.util.Collection:存储一个一个的数据
    |-----子接口：List:存储有序的、可重复的数据 ("动态"数组)
           |---- ArrayList(主要实现类)、LinkedList、Vector
    |-----子接口：Set:存储无序的、不可重复的数据(高中学习的集合)
           |---- HashSet(主要实现类)、LinkedHashSet、TreeSet
1. 常用方法：（Collection中定义了15个抽象方法。这些方法需要大家熟悉！）
boolean add(Object obj)
boolean addAll(Collection coll)
void clear()
boolean isEmpty()
int size()
boolean contains(Object obj)
boolean containsAll(Collection coll)
boolean retainAll(Collection coll) --> 调用者包含
boolean remove(Object obj)  -->  有重复的数据也只会删除一个
boolean removeAll(Collection coll)
int hashCode()
boolean equals(Object obj) --> 两个list元素值和顺序都一样才返回ture
object[] toArray()
*********
Iterator<E> iterator()
2. 集合与数组的相互转换：
集合 ---> 数组：toArray()
数组 ---> 集合：调用Arrays的静态方法asList(Object ... objs)
3. 向Collection中添加元素的要求：
  要求元素所属的类一定要重写equals()!
原因：
因为Collection中的相关方法（比如：contains() / remove()）在使用时，要调用元素所在类的equals()。
4.注意
A.retainAll(B)
可以看到这个方法改变了集合A中的元素，将存在于集合A中但不存在于集合B中的元素移除。
如果集合A的大小发生了改变，返回true，即使两个集合完全没有交集，也会返回true。
如果集合A的大小没有发生改变，返回false，即使两个集合完全相同，也会返回false。
 */
public class CollectionTest {
  @Test
  public void test1(){
    Collection arr = new ArrayList();
    arr.add("a");
    arr.add(123);//自动装箱
    arr.add(new Object());
    arr.add(new Person("tom", 12));
    System.out.println(arr);
    Collection arr1 = new ArrayList();
    arr1.add("b");
    arr1.add(3242);//自动装箱

    arr.addAll(arr1);
    System.out.println(arr);
    System.out.println(arr.size());
  }
  @Test
  public void test2(){
    Collection arr = new ArrayList();
    arr.add("a");
    arr.add(123);//自动装箱
    Person p1 = new Person("tom", 12);
    arr.add(p1);
    System.out.println(arr.isEmpty());
    System.out.println(arr.contains("a"));
    System.out.println(arr.contains(123));
    System.out.println(arr.contains(new Person("tom", 12)));

    Collection arr1 = new ArrayList();
    arr1.add("a");
    arr1.add(123);//自动装箱
    //arr1.add(p1);

    System.out.println(arr.containsAll(arr1));//true

    System.out.println(arr.equals(arr1));
    System.out.println(arr);
    System.out.println(arr1);
  }
  @Test
  public void test(){
    Collection arr = new ArrayList();
    arr.add("a");
    arr.add("a");
    arr.add(123);//自动装箱
    Person p1 = new Person("tom", 12);
    arr.add(p1);
    //System.out.println(arr);
    //System.out.println(arr.size());
    //arr.clear();
    //System.out.println(arr);
    //System.out.println(arr.size());

    //arr.remove(new Person("tom", 12));
    //arr.remove("a");
    //arr.remove(123);

    Collection arr1 = new ArrayList();
    arr1.add("a");
    arr1.add(123);//自动装箱
    arr1.add(456);//自动装箱
    arr1.add(new Person("lily", 12));//自动装箱
    //arr.removeAll(arr1);

    boolean f = arr.retainAll(arr1);
    System.out.println(f);
    System.out.println(arr);
    System.out.println(arr1);
  }
  @Test
  public void test3(){
    Collection arr = new ArrayList();
    arr.add("a");
    arr.add(123);//自动装箱
    Person p1 = new Person("tom", 12);
    arr.add(p1);
    Object[] arr1 = arr.toArray();
    System.out.println(Arrays.toString(arr1));
    System.out.println(arr.hashCode());
    System.out.println(arr.iterator());
  }
  @Test
  public void test4(){
    String[] arr = new String[]{"a","b"};
    List list = Arrays.asList(arr);
    System.out.println(list);
    int[] arr1 = new int[]{1,2,3};
    System.out.println(Arrays.toString(arr1));

    List list1 = Arrays.asList(arr1);
    System.out.println(list1);

    System.out.println(Arrays.asList(1, 2, 3));
  }
}
