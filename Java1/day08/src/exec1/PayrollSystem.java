package exec1;

import java.util.Arrays;
import java.util.Scanner;

/*
（5）定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
利用循环结构遍历数组元素，输出各个对象的类型,name,number,birthday,以及该对象生日。
当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 */
public class PayrollSystem {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Employee[] arr = new Employee[2];
    arr[0] = new SalariedEmployee("guocheng",101,new MyDate(1993,5,20),10000);
    arr[1] = new HourlyEmployee("郭成",102,new MyDate(1993,7,9),100,40);
    int n = s.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if(n == arr[i].getBirthday().getMonth()) {
        System.out.println("加100");
      }
    }
    System.out.println(Arrays.toString(arr));
    s.close();
  }
}
