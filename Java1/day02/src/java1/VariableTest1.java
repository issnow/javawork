package java1;
/*
1、整数类型：byte、short、int、long
  Java 各整数类型有固定的表数范围和字段长度，不受具体 OS 的影响，以保证 java 程序的可移植性。
  java 的整型常量默认为 int 型，声明 long 型常量须后加‘l’或‘L’
  java 程序中变量通常声明为 int 型，除非不足以表示较大的数，才使用long
  bit: 计算机中的最小存储单位。byte: 计算机中基本存储单元。
  类型    占用存储空间      表数范围
  byte    1字节=8bit      -128~127
  short   2字节           -2^15~2^15-1
  int     4字节           -2^31~2^31-1
  long    8字节           -2^63~2^63-1
2、浮点类型：float、double
  与整数类型类似，Java 浮点类型也有固定的表数范围和字段长度，不受具体操作系统的影响。
  浮点型常量有两种表示形式：
      十进制数形式：如：5.12 512.0f .512 ( 必须有小数点）
      科学计数法形式 : 如：5.12e2 512E2 100E-2。
  float: 单精度，尾数可以精确到 7 位有效数字。很多情况下，精度很难满足需求。
  double: 双精度，精度是 float 的两倍。通常采用此类型。
  Java 的浮点型常量默认为 double 型，声明 float 型常量，须后加‘f’或‘F’。
  类型          占用存储空间      表数范围
  单精度float    4字节      -3.403E38~3.403E38
  双精度double   8字节      -1.798E308~1.798E308
  注意:float类型的范围大于long类型的表数范围,但是精度不高
 */
public class VariableTest1 {
  public static void main(String[] args) {
    byte b1 = 12;
    byte b2 = 127;
    //byte b3 = 128;//超出存储范围
    int i1 = 12313123;//常量默认为 int 型
    long l1 = 12313253463l;//声明 long 型常量须后加‘l’或‘L’

    double d1 = 3.1231;//通常使用double类型,因为精度更高
    float f1 = 2.213f;//声明 float 型常量，须后加‘f’或‘F’。

    //测试浮点型精度
    System.out.println(0.1+0.2);
  }
}
