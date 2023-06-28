package java1;
/*
一、super关键字的使用
1. 为什么需要super？
举例1：子类继承父类以后，对父类的方法进行了重写，那么在子类中，是否还可以对父类中被重写的方法进行调用？
可以！
举例2：子类继承父类以后，发现子类和父类中定义了同名的属性，是否可以在子类中区分两个同名的属性？
可以！
如何调用？ 使用super关键字即可。
2. super的理解：父类的
3. super可以调用的结构：属性、方法、构造器
具体的：
3.1 super调用属性、方法
子类继承父类以后，我们就可以在子类的方法或构造器中，调用父类中声明的属性或方法。（满足封装性的前提下）
如何调用呢？需要使用"super."的结构，表示调用父类的属性或方法。
一般情况下，我们可以考虑省略"super."的结构。但是，如果出现子类重写了父类的方法或子父类中出现了同名的属性时，
则必须使用"super."的声明，显式的调用父类被重写的方法或父类中声明的同名的属性。
3.2 super调用构造器
① 子类继承父类时，不会继承父类的构造器。只能通过“super(形参列表)”的方式调用父类指定的构造器。
② 规定：“super(形参列表)”，必须声明在构造器的首行。
③ 我们前面讲过，在构造器的首行可以使用"this(形参列表)"，调用本类中重载的构造器，
   结合②，结论：在构造器的首行，"this(形参列表)" 和 "super(形参列表)"只能二选一。
④ 如果在子类构造器的首行既没有显示调用"this(形参列表)"，也没有显式调用"super(形参列表)"，
  则子类此构造器默认调用"super()"，即调用父类中空参的构造器。
⑤ 由③和④得到结论：子类的任何一个构造器中，要么会调用本类中重载的构造器，要么会调用父类的构造器。
     只能是这两种情况之一。
⑥ 由⑤得到：一个类中声明有n个构造器，最多有n-1个构造器中使用了"this(形参列表)"，
   则剩下的那个一定使用"super(形参列表)"。
--> 我们在通过子类的构造器创建对象时，一定在调用子类构造器的过程中，直接或间接的调用到父类的构造器。
也正因为调用过父类的构造器，我们才会将父类中声明的属性或方法加载到内存中，供子类对象使用。
二、子类对象实例化全过程
代码举例：
class Creature{ //生物类
    //声明属性、方法、构造器
}
class Animal extends Creature{ //动物类
}
class Dog extends Animal{ //狗类
}
class DogTest{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.xxx();
        dog.yyy = ...;
    }
}
1. 从结果的角度来看：体现为类的继承性
当我们创建子类对象后，子类对象就获取了其父类中声明的所有的属性和方法，在权限允许的情况下，可以直接调用。
2. 从过程的角度来看：
当我们通过子类的构造器创建对象时，子类的构造器一定会直接或间接的调用到其父类的构造器，而其父类的构造器
同样会直接或间接的调用到其父类的父类的构造器，....，直到调用了Object类中的构造器为止。
正因为我们调用过子类所有的父类的构造器，所以我们就会将父类中声明的属性、方法加载到内存中，供子类的对象使用。
问题：在创建子类对象的过程中，一定会调用父类中的构造器吗？ yes!
3. 问题：创建子类的对象时，内存中到底有几个对象？
  就只有一个对象！即为当前new后面构造器对应的类的对象。
 */

public class SuperTest {
  public static void main(String[] args) {
    //S s = new S();
    //s.show();
    //s.show2();
    S s1 = new S(1,2);


  }
}
class F{
  int id = 1;//身份证

  public F() {
    System.out.println("f...");
  }

  public F(int id) {
    this.id = id;
  }

  public void eat(){
    System.out.println("eat");
  }
  public void doSport(){
    System.out.println("play sport");
  }
}
class S extends F{
  int id = 2;//学号
  int age;

  public S() {
    //super();
    System.out.println("s..");
  }

  public S(int id, int age) {
    this.id = id;
    this.age = age;
  }

  @Override
  public void eat() {
    System.out.println("s eat");
  }
  public void show(){
    eat();
    super.eat();
    doSport();//-->this.doSport();
    this.doSport();//-->相当于super.doSport();
    super.doSport();
  }
  public void show2(){
    System.out.println(id);//2-->相当于this.id
    System.out.println(super.id);//1
    System.out.println(age);
  }
}