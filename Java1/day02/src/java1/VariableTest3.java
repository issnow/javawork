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
  说明：此时容量大小指的是，表示数的范围的大和小。比如：float 容
  量要大于 long 的容量。
注意:
1.有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，
然后再进行计算。
2.boolean 类型不能与其它数据类型运算。
3.当把任何基本数据类型的值和字符串 (String) 进行连接运算时 (+)，基本数据类型的值
将自动转化为字符串 (String) 类型。
 */
public class VariableTest3 {
  public static void main(String[] args) {
    int i1 = 10;
    int i2 = i1;
    long l1 = i1;
    float f1 = 11;
    System.out.println(l1);

    byte b1 = 12;
    int i3 = i1 +b1;

    //byte b2 = b1 +i1;//编译不通过

    //-----------------------------
    //特殊的1:byte和short做运算
    byte b3  =12;
    short s1 = 10;
    int i4 = b3 +s1;//byte类型和short做运算使用int接受
    byte b4 = 10;

    //报错
    //byte b5 = b3+b4;
    int i5 = b3+b4;//byte类型和byte做运算使用int接受

    //特殊的2:char
    char c1 = 'a';
    int i6 = c1+b3;//char类型和byte做运算使用int接受
    System.out.println(i6);//109, a-->97

    //----------------------------------------------------------
    //练习1
    long l2 = 123l;//值确实是long类型
    long l3 = 123;//理解为自动类型提升,int-->long,long声明变量不使用l,默认int类型
    //long l4 = 1231231231321;//1231231231321理解为int类型,因为超出int范围,所以报错
    long l4 = 1231231231321l;//此时的值才是long类型

    //练习2:小数不写f默认double类型
    float f2 = 12.2f;
    //float f3 = 12.3;//不满足自动类型提升的规则(double-->float),报错

    //练习3
    //规定1:整型变量，默认类型为 int 型
    //规定2:浮点型变量，默认类型为 double 型
    byte b5 = 10;
    int i7 = b5+1;
    double d2 = b5+12.2;
  }
}
