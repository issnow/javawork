package java2;
/*
一、JDK8之前的API:
1. System类的currentTimeMillis()
    > 获取当前时间对应的毫秒数，long类型，时间戳
    > 当前时间与1970年1月1日0时0分0秒之间的毫秒数
    > 常用来计算时间差
2. 两个Date类
|--java.util.Date
      > 两个构造器的使用,一个空参,一个long类型
        public Date() {
            this(System.currentTimeMillis());
        }
        public Date(long date) {
            fastTime = date;
        }
      > 两个方法的使用：①toString() ② long getTime()
          |----java.sql.Date: 对应着数据库中的date类型
3. SimpleDateFormat类
SimpleDateFormat类：用于日期时间的格式化和解析
    格式化：日期--->字符串 format
    解析：字符串 ---> 日期 parse
4. Calendar类（日历类）：抽象类
Calendar:日历类
     ① 实例化 由于Calendar是一个抽象类，所以我们需要创建其子类的实例。这里我们通过Calendar的静态方法
              getInstance()即可获取
     ②常用方法：get(int field) / set(int field,xx) / add(int field,xx) / getTime() / setTime()

二、JDK8中的API:
1. LocalDate,LocalTime,LocalDateTime --->类似于Calendar
> 实例化：now() / of(xxx,xx,xx)
> 方法：get() / withXxx() / plusXxx() / minusXxx() ...
2. Instant:瞬时 --->类似于Date
> 实例化：static now() / static ofEpochMilli()
> 方法：toEpochMilli() 返回1970-01-01 00:00:00到当前时间的毫秒数，即为时间戳
3. DateTimeFormatter ---> 类似于SimpleDateFormat
用于格式化和解析LocalDate,LocalTime,LocalDateTime
(1)ofPattern(String pattern) 静态方法，返回一个指定字符串格式的DateTimeFormatter
(2)format(TemporalAccessor t) 格式化一个日期、时间，返回字符串
(3)parse(CharSequence text) 将指定格式的字符序列解析为一个日期、时间
 */
public class DateTest {
}
