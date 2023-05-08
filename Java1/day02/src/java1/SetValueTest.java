package java1;
/*
运算符2:赋值运算符
符号：=
  – 当 两侧数据类型不一致时，可以使用自动类型转换或使用强制类型转换
  原则进行处理。
  – 支持 连续赋值。
扩展赋值运算符
  += -= *= /= %=
  +=
  将符号左边的值和右边的值进行相加操作，最后将结果赋值给左边的变量
  -=
  将符号左边的值和右边的值进行相减操作，最后将结果赋值给左边的变量
  *=
  将符号左边的值和右边的值进行相乘操作，最后将结果赋值给左边的变量
  /=
  将符号左边的值和右边的值进行相除操作，最后将结果赋值给左边的变量
  %=
  将符号左边的值和右边的值进行取余操作，最后将结果赋值给左边的变量

 */
public class SetValueTest {
  public static void main(String[] args) {
    int i = 5;
    System.out.println(i);
    long l = 10;//自动类型提升

    byte b = (byte) i;

    //连续赋值
    int a = b = 10;
    System.out.println(a);
    System.out.println(b);

    int a1 = 10,b2 = 20;

    byte b1 = 10;
    b1+= 5;//与b1 = b1+5;不一样
    System.out.println(b1);
    byte b3 = 10;
    b3= (byte)(b3 + 5);
    System.out.println(b3);

    int m2 = 1;
    m2*= 0.1;
    System.out.println(m2);//0

    int i4 = 19;
    i4+= 2;
  }
}
