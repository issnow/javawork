package java1;
/*
1. 内存层面需要针对于多个数据进行存储。此时，可以考虑的容器有：数组、集合类
2. 数组存储多个数据方面的特点：
   > 数组一旦初始化，其长度就是确定的。
   > 数组中的多个元素是依次紧密排列的，有序的，可重复的
   > (优点) 数组一旦初始化完成，其元素的类型就是确定的。不是此类型的元素，就不能添加到此数组中。
      int[] arr = new int[10];
      arr[0] = 1;
      arr[1] = "AA";//编译报错

      Object[] arr1 = new Object[10];
      arr1[0] = new String();
      arr1[1] = new Date();
   > (优点)元素的类型既可以是基本数据类型，也可以是引用数据类型。
   数组存储多个数据方面的弊端：
   > 数组一旦初始化，其长度就不可变了。
   > 数组中存储数据特点的单一性。对于无序的、不可重复的场景的多个数据就无能为力了。
   > 数组中可用的方法、属性都极少。具体的需求，都需要自己来组织相关的代码逻辑。
   > 针对于数组中元素的删除、插入操作，性能较差。
3. Java集合框架体系（java.util包下）
java.util.Collection:存储一个一个的数据
    |-----子接口：List:存储有序的、可重复的数据 ("动态"数组)
           |---- ArrayList(主要实现类)、LinkedList、Vector
    |-----子接口：Set:存储无序的、不可重复的数据(高中学习的集合)
           |---- HashSet(主要实现类)、LinkedHashSet、TreeSet
java.util.Map:存储一对一对的数据(key-value键值对，(x1,y1)、(x2,y2) --> y=f(x),类似于高中的函数)
    |---- HashMap(主要实现类)、LinkedHashMap、TreeMap、Hashtable、Properties
4. 学习的程度把握：
层次1：针对于具体特点的多个数据，知道选择相应的适合的接口的主要实现类，会实例化，会调用常用的方法。
层次2：区分接口中不同的实现类的区别。
*****************
层次3：① 针对于常用的实现类，需要熟悉底层的源码 ② 熟悉常见的数据结构 （第14章讲）
 */
public class IntroTest {
}