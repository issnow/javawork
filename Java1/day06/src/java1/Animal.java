package java1;

public class Animal {
  String name;
  private int legs;//私有化属性
  public void eat(){
    System.out.println("eat");
  }
  public int getLegs() {
    return legs;
  }
  public void setLegs(int legs) {
    if(legs >= 0 &&legs % 2 == 0){
      this.legs = legs;
    }else {
      System.out.println("非法字符");
    }
  }

  @Override
  public String toString() {
    return "Animal{" +
            "name='" + name + '\'' +
            ", legs=" + legs +
            '}';
  }
}