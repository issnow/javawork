package java1;

import org.junit.Test;

/*
1. String类的理解(以JDK8为例说明)
1.1 类的声明
public final class String
    implements java.io.Serializable, Comparable<String>, CharSequence
> final:String是不可被继承的
> Serializable:可序列化的接口。凡是实现此接口的类的对象就可以通过网络或本地流进行数据的传输。
> Comparable:凡是实现此接口的类，其对象都可以比较大小。
1.2 内部声明的属性：
jdk8中：
private final char value[]; //存储字符串数据的容器
    > final : 指明此value数组一旦初始化，其地址就不可变。
jdk9开始：为了节省内存空间，做了优化
private final byte[] value; //存储字符串数据的容器。
2. 字符串常量的存储位置;
> 字符串常量都存储在字符串常量池(StringTable)中
> 字符串常量池不允许存放两个相同的字符串常量。
> 字符串常量池，在不同的jdk版本中，存放位置不同。
  jdk7之前：字符串常量池存放在方法区
  jdk7及之后：字符串常量池存放在堆空间。
3. String的不可变性的理解
① 当对字符串变量重新赋值时，需要重新指定一个字符串常量的位置进行赋值，不能在原有的位置修改
② 当对现有的字符串进行拼接操作时，需要重新开辟空间保存拼接以后的字符串，不能在原有的位置修改
③ 当调用字符串的replace()替换现有的某个字符时，需要重新开辟空间保存修改以后的字符串，不能在原有的位置修改
4. String实例化的两种方式
第1种方式：String s1 = "hello";
第2种方式：String s2 = new String("hello");
【面试题】
String s2 = new String("hello");在内存中创建了几个对象？ 两个！
一个是堆空间中new的对象。另一个是在字符串常量池中生成的字面量。
5. String的连接操作:+
情况1：常量 + 常量: 结果仍然存储在字符串常量池中，返回此字面量的地址。注：此时的常量可能是字面量，也可能是final修饰的常量
情况2：常量 + 变量  或  变量 + 变量 ：都会通过new的方式创建一个新的字符串，返回堆空间中此字符串对象的地址
情况3：调用字符串的intern():返回的是字符串常量池中字面量的地址
(了解)情况4：concat(xxx):不管是常量调用此方法，还是变量调用，同样不管参数是常量还是变量，总之，调用完concat()方法
都返回一个新new的对象。
6. String的构造器和常用方法
6.1 构造器
* `public String() ` ：初始化新创建的 String对象，以使其表示空字符序列。
* `public String(String original)`： 初始化一个新创建的 `String` 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
* `public String(char[] value) ` ：通过当前参数中的字符数组来构造新的String。
* `public String(char[] value,int offset, int count) ` ：通过字符数组的一部分来构造新的String。
* `public String(byte[] bytes) ` ：通过使用平台的**默认字符集**解码当前参数中的字节数组来构造新的String。
* `public String(byte[] bytes,String charsetName) ` ：通过使用指定的字符集解码当前参数中的字节数组来构造新的String。
 */
public class StringTest {
  @Test
  public void test6(){
    String s = "  ab c ";
    System.out.println("-" + s.trim() + "-");
    String s1 = "ab";
    String s2 = s1.intern();
    System.out.println(s1 == s2);
  }
  @Test
  public void test5(){
    String s1 = "a";
    String s2 = s1.concat("b");
    String s3 = "a";
    String s4 = "A";
    String s5 = "b";
    System.out.println(s2);
    System.out.println(s1.equals(s3));
    System.out.println(s1.equalsIgnoreCase(s4));
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.compareToIgnoreCase(s4));

    System.out.println(s1.compareTo(s5));
  }
  @Test
  public void test4(){
    String s1 = "";
    String s5 = "12";
    String s2 = new String();
    String s3 = new String("");
    String s4 = new String("123");
    System.out.println(s1.isEmpty());
    System.out.println(s2.isEmpty());
    System.out.println(s3.isEmpty());
    System.out.println(s4.isEmpty());
    System.out.println(s5.isEmpty());

    System.out.println(s1.length());
    System.out.println(s3.length());
    System.out.println(s4.length());
    System.out.println(s5.length());

  }
  public static void main(String[] args) {
    String s = "hello";//字面量的定义方式
    String s1 = "hello";
    System.out.println(s1 == s1);
  }
  @Test
  public void test1(){
    String s1 = "hello";
    String s2 = "hello2";
    s2 = "ho";
    System.out.println(s1);
  }
  @Test
  public void test2(){
    String s1 = "a";
    String s2 = "a";
    s2+= "b";
    System.out.println(s1);//a
    System.out.println(s2);//ab
  }
  @Test
  public void test3(){
    String s = "aba";
    String s1 = "aba";
    String s2 = s.replace("a", "c");
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s2);
  }
}
