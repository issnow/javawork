package encapsulation.exer1;

public class Person {
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if(age> 0 && age < 130){
      this.age = age;
    }else {
      System.out.println("非法");
    }
  }
}
