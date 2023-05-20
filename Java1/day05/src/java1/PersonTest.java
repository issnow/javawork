package java1;

public class PersonTest {
  public static void main(String[] args) {
    //1.创建对象
    Person p = new Person();
    //2.调用属性和方法
    p.name = "jack";
    p.gender = '男';
    System.out.println(p.name);
    p.eat();
    p.sleep(8);

    //在创建一个
    Person p1 = new Person();
    p1.name = "rose";
    p1.gender = '女';
  }
}
