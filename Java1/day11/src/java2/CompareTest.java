package java2;
/*
1.实现对象的排序，可以考虑两种方法：自然排序 、 定制排序
2. 方式一：实现Comparable接口的方式
实现步骤：
① 具体的类A实现Comparable接口
② 重写Comparable接口中的compareTo(Object obj)方法，在此方法中指明比较类A的对象的大小的标准
③ 创建类A的多个实例，进行大小的比较或排序。
3. 方式二：实现Comparator接口的方式
实现步骤：
① 创建一个实现了Comparator接口的实现类A
② 实现类A要求重写Comparator接口中的抽象方法compare(Object o1,Object o2)，在此方法中指明要
   比较大小的对象的大小关系。（比如，String类、Product类）
③ 创建此实现类A的对象，并将此对象传入到相关方法的参数位置即可。（比如：Arrays.sort(..,类A的实例)）
4. 对比两种方式：
角度一：
    自然排序：单一的，唯一的
    定制排序：灵活的，多样的
角度二：
    自然排序：一劳永逸的
    定制排序：临时的
角度三：细节
    自然排序：对应的接口是Comparable，对应的抽象方法compareTo(Object obj)
    定制排序：对应的接口是Comparator，对应的抽象方法compare(Object obj1,Object obj2)
 */
public class CompareTest {
}
