package java2;

import org.junit.Test;

/*
包装类的使用
1. 为什么要使用包装类？
为了使得基本数据类型的变量具备引用数据类型变量的相关特征（比如：封装性、继承性、多态性），
我们给各个基本数据类型的变量都提供了对应的包装类。
2. (掌握)基本数据类型对应的包装类类型
byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double ->Double

char -> Character
boolean -> Boolean
3. 掌握基本数据类型 与 包装类之间的转换。
   3.1 为什么需要转换
     > 一方面，在有些场景下，需要使用基本数据类型对应的包装类的对象。此时就需要将基本数据类型的变量转换为
       包装类的对象。比如：ArrayList的add(Object obj);Object类的equals(Object obj)
     > 对于包装类来讲，既然我们使用的是对象，那么对象是不能进行+ - * /等运算的。为了能够进行这些运算，就
       需要将包装类的对象转换为基本数据类型的变量。
   3.2 如何转换：
        （装箱）基本数据类型 ---> 包装类：
          ① 使用包装类的构造器
          ② （建议）调用包装类的valueOf(xxx xx)
        （拆箱）包装类 ---> 基本数据类型：调用包装类的xxxValue()
    注意：原来使用基本数据类型变量的位置，改成包装类以后，对于成员变量来说，其默认值变化了！
    jdk5.0新特性：自动装箱、自动拆箱。
4. String 与 基本数据类型、包装类之间的转换。
   基本数据类型、包装类 ---> String类型：
    ① 调用String的重载的静态方法valueOf(xxx xx) ;
    ② 基本数据类型的变量 + ""
   String类型 ---> 基本数据类型、包装类: 调用包装类的静态方法：parseXxx()
 */
public class WrapperTest {
  @Test
  public void test() {
    //基本数据类型-->包装类
    int i1 = 10;
    //@SuppressWarnings("all")
    Integer i2 = new Integer(i1);
    System.out.println(i2.toString());

    float f1 = 12.2f;
    Float f2 = new Float(f1);
    System.out.println(f2);

    boolean b1 = true;
    Boolean b2 = new Boolean(b1);
    System.out.println(b2);

    Boolean b3 = new Boolean("flase");
    System.out.println(b3);

    System.out.println(new Boolean("true"));//true
    System.out.println(new Boolean("ssfdsf"));//false
  }

  @Test
  public void test1(){
    //基本数据类型-->包装类valueOf
    System.out.println(Integer.valueOf(10));
    Boolean.valueOf(true);
    Float.valueOf(12.3f);
  }
  @Test
  public void test2(){
    //包装类-->基本数据类型-->xxxValue
    Integer.valueOf(10).intValue();
    Double.valueOf(12.2).doubleValue();
    Boolean.valueOf(true).booleanValue();
  }
  @Test
  public void test3(){
    System.out.println(new Account().f2);
  }
  @Test
  public void test4(){
    //自动装箱
    Integer i1 = 10;
    Double d1 = 12.2 + 1;
    Float f1 = 12.3F;
    Boolean b1 = true;
  }
  @Test
  public void test5(){
    //自动拆箱
    Integer i1 = 10;
    int i2 = i1;
    System.out.println(i2 + 1);

    boolean b1 = Boolean.valueOf(false);
    double d1 = Double.valueOf(12.2);
    char c1 = Character.valueOf('a');
    System.out.println(c1);
  }
}
class Account{
  boolean f;
  Boolean f2;
}








































