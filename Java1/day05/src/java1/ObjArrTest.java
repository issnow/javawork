package java1;

/*
对象数组
数组的元素可以是基本数据类型，也可以是引用数据类型。当元素是引用类型中的类时，我们称为对象数组
下面用一道题解释对象数组-->Student.java
1. 何为对象数组？如何理解？
2. 举例：
3. 案例：
1）定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
2）创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
提示：
1) 生成随机数：Math.random()，返回值类型double;
2) 四舍五入取整：Math.round(double d)，返回值类型long。
年级[1,6] : (int)(Math.random() * 6 + 1)
分数[0,100] : (int)(Math.random() * 101)
4. 内存解析：
5. 拓展：提供封装Student相关操作的工具类
 */
public class ObjArrTest {
  public static void main(String[] args) {
    Student[] arr = new Student[20];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Student();
      arr[i].number = i +1;
      arr[i].state = (int)(Math.random() * 6 + 1);
      arr[i].score = (int)(Math.random() * 101);
      //System.out.println(arr[i].toString());
    }
    //问题一：打印出3年级(state值为3）的学生信息。
    for (int i = 0; i < arr.length; i++) {
      if(arr[i].state == 3){
        System.out.println(arr[i].toString());
      }
    }
    //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
    for (int i = 0; i < arr.length-1; i++) {
      boolean f = true;
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if(arr[j].score > arr[j+1].score) {
          Student tempStud = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = tempStud;
          f  = false;
        }
      }
      if(f){
        break;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i].toString());
    }
  }
}
