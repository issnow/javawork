package exer3;

public class EmployeeTest {
  public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.name = "guocheng";
    e1.age = 30;
    e1.id = 101;
    e1.salary = 1000;
    e1.showInfo();
    Employee e2 = new Employee();
    e2.name = "wukong";
    e2.age = 500;
    e2.id = 102;
    e2.salary = 10;
  }
}
