package java1;
/*
1. 三个类的对比:String、StringBuffer、StringBuilder
> String:不可变的字符序列;底层使用char[] (jdk8及之前)，底层使用byte[] (jdk9及之后)
> StringBuffer:可变的字符序列;JDK1.0声明，线程安全的，效率低;底层使用char[] (jdk8及之前)，底层使用byte[] (jdk9及之后)
> StringBuilder:可变的字符序列;JDK5.0声明，线程不安全的,效率高;底层使用char[] (jdk8及之前)，底层使用byte[] (jdk9及之后)
2. StringBuffer/StringBuilder的可变性分析(源码分析)：
回顾：
String s1 = new String(); //char[] value = new char[0];
String s2 = new String("abc");// char[] value = new char[]{'a','b','c'};
针对于StringBuilder来说：
内部的属性有：
    char[] value; //存储字符序列
    int count; //实际存储的字符的个数
StringBuilder sBuffer1 = new StringBuilder();//char[] value = new char[16];
StringBuilder sBuffer1 = new StringBuilder("abc"); //char[] value = new char[16 + "abc".length()];
sBuffer1.append("ac");//value[0] = 'a'; value[1] = 'c';
sBuffer1.append("b");//value[2] = 'b';
...不断的添加，一旦count要超过value.length时，就需要扩容：默认扩容为原有容量的2倍+2。
并将原有value数组中的元素复制到新的数组中。
3. 源码启示：
> 如果开发中需要频繁的针对于字符串进行增、删、改等操作，建议使用StringBuffer或StringBuilder替换String.
  因为使用String效率低。
> 如果开发中，不涉及到线程安全问题，建议使用StringBuilder替换StringBuffer。因为使用StringBuilder效率高
> 如果开发中大体确定要操作的字符的个数，建议使用带int capacity参数的构造器。因为可以避免底层多次扩容操作，性能更高。
4. StringBuffer和StringBuilder中的常用方法
增：
    append(String xx)
删：
    delete(int start, int end)
    deleteCharAt(int index)
改：
    replace(int start, int end, String str)
    setCharAt(int index, char c)
查：
    charAt(int index)
插：
    insert(int index, String xx)
长度：
    length()
其他api
(1)int indexOf(String str)：在当前字符序列中查询str的第一次出现下标
(2)int indexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的第一次出现下标
(3)int lastIndexOf(String str)：在当前字符序列中查询str的最后一次出现下标
(4)int lastIndexOf(String str, int fromIndex)：在当前字符序列[fromIndex,最后]中查询str的最后一次出现下标
(5)String substring(int start)：截取当前字符序列[start,最后]
(6)String substring(int start, int end)：截取当前字符序列[start,end)
(7)String toString()：返回此序列中数据的字符串表示形式
(8)void setLength(int newLength) ：设置当前字符序列长度为newLength
5. 对比三者的执行效率
效率从高到低排列：
StringBuilder > StringBuffer > String
 */
public class StringMoreTest {
}
