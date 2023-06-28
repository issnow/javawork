package java2;

public class Woman extends Person{
  boolean isBeauty;

  @Override
  public void eat() {
    System.out.println("eat less");
  }
  public void walk(){
    System.out.println("woman walk");
  }
  public void shopping(){
    System.out.println("shopping");
  }
}
