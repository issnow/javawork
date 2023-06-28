package encapsulation.exer1;

public class PersonTest {
  public static void main(String[] args) {
    Person p = new Person();
    //p.age = 10;
    p.setAge(30);
    System.out.println(p.getAge());
  }

}
