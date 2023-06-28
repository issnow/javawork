package java2;

import java.util.Arrays;

/*
使用enum定义枚举类
String toString(): 默认返回的是常量名（对象名），可以继续手动重写该方法！
(关注)static 枚举类型[] values():返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值，
  是一个静态方法
(关注)static 枚举类型 valueOf(String name)：可以把一个字符串转为对应的枚举类对象。
  要求字符串必须是枚举类对象的“名字”。如不是，会有运行时异常：IllegalArgumentException。
String name():得到当前枚举常量的名称。建议优先使用toString()。
int ordinal():返回当前枚举常量的次序号，默认从0开始
 */
public class SeasonTest1 {
  public static void main(String[] args) {
    //System.out.println(Season1.autumn.getClass());
    //System.out.println(Season1.autumn.getClass().getSuperclass());
    //System.out.println(Season1.autumn.getClass().getSuperclass().getSuperclass());
    System.out.println(Season1.spring);
    System.out.println(Season1.spring.name());
    System.out.println(Season1.spring.values());

    Season1[] values = Season1.values();
    System.out.println(Arrays.toString(values));

    System.out.println(Season1.valueOf("spring"));

    System.out.println(Season1.valueOf("summer").ordinal());

    Season1 autumn = Season1.autumn;
    autumn.show();
  }
}
interface Info{
  void show();
}

//jdk5.0使用enum定义枚举类
enum Season1 implements Info {
  //1.开始声明对象,逗号隔开
  spring("春") {
    public void show(){
      System.out.println("春春春春");
    }
  },
  summer("夏"){
    public void show(){
      System.out.println("夏夏夏夏夏");
    }
  },
  autumn("秋"){
    public void show(){
      System.out.println("秋秋秋秋秋");
    }
  },
  winter("冬"){
    public void show(){
      System.out.println("冬冬冬冬");
    }
  };
  private final String sn;

  private Season1(String sn) {
    this.sn = sn;
  }

  public String getSn() {
    return sn;
  }

  //@Override
  //public void show() {
  //  System.out.println(this.getSn());
  //}


  //@Override
  //public String toString() {
  //  return "Season{" +
  //          "sn='" + sn + '\'' +
  //          '}';
  //}
}