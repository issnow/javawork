package java1;
/*
1、什么是标识符（Identifier）
  Java 对各种变量、方法和类等要素命名时使用的字符序列称为标识符
  技巧：凡是自己可以起名字的地方都叫标识符。
2、定义合法标识符规则【重要】
  1. 由 26 个英文字母大小写，0-9，_ 或 $ 组成
  2. 数字不可以开头。
  3. 标识符不能包含空格。
  4. 不可以使用关键字和保留字，但能包含关键字和保留字。
  5. Java 中严格区分大小写，长度无限制。
3、Java 中的名称命名规范
  1、Java 中的名称命名规范：
  包名：多单词组成时所有字母都小写：xxxyyyzzz
  类 名、 接 口 名： 多 单 词 组 成 时，** 所 有 单 词 的 首 字 母 大 写：**XxxYyyZzz
  变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
  常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ
  2、注意点
  注意 1：在起名字时，为了提高阅读性，要尽量有意义，“见名知意”。
  注意 2：java 采用 unicode 字符集，因此标识符也可以使用汉字声明，但是不建议使用。
 */
public class IdentifierTest {
  public static void main(String[] args) {
    int a = 10;
    System.out.println(a);
    int YEAR = 2023;
    _fn();
  }
  public static void _fn(){
    System.out.println("abc");
  }
}
