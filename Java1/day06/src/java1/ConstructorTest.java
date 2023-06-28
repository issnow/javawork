package java1;

/*
构造器
java给我们提供了构造器（Constructor)，也称为构造方法。
1.构造器的作用
  new对象，并在new对象的时候为实例变量赋值。
  举例：Person p = new Person(“Peter”,15);
2.构造器的语法格式
  [修饰符] class 类名{
    [修饰符] 构造器名(){ // 实例初始化代码 }
    [修饰符] 构造器名(参数列表){ // 实例初始化代码 }
  }
  说明：
  1. 构造器名必须与它所在的类名必须相同。
  2. 它没有返回值，所以不需要返回值类型，也不需要 void 。
  3. 构造器的修饰符只能是权限修饰符，不能被其他任何修饰。比如，不能被 static 、
  final 、 synchronized 、 abstract 、 native 修饰，不能有 return 语句返回值。
3.使用说明
  1.当我们没有显式的声明类中的构造器时，系统会默认提供一个无参的构造器并且该构造
  器的修饰符默认与类的修饰符相同
  2.当我们显式的定义类的构造器以后，系统就不再提供默认的无参的构造器了。
  3.在类中，至少会存在一个构造器。
  4.构造器是可以重载的。
 */
public class ConstructorTest {
  public static void main(String[] args) {
    //Person p = new Person();
    Person p1 = new Person(1);
  }
}
