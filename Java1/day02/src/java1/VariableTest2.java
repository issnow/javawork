package java1;
/*
3、字符类型：char
  char 型数据用来表示通常意义上“字符”(2 字节 )。
  Java 中的所有字符都使用 Unicode 编码，故一个字符可以存储一个字母，一个汉字，或其他书面语的一个字符。
  字符型变量的三种表现形式：
    -字符常量是用单引号 (‘ ’) 括起来的单个字符。
      例如：char c1 = ‘a’; char c2 = ‘中’; char c3 = ‘9’;
    -Java中还允许使用转义字符‘\’来将其后的字符转变为特殊字符型常量。
      例如：char c3 = ‘\n’; //’\n’表示换行符。
    -直 接 使 用 Unicode 值 来 表 示 字 符 型 常 量：/uxxxx。
    其 中，XXXX 代表一个十六进制整数。如：\u000a 表示 \n。
  char 类型是可以进行运算的。因为它都对应有 Unicode 码。
4、布尔类型：boolean
  boolean 类型用来判断逻辑条件，一般用于程序流程控制：
		if 条件控制语句；
		while 循环控制语句；
		do-while 循环控制语句；
		for 循环控制语句；
  boolean 类型数据只允许取值 true 和 false，无 null。
  不可以使用 0 或非 0 的整数替代 false 和 true，这点和 C 语言不同。
  Java 虚拟机中没有任何供 boolean 值专用的字节码指令，Java 语言表达
  所操作的 boolean 值，在编译之后都使用 java 虚拟机中的 int 数据类型来代替：
  true 用 1 表示，false 用 0 表示。———《java 虚拟机规范 8 版》
 */
public class VariableTest2 {
  public static void main(String[] args) {
    //1.字符类型:char(2字节)
    //形式1:使用一对''表示,有且仅有一个字符
    char c1 = 'a';
    char c3 = '种';
    char c4 = '1';
    char c5 = '&';
    System.out.println(c1);//a
    //形式2:直接使用Unicode值来表示字符型常量：/u0023
    char c6 = '\u0023';
    System.out.println(c6);//#
    //形式3:使用转义字符‘\’来将其后的字符转变为特殊字符型常量
    char c9 = '\n';
    char c10 = '\t';
    System.out.println("hesf" +c10+"sdfsdf");
    //形式4:使用数字(ASCII码)
    char c11 = 97;
    char c12 = 65;
    System.out.println(c11);//a
    System.out.println(c12);//A

    //2.布尔类型:boolean
    //只有两个值:true和false
    boolean b1 = true;
    boolean b2 = false;
    System.out.println(b1);
    //用于流程控制和判断
    if(true){
      System.out.println("true");
    }
  }
}
