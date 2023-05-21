package exer2;

public class EmployeeTest {
  public static void main(String[] args) {
    Employee e1 = new Employee();
    e1.name = "guocheng";
    e1.d1 = new MyDate();
    e1.d1.year = 2023;
    e1.d1.month = 5;
    e1.d1.day = 20;

    Employee e2 = new Employee();
    e2.name = "wukong";
    e2.age = 500;
    e2.id = 102;
    e2.salary = 10;
  }
}
