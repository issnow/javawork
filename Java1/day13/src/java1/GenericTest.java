package java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/*
1. 自定义泛型类\接口
1.1 格式
class A<T>{

}
interface B<T1,T2>{
}
1.2 使用说明
① 我们在声明完自定义泛型类以后，可以在类的内部（比如：属性、方法、构造器中）使用类的泛型。
② 我们在创建自定义泛型类的对象时，可以指明泛型参数类型。一旦指明，内部凡是使用类的泛型参数的位置，都具体化为指定的类的泛型类型。
③ 如果在创建自定义泛型类的对象时，没有指明泛型参数类型，那么泛型将被擦除，泛型对应的类型均按照Object处理，但不等价于Object。
- 经验：泛型要使用一路都用。要不用，一路都不要用。
④ 泛型的指定中必须使用引用数据类型。不能使用基本数据类型，此时只能使用包装类替换。
⑤ 除创建泛型类对象外，子类继承泛型类时、实现类实现泛型接口时，也可以确定泛型结构中的泛型参数。比如：SubOrder2
如果我们在给泛型类提供子类时，子类也不确定泛型的类型，则可以继续使用泛型参数。比如：SubOrder3
我们还可以在现有的父类的泛型参数的基础上，新增泛型参数。比如：比如：SubOrder4,SubOrder5
1.3 注意点
① 泛型类可能有多个参数，此时应将多个参数一起放在尖括号内。比如：<E1,E2,E3>
② JDK7.0 开始，泛型的简化操作：ArrayList<Fruit> flist = new ArrayList<>();
③ 如果泛型结构是一个接口或抽象类，则不可创建泛型类的对象。
④ 不能使用new E[]。但是可以：E[] elements = (E[])new Object[capacity];
参考：ArrayList源码中声明：Object[] elementData，而非泛型参数类型数组。
⑤ 在类/接口上声明的泛型，在本类或本接口中即代表某种类型，但不可以在静态方法中使用类的泛型。
⑥ 异常类不能是带泛型的。
2. 自定义泛型方法
2.1 问题：在泛型类的方法中，使用了类的泛型参数。那么此方法是泛型方法吗？
2.2 格式
权限修饰符 <T> 返回值类型 方法名(形参列表){  //通常在形参列表或返回值类型的位置会出现泛型参数T
}
2.3 举例
public <E> E method(E e){
}
2.4 说明
> 声明泛型方法时，一定要添加泛型参数<T>
> 泛型参数在方法调用时，指明其具体的类型
> 泛型方法可以根据需要声明为static的
> 泛型方法所属的类是否是一个泛型类，都可以。
 */
public class GenericTest {
  @Test
  public void test1(){
    Person p1 = new Person();
    ArrayList<Integer> arr = new ArrayList<>();
  }
  @Test//测试自定义泛型类
  public void test2(){
    Order order = new Order();//向下兼容,jdk5.0之前没有泛型
    Object obj = order.getT();

    //泛型必须是引用数据类型
    //Order<int> order1 = new Order<int>();
    //实例化时,指定泛型参数的具体类型
    Order<Integer> order2 = new Order<Integer>();
    Integer t = order2.getT();
  }
  @Test//测试Order子类1
  public void test3(){
    SubOrder1 o1 = new SubOrder1();
    //SubOrder1<Integer> o2 = new SubOrder1<>();//此时SubOrder1不是泛型类,不能这样写
  }
  @Test//测试Order子类2
  public void test4(){
    SubOrder2 o1 = new SubOrder2();
    Integer t = o1.getT();
  }
  @Test//测试Order子类3
  public void test5(){
    SubOrder3<Integer> o1 = new SubOrder3<>();
    System.out.println(o1.show());
  }
  @Test//测试Order子类5
  public void test6(){
    SubOrder5<String,Integer> o1 = new SubOrder5<>();
  }

  @Test
  public void test7(){
    ArrayList<Object> arr = null;
    ArrayList<String> arr1 = null;
    fn1(arr);
    //fn(arr1);
    fn1(arr1);
    //arr = arr1;//不能赋值
    /*
    反证法
    arr1.add("a")
    arr.add(123)
    String val = arr.get(1)
     */
  }
  @Test
  public void test8(){
    List<String> arr = null;
    ArrayList<String> arr1 = new ArrayList<>();
    arr = arr1;
    arr.add("sdf");
  }
  @Test
  public void test9(){
    List<?> list = null;
    List<Object> list1 = null;
    //List<String> list2 = null;
    List<String> list2 = new ArrayList<>();
    list2.add("s");
    //list = list1;
    //list = list2;

    list = list2;
    Object o = list.get(0);
    System.out.println(o);
    //list.add(123);无法写入
    list.add(null);
    System.out.println(list.get(1));
  }
  public void fn(ArrayList<Object> list) {

  }
  public void fn1(ArrayList<?> list) {

  }
  @Test//测试有限制条件的通配符的使用
  public void test10(){
    //? extends A
    List<? extends Father> arr = null;
    List<Object> arr1 = null;
    List<Father> arr2 = null;
    List<Son> arr3 = null;
    //arr = arr1;
    arr = arr2;
    arr = arr3;
  }
  @Test
  public void test12(){
    List<? extends Father> arr = null;
    List<Father> arr2 = new ArrayList<>();
    arr2.add(new Father());
    arr = arr2;
    Father father = arr.get(0);//读取可以

    //arr.add(new Father());//写入不可以
    arr.add(null);
  }
  @Test//测试有限制条件的通配符的使用
  public void test11(){
    //? super A
    List<? super Father> arr = null;
    List<Object> arr1 = null;
    List<Father> arr2 = null;
    List<Son> arr3 = null;
    arr = arr1;
    arr = arr2;
    //arr = arr3;
  }
  @Test
  public void test13(){
    List<? super Father> arr = null;
    List<Father> arr2 = new ArrayList<>();
    arr2.add(new Father());
    arr = arr2;
    Object o = arr.get(0);//读取可以

    arr.add(null);
    //arr.add(new Object());
    arr.add(new Father());
    arr.add(new Son());
  }
}
