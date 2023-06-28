package java2;

import org.junit.jupiter.api.Test;

public class Man extends Person{
  boolean isSmoking;
  int id = 2;

  @Override
  public void eat() {
    System.out.println("eat more");
  }
  public void walk(){
    System.out.println("walk");
  }
  @Test
  public void doJob(){
    System.out.println("do job");
  }
}
