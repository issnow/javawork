package java1;

import java.util.List;

/*
1. 类SuperA是类A的父类，则G<SuperA> 与 G<A>的关系：G<SuperA> 和 G<A>是并列的两个类，没有任何子父类的关系。
比如：ArrayList<Object> 、ArrayList<String>没有关系
2. 类SuperA是类A的父类或接口，SuperA<G> 与 A<G>的关系：SuperA<G> 与A<G> 有继承或实现的关系。
即A<G>的实例可以赋值给SuperA<G>类型的引用（或变量）
比如：List<String> 与 ArrayList<String>

1. 通配符: ?
2. 使用说明：
> 举例：ArrayList<?>
> G<?> 可以看做是G<A>类型的父类，即可以将G<A>的对象赋值给G<?>类型的引用（或变量）
3. 读写数据的特点(以集合ArrayList<?>为例说明)
> 读取数据：允许的，读取的值的类型为Object类型
> 写入数据：不允许的。特例：写入null值。
4. 有限制条件的通配符
   List<? extends A> : 可以将List<A>或List<B>赋值给List<? extends A>。其中B类是A类的子类。
   List <? super A> :可以将List<A>或List<B>赋值给List<? extends A>。其中B类是A类的父类。
5. 有限制条件的统配符的读写操作（难、了解）
技巧：开发中，遇到了带限制条件的通配符，在赋值时，如果没报错，那就正常使用。
     如果报错了，知道不能这样写。改改！
 */
public class DAO<T> {
  //增
  public void insert(T bean) {
    //存入sql中
  }
  //删
  public T del(int id) {
    return null;
  }
  //改
  public T update(int id) {
    return null;
  }
  //查
  public T get(int id) {
    return null;
  }
  public List<T> getMore(int id) {
    return null;
  }

  //泛型方法
  public <E> E getVal(String sql) {
    return null;
  }
}
