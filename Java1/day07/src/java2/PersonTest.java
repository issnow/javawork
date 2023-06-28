package java2;

public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person();
    Man m1 = new Man();
    Person m2 = new Man();
    //虚拟方法调用
    m2.eat();
    m2.walk();
    System.out.println(m2.id);
    //向下转型
    //Man m3 = (Man)m2;
    if(m2 instanceof Man){
      Man m3 = (Man)m2;
      System.out.println(m3 == m2);//true
      m3.doJob();
    }
  }
}
