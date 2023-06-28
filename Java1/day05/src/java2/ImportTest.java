package java2;

//import java.util.Arrays;
//import java.util.Scanner;

import java1.Person;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import static java.lang.System.out;

/*
import(导入)
为了使用定义在其它包中的Java类，需用import语句来显式引入指定包下所需要的类。
相当于import语句告诉编译器到哪里去寻找这个类。
1.语法格式:
  import 包名.类名;
2.注意事项
• import 语句，声明在包的声明和类的声明之间。
• 如果需要导入多个类或接口，那么就并列显式多个 import 语句即可
• 如果使用 a.*导入结构，表示可以导入 a 包下的所有的结构。举例：可以使用
  java.util.* 的方式，一次性导入 util 包下所有的类或接口。
• 如果导入的类或接口是 java.lang 包下的，或者是当前包下的，则可以省略此 import语句。
• 如果已经导入 java.a 包下的类，那么如果需要使用 a 包的子包下的类的话，仍然需要导入。
• 如果在代码中使用不同包下的同名的类，那么就需要使用类的全类名的方式指明调用的是哪个类。
• (了解) import static组合的使用：调用指定类或接口下的静态的属性或方法
 */
public class ImportTest {
  public static void main(String[] args) {
    //import static java.lang.System.out;
    out.println(Arrays.toString(new int[]{1, 2, 3}));
    Scanner s = new Scanner(System.in);
    HashMap h = new HashMap();
    Person p = new Person();

    //java.util.Date
    Date d = new Date();
    //java.sql.Date
    java.sql.Date d1 = new java.sql.Date(2022);
  }
}
