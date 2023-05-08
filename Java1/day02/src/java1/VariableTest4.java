package java1;
/*
基本数据类型转换
基本数据类型之间的运算规则：
前提：这里讨论只是 7 中基本数据类型变量的运算。不包含 boolean 类型的
1. 自动类型提升：
  当容量小的数据类型的变量和容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
  char、byte、short-->int-->long-->float-->double
  特别的：当 byte、char、short 三种类型的变量做运算时，结果为 int 类型。
2. 强制类型转换：
  自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符：()，
  但可能造成精度降低或溢出 , 格外要注意。
  通常，字符串不能直接转换为基本类型，但通过基本类型对应的包装类则可以实现把字符串转换成基本类型。
  如：String a = “43”; inti= Integer.parseInt(a);
  boolean 类型不可以转换为其它的数据类型。

  说明：此时容量大小指的是，表示数的范围的大和小。比如：float 容
  量要大于 long 的容量。
注意:
1.有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，
然后再进行计算。
2.boolean 类型不能与其它数据类型运算。
3.当把任何基本数据类型的值和字符串 (String) 进行连接运算时 (+)，基本数据类型的值
将自动转化为字符串 (String) 类型。
 */
public class VariableTest4 {
  public static void main(String[] args) {
    double d1 = 12;//自动类型提升
    //int i0 = d1;//报错
    int i1 = (int)d1;
    System.out.println(i1);

    long l1 = 123;
    //short s1 = l1;//报错
    short s2 = (short)l1;
    System.out.println(s2);



    //练习
    int i3 = 12;
    float f1 = i3;//自动类型提升
    System.out.println(f1);//12.0
    float f2 = (float) i3;//编译可以通过,只不过可以省略()而已
    System.out.println(f2);

    //精度丢失1
    double d2 = 12.2;
    int i4 = (int)d2;
    System.out.println(i4);//12-->原理:截断

    //精度丢失2
    int i2 = 128;
    byte b1 = (byte) i2;
    System.out.println(b1);//-128


    //实际开发举例
    byte b2 = 12;
    fn(b2);
    long l3 = 123;
    fn((int)l3);//形参是int类型,此时long类型传进去,需要强制类型转换

  }
  public static void fn(int n){//自动类型提升
    System.out.println(n);
  }
}
