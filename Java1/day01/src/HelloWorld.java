/*
1、步骤：
2、第一个 Java 程序
3、通过 javac 命令对该 java 文件进行编译。
  --> javac HelloWorld.java
4、通过 java 命令对生成的 class 文件进行运行。
  --> java HelloWorld

  将 Java 代码编写到扩展名为 .java 的文件中。
  选择最简单的编辑器：记事本。
  敲入代码 class Test{} 将文件保存成 Test.java，这个文件是存放 java 代
  码的文件，称为源文件。
  有了 java 源文件，通过编译器将其编译成 JVM 可以识别的字节码文件。
  在该源文件目录下，通过 javac 编译工具对 Test.java 文件进行编译。
  如果程序没有错误，没有任何提示，但在当前目录下会出现一个 Test.
  class 文件，该文件称为字节码文件，也是可以执行的 java 的程序。
  有了可执行的 java 程序 (Test.class 字节码文件 )
  通过运行工具 java.exe 对字节码文件进行执行。
 */
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("姓名:康师傅");
    System.out.println("");//换行
    System.out.println("性别:男");
    System.out.println("年龄:32");
  }
}
