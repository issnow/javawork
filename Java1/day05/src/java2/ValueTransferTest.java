package java2;
/*
方法的参数传递机制
形参和实参
形参（formal parameter ））：在定义方法时，方法名后面括号 中声明的变量称为形式参
数，简称形参。
实参（actual parameter 在调用方法时，方法名后面括号 中的使用的值 变量 表达式称
为实际参数，简称实参。

参数传递机制：值传递
Java里方法的参数传递方式只有一种：值传递。 即将实际参数值的副本（复制品）传入方法内，而参数本身不受影响。
形参是基本数据类型：将实参基本数据类型变量的数据值 传递给形参
形参是引用数据类型：将实参引用数据类型变量的地址值 传递给形参
 */
public class ValueTransferTest {
  public static void main(String[] args) {
    //1.基本数据类型
    int m = 10;
    int n = m;
    m++;
    System.out.println(n);
    //2.引用数据类型
    int[] a = new int[2];
    int[] a1 = a;
    a1[1] = 10;
    System.out.println(a[1]);
    //3.对象
    Order o = new Order();
    o.id = 1;
    Order o1 = o;
    System.out.println(o1.id);

  }
}

class Order {
  int id;
}
