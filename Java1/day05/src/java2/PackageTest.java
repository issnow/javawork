package java2;
/*
package 包
package，称为包，用于指明该文件中定义的类、接口等结构所在的包。
语法格式
package 顶层包名.子包名;
1.说明：
• 一个源文件只能有一个声明包的 package 语句
• package 语句作为 Java 源文件的第一条语句出现。若缺省该语句，则指定为无名包。
• 包名，属于标识符，满足标识符命名的规则和规范（全部小写）、见名知意
  – 包通常使用所在公司域名的倒置： com.atguigu.xxx 。
  – 大家取包名时不要使用 java.xx 包
• 包对应于文件系统的目录， package 语句中用 “.” 来指明包 目录 的层次，每 一次就
表示一层文件目录。
• 同一个包下可以声明多个结构（类、接口），但是不能定义同名的结构（类、接口）。
不同的包下可以定义同名的结构（类、接口）
2.包的作用:
• 包可以包含类和子包，划分 项目层次，便于管理
• 帮助 管理大型软件系统：将功能相近的类划分到同一个包中。比如： MVC 的设计模式
• 解决 类命名冲突的问题
• 控制 访问权限
3.JDK中主要的包介绍
  java.lang----包含一些Java语言的核心类，如String、Math、Integer、 System和Thread，提供常用功能
  java.net----包含执行与网络相关的操作的类和接口。
  java.io ----包含能提供多种输入/输出功能的类。
  java.util----包含一些实用工具类，如定义系统特性、接口的集合框架类、使用与日期日历相关的函数。
  java.text----包含了一些java格式化相关的类
  java.sql----包含了java进行JDBC数据库编程的相关类/接口
  java.awt----包含了构成抽象窗口工具集（abstract window toolkits）的多个类，这些类被用来构建和管理应用程序的图形用户界面(GUI)。
 */
public class PackageTest {
}
