package java2;

import java.util.Arrays;

/*
可变个数的形参
当定义一个方法时，形参的类型可以确定，但是形参的个数不确定，那么可以考虑使用可变个数的形参。
格式：
方法名(参数的类型名 ...参数名)
特点：
1.可变参数：方法参数部分指定类型的参数个数是可变多个：0 个， 1 个或多个
2.可变个数形参的方法与同名的方法之间，彼此构成重载
3.当有两个方法,一个是可变参数,一个是同类型数组,二者不能同时声明，否则报错.
4.方法的参数部分有可变形参，需要放在形参声明的最后
5.在一个方法的形参中，最多只能声明一个可变个数的形参
 */
public class ArgsTest {
  public static void main(String[] args) {
    ArgsTest a = new ArgsTest();
    a.print(1,2,3);
    a.print();
    a.print(new int[]{12,2,3});
  }
  public void print(int ...args){
    System.out.println(Arrays.toString(args));
  }
  //报错,不能在定义形参为数组的参数了
  //public void print(int[] nums){
  //  System.out.println("sdf");
  //}
  public void print(){
    System.out.println("===");
  }
  public void print(int a){
    System.out.println(a);
  }
  public void print(int a, int b){
    System.out.println(a + b);
  }
}
