package java2;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

public class DateTest2 {
  @Test
  public void test1(){
    //String s = "hello";
    //String s2 = s.replace("l", "w");
    //System.out.println(s);
    //System.out.println(s2);

    Calendar c = Calendar.getInstance();
    c.set(Calendar.DAY_OF_MONTH, 30);
    System.out.println(c.get(Calendar.DAY_OF_MONTH));
  }
  @Test
  public void test2(){
    LocalDate ld1 = LocalDate.now();
    LocalTime lt1 = LocalTime.now();
    LocalDateTime ldt1 = LocalDateTime.now();
    System.out.println(ld1);
    System.out.println(lt1);
    System.out.println(ldt1);

    LocalDate ld2 = LocalDate.of(2023, 5, 20);
    LocalTime lt2 = LocalTime.of(10,10,10 );
    LocalDateTime ldt2 = LocalDateTime.of(2023,6,1,10,0,56);
    System.out.println(ld2);
    System.out.println(lt2);
    System.out.println(ldt2);
  }
  @Test
  public void test4(){
    LocalDate d = LocalDate.now();
    System.out.println(d.getDayOfMonth());
    LocalDate d2 = d.withDayOfMonth(15);
    System.out.println(d);
    System.out.println(d2);

    LocalDateTime d3 = LocalDateTime.now();
    LocalDateTime d4 = d3.plusDays(2);
    System.out.println(d3);
    System.out.println(d4);

    LocalDateTime d5 = d3.minusHours(10);
    System.out.println(d5);
  }
  @Test
  public void test3(){
    System.out.println(Instant.now());
    Instant d = Instant.now();
    OffsetDateTime offsetDateTime = d.atOffset(ZoneOffset.ofHours(8));
    System.out.println(offsetDateTime);
    System.out.println(d.toEpochMilli());
    System.out.println(d.toString());

    System.out.println(Instant.ofEpochMilli(1234123424324L));
  }
  @Test
  public void test5(){
    DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime d2 = LocalDateTime.now();
    LocalDateTime d3 = LocalDateTime.of(2023, 10, 1, 15,22,22);
    System.out.println(form.format(d2));
    System.out.println(form.format(d3));

    TemporalAccessor parse = form.parse("2023-10-02 15:22:22");

    LocalDateTime d4 = LocalDateTime.from(parse);
    System.out.println(parse);
    System.out.println(form.format(d4));


  }
  @Test
  public void test6(){
    //将 LocalDateTime 转化为毫秒数
    LocalDateTime d1 = LocalDateTime.now();
    System.out.println(d1);
    System.out.println(d1.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
    System.out.println(new Date().getTime());
  }
  /*
案例：百天推算
使用Calendar获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
使用LocalDateTime获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
   */
  @Test
  public void test7(){
    Calendar c = Calendar.getInstance();
    System.out.println(c.getTime());
    int a = c.get(Calendar.YEAR);
    int b = c.get(Calendar.MONTH);
    int d = c.get(Calendar.DAY_OF_MONTH);

    c.set(Calendar.YEAR, 1993);
    c.set(Calendar.MONTH, 4);
    c.set(Calendar.DAY_OF_MONTH, 20);
    System.out.println(c.getTime());
    c.add(Calendar.DAY_OF_YEAR, 100);
    System.out.println(c.getTime());

  }
  @Test
  public void test8(){
    LocalDateTime d = LocalDateTime.now();
    LocalDateTime d2 = d.withYear(1993).withMonth(5).withDayOfMonth(20);
    LocalDateTime d3 = d2.plusDays(100);
    System.out.println(d2);
    System.out.println(d3);
  }
}
