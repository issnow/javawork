package debug;

/**
 * ClassName: Debug03
 * Package: com.atguigu.debug
 * Description: 演示3：字段断点
 */
public class Debug03 {
    public static void main(String[] args) {
        Person p1 = new Person(3);
        System.out.println(p1);


    }
}

class Person{
    private int id = 1;
    private String name;

    public Person() {
    }
    {
        id = 2;
    }
    public Person(int id) {
        this.id = id;
    }



    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
