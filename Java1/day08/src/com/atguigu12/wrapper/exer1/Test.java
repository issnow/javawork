package com.atguigu12.wrapper.exer1;

import java.util.Scanner;
import java.util.Vector;

/*
利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
而向量类java.util.Vector可以根据需要动态伸缩。
创建Vector对象：Vector v=new Vector();
给向量添加元素：v.addElement(Object obj);   //obj必须是对象
取出向量中的元素：Object  obj=v.elementAt(0);
注意第一个元素的下标是0，返回值是Object类型的。
计算向量的长度：v.size();
若与最高分相差10分内：A等；20分内：B等；30分内：C等；其它：D等
 */
public class Test {
  public static void main(String[] args) {
    Vector v = new Vector();
    System.out.println("请输入学生成绩");
    Scanner s = new Scanner(System.in);
    int i1 = s.nextInt();
    int max = i1;
    while (i1 >0){
      v.addElement(i1);
      i1 = s.nextInt();
      if(max < i1){
        max = i1;
      }
    }
    System.out.println(v.size());
    System.out.println("max =" +max);
    for (int i = 0; i < v.size(); i++) {
      System.out.println(v.elementAt(i));
      int ii2 = (Integer) v.elementAt(i);
    }
    s.close();
  }
}
