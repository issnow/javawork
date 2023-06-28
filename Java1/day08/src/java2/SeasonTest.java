package java2;
/*
jdk5.0之前定义枚举类
 */
public class SeasonTest {
  public static void main(String[] args) {
    Season spring = Season.spring;
    Season spring2 = Season.summer;
    System.out.println(spring.toString());
  }
}
class Season {
  private final String sn;
  private Season(String sn) {
    this.sn = sn;
  }
  public String getSn() {
    return sn;
  }
  public static final Season spring = new Season("春");
  public static final Season summer = new Season("夏");
  public static final Season autumn = new Season("秋");
  public static final Season winter = new Season("冬");

  @Override
  public String toString() {
    return "Season{" +
            "sn='" + sn + '\'' +
            '}';
  }
}
