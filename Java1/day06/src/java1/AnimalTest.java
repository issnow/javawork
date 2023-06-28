package java1;

public class AnimalTest {
  public static void main(String[] args) {
    Animal a1 = new Animal();
    a1.name = "金蟾";
    //a1.legs = 4;
    a1.eat();
    a1.setLegs(4);
    System.out.println(a1.getLegs());
    //System.out.println(a1.toString());
  }
}

