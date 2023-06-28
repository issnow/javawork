package java1;

public class ChineseTest {
  public static void main(String[] args) {
    Chinese c = new Chinese();
    c.name = "yaoming";
    c.age = 40;

    Chinese c2 = new Chinese();
    c2.name = "yaoming2";
    c2.age = 41;

    c.nation = "china";
    System.out.println(c.toString());
    System.out.println(c2.toString());

    System.out.println(c2.nation);
  }
}
class Chinese{
  String name;
  int age;
  //静态变量
  static String nation;

  @Override
  public String toString() {
    return "Chinese{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}