package com.atguigu03._extends.exer1;

public class Kids extends ManKind{
  public static void main(String[] args) {
    Kids someKid = new Kids();
    someKid.setSex(0);
    someKid.setSalary(100);
    someKid.yearsOld = 11;
    someKid.employee();
    someKid.manOrWoman();
    System.out.println(someKid.toString());
  }
  int yearsOld;
  public void printAge(){
    System.out.println(this.yearsOld);
  }

  public void employee() {
    super.employee();
    System.out.println("no job and study");
  }

  @Override
  public String toString() {
    return "Kids{" +
            "yearsOld=" + yearsOld +
            ", sex=" + this.getSex() +
            ", salary=" + this.getSalary() +
            '}';
  }
}
