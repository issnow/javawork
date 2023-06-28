package java1;

import java.util.Objects;

public class Person implements Comparable {
  String name;
  int age;

  public Person() {
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int compareTo(Object o) {
    if(o instanceof Person) {
      Person other = (Person) o;
      return Integer.compare(this.age, other.age);
      //int gap = this.age - other.age;
      //if(gap == 0) {
      //  return this.name.compareTo(other.name);
      //}
      //return gap;
    }
    throw new RuntimeException("错误");
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

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
}
