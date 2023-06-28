package java1;
/*
1. List接口中存储数据的特点：用于存储有序的、可以重复的数据。---> 使用List替代数组，"动态"数组
2. List中的常用方法：
第1波：Collection中声明的15个方法。
第2波：因为List是有序的，进而就有索引，进而就会增加一些针对索引操作的方法。
- 插入元素
  - `void add(int index, Object ele)`:在index位置插入ele元素
  - boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
- 获取元素
  - `Object get(int index)`:获取指定index位置的元素
  - List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合
- 获取元素索引
  - int indexOf(Object obj):返回obj在集合中首次出现的位置
  - int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
- 删除和替换元素
  - `Object remove(int index)`:移除指定index位置的元素，并返回此元素
  - `Object set(int index, Object ele)`:设置指定index位置的元素为ele
小结：
    增
        boolean add(Object obj)
        boolean addAll(Collection coll)
    删
        boolean remove(Object obj)
        Object remove(int index)
    改
        Object set(int index, Object ele)
    查
        Object get(int index)
    插
        void add(int index, Object ele)
        boolean addAll(int index, Collection eles)
    长度
        int size()
    遍历
        Iterator<E> iterator() ：使用迭代器进行遍历
        增强for循环
        一般的for循环
3. List及其实现类特点
java.util.Collection:存储一个一个的数据
    |-----子接口：List:存储有序的、可重复的数据 ("动态"数组)
           |---- ArrayList:List的主要实现类；线程不安全的、效率高；底层使用Object[]数组存储
                           在添加数据、查找数据时，效率较高；在插入、删除数据时，效率较低
           |---- LinkedList:底层使用双向链表的方式进行存储；在对集合中的数据进行频繁的删除、插入操作时，建议使用此类
                           在插入、删除数据时，效率较高；在添加数据、查找数据时，效率较低；
           |---- Vector:List的古老实现类；线程安全的、效率低；底层使用Object[]数组存储
[面试题] ArrayList、Vector的区别？  ArrayList、LinkedList的区别？
 */
public class ListText {
}
