package java1;
/*
1. 迭代器(Iterator)的作用？
用来遍历集合元素的。
2. 如何获取迭代器(Iterator)对象？
Iterator iterator = coll.iterator();
3. 如何实现遍历(代码实现)
while(iterator.hasNext()){
    System.out.println(iterator.next()); //next():①指针下移 ② 将下移以后集合位置上的元素返回
    //查不到会报异常-->java.util.NoSuchElementException
}
4. 增强for循环(foreach循环)的使用（jdk5.0新特性）
4.1 作用
用来遍历数组、集合。
4.2 格式：
for(要遍历的集合或数组元素的类型 临时变量 : 要遍历的集合或数组变量){
    操作临时变量的输出
}
4.3 说明：
> 针对于集合来讲，增强for循环的底层仍然使用的是迭代器。
> 增强for循环的执行过程中，是将集合或数组中的元素依次赋值给临时变量，注意，循环体中对临时变量的修改，可能
  不会导致原有集合或数组中元素的修改。
 */
public class IteratorText {
}
