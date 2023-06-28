package exer2.interview;

import java.util.HashSet;

/**
 * @author shkstart
 * @create 15:35
 */
public class HashSetDemo {
  public static void main(String[] args) {
    HashSet set = new HashSet();
    Person p1 = new Person(1001, "AA");
    Person p2 = new Person(1002, "BB");

    set.add(p1);
    set.add(p2);
    System.out.println(set);//[Person{id=1001,name=aa},Person{id=1002,name=bb']

    p1.name = "CC";
    set.remove(p1);
    System.out.println(set);//[Person{id=1002,name=bb']

    set.add(new Person(1001, "CC"));
    System.out.println(set);//2

    set.add(new Person(1001, "AA"));
    System.out.println(set);//3

  }
}
