package exer1.exer1;

import java.util.*;

public class Test {
  public static void main(String[] args) {
    List arr = new ArrayList();
    Scanner s = new Scanner(System.in);
    while (true) {
      fn(s,arr);
      System.out.println("继续录入?1：继续录入，0：结束录入。");
      int num = s.nextInt();
      if(num == 1) {
        fn(s,arr);
      }else {
        break;
      }
    }
    s.close();
    Iterator iter = arr.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
  }
  public static void fn(Scanner s, List arr) {
    System.out.println("姓名");
    String name = s.next();
    System.out.println("年龄");
    int age = s.nextInt();
    arr.add(new Student(name,age));
  }
}


class Student {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return age == student.age && Objects.equals(name, student.name);
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }

}