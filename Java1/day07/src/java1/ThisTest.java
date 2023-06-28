package java1;
/*
1.this是什么？
  在Java 中， this 关键字不算难理解，它的作用和其词义很接近。
  – 它在方法（准确的说是实例方法或非 static 的方法）内部使用，表示调用
  该方法的对象
  – 它在构造器内部使用，表示该构造器正在初始化的对象。
  this可 以调用的结构：成员变量、方法和构造器
2.什么时候使用 this
  • 实例方法或构造器中使用当前对象的成员
    我们可以用this来区分成员变量和局部变量
    另外，使用this访问属性和方法时，如果在本类中未找到，会从父类中查找。
  • 同一个类中构造器互相调用this
    this可以作为一个类中构造器相互调用的特殊格式。
    this()：调用本类的无参构造器
    this(实参列表)：调用本类的有参构造器
3.注意：
  • 不能出现递归调用。比如，调用自身构造器。
    – 推论：如果一个类中声明了 n 个构造器，则最多有 n-1 个构造器中使用了 this(形参列表/无参)
  • this() 和 this(实参列表) 只能声明在构造器首行。
    – 推论：在类的一个构造器中，最多只能声明一个 this(参数列表)
 */
public class ThisTest {
  String name;
  int age;
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return age;
  }
  public void setName(String name){
    this.name = name;
  }
}

class User {
  public static void main(String[] args) {
    User u = new User();
    User u1 = new User(12);
    System.out.println(u1.toString());
  }
  int age;
  String name;
  public User(){
    System.out.println("xxx");
  }
  public User(int age){
    this();
    this.age = age;
  }

  public User(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
            "age=" + age +
            ", name='" + name + '\'' +
            '}';
  }
}
