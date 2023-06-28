package java1;

/*
6.2 常用方法
系列 1 ：常用方法,下面的全是实例方法
(1)boolean isEmpty()：字符串是否为空
(2)int length()：返回字符串的长度
(3)String concat(xx)：拼接
(4)boolean equals(Object obj)：比较字符串是否相等，区分大小写
(5)boolean equalsIgnoreCase(Object obj)：比较字符串是否相等，不区分大小写
(6)int compareTo(String other)：负数比参数小,正数比参数大,0相等
    比较字符串大小，区分大小写，按照Unicode编码值比较大小
(7)int compareToIgnoreCase(String other)：比较字符串大小，不区分大小写
(8)String toLowerCase()：将字符串中大写字母转为小写
(9)String toUpperCase()：将字符串中小写字母转为大写
(10)String trim()：去掉字符串前后空白符
(11)public String intern()：结果在常量池中共享
系列 2 ：查找
(11)boolean contains(xx)：是否包含xx
(12)int indexOf(xx)：从前往后找当前字符串中xx，即如果有返回第一次出现的下标，要是没有返回-1
(13)int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，
    从指定的索引开始
(14)int lastIndexOf(xx)：从后往前找当前字符串中xx，即如果有返回最后一次出现的下标，要是没有返回-1
(15)int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，
    从指定的索引开始反向搜索。
系列 3 ：字符串截取
(16)String substring(int beginIndex) ：返回一个新的字符串，它是此字符串的从beginIndex开始截取到
    最后的一个子字符串。
(17)String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开
    始截取到endIndex(不包含)的一个子字符串。
系列 4 ：和字符 字符数组相关
(18)char charAt(index)：返回[index]位置的字符
(19)char[] toCharArray()： 将此字符串转换为一个新的字符数组返回
(20)static String valueOf(char[] data) ：返回指定数组中表示该字符序列的 String
(21)static String valueOf(char[] data, int offset, int count) ： 返回指定数组中表示该字符序列的 String
(22)static String copyValueOf(char[] data)： 返回指定数组中表示该字符序列的 String
(23)static String copyValueOf(char[] data, int offset, int count)：返回指定数组中表示该字符序列的 String
系列 5 ：开头与结尾
(24)boolean startsWith(xx)：测试此字符串是否以指定的前缀开始
(25)boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
(26)boolean endsWith(xx)：测试此字符串是否以指定的后缀结束
系列 6 ：替换
(27)String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中
    出现的所有 oldChar 得到的。 不支持正则。
(28)String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串
    所有匹配字面值目标序列的子字符串。
(29)String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所有匹配给定
    的正则表达式的子字符串。
(30)String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的
    正则表达式的第一个子字符串。
7. String的算法练习
 */
public class StringApiTest {
  public static void main(String[] args) {

  }
}
