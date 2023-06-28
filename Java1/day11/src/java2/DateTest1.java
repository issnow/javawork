package java2;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest1 {
  @Test
  public void test1(){
    long l1 = System.currentTimeMillis();
    System.out.println(l1);
    Date d1 = new Date();
    System.out.println(d1.toString());
    System.out.println(d1.getTime());

    Date d2 = new Date(10987256940105l);
    System.out.println(d2);
  }

  @Test
  public void test2(){
    java.sql.Date d1 = new java.sql.Date(10987256940105l);
    System.out.println(d1);
    System.out.println(d1.getTime());
  }
  @Test
  public void test3(){
    SimpleDateFormat d = new SimpleDateFormat();
    Date d1 = new Date();
    String str = d.format(d1);
    System.out.println(str);

    try {
      Date d2 = d.parse("2023/6/20 18:27");
      System.out.println(d2);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  public void test4() throws ParseException {
    SimpleDateFormat d = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date d2 = new Date();
    String str = d.format(d2);
    System.out.println(str);
    System.out.println();
    Date d3= d.parse("2023-06-20 18:34:45");
    System.out.println(d3);
  }
  @Test
  public void test5(){
    Calendar c = new GregorianCalendar();
    Calendar c1 = Calendar.getInstance();
    System.out.println(c1.getClass());
    System.out.println(c);

    System.out.println(c1.get(Calendar.DAY_OF_MONTH));
    System.out.println(c1.get(Calendar.DAY_OF_WEEK));
    System.out.println(c1.get(Calendar.DAY_OF_YEAR));

    c1.set(Calendar.DAY_OF_MONTH, 23);
    System.out.println(c1.get(Calendar.DAY_OF_MONTH));

    c1.add(Calendar.DAY_OF_MONTH, 3);
    c1.add(Calendar.DAY_OF_MONTH, -4);
    System.out.println(c1.get(Calendar.DAY_OF_MONTH));

    System.out.println(c1.getTime());
    c1.setTime(new Date());
    System.out.println(c1.get(Calendar.DAY_OF_MONTH));
  }
}
