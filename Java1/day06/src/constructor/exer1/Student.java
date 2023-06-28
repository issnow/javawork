package constructor.exer1;

public class Student {
  public static void main(String[] args) {
    Student s = new Student("wukong", 12);
    System.out.println(s.toString());
  }
  String name;
  int age;
  String school;
  String major;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student(String name, int age, String school) {
    this.name = name;
    this.age = age;
    this.school = school;
  }


  public Student(String name, int age, String school, String major) {
    this.name = name;
    this.age = age;
    this.school = school;
    this.major = major;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", school='" + school + '\'' +
            ", major='" + major + '\'' +
            '}';
  }
}
