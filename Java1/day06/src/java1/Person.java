package java1;

public class Person {
  String name;
  int age;
  //public Person(){
  //  System.out.println("+++");
  //}
  public Person(int a){
    this.age = a;
  }
  public Person(String name){
    this.name = name;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
