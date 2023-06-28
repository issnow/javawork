package exer1;

import org.junit.Test;

import java.util.*;

/*
定义个泛型类 DAO<T>，在其中定义一个Map 成员变量，Map 的键为 String 类型，值为 T 类型。
分别创建以下方法：
public void save(String id,T entity)： 保存 T 类型的对象到 Map 成员变量中
public T get(String id)：从 map 中获取 id 对应的对象
public void update(String id,T entity)：替换 map 中key为id的内容,改为 entity 对象
public List<T> list()：返回 map 中存放的所有 T 对象
public void delete(String id)：删除指定 id 对象
定义一个 User 类：
该类包含：private成员变量（int类型） id，age；（String 类型）name。
定义一个测试类：
创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
使用 Junit 单元测试类进行测试。
 */
public class view2 {
  @Test
  public void test1(){
    DAO<User> d = new DAO<>();
    d.save("1", new User(1, 12, "tom"));
    d.save("2", new User(2, 13, "jerry"));
    d.save("3", new User(3, 14, "moria"));
    System.out.println(d.get("1"));
    d.update("2", new User(4, 22, "guocheng"));
    System.out.println(d.get("2"));
    System.out.println(d.list());
    d.delete("3");
    System.out.println(d.m);
  }
}
class User {
  private int id;
  private int age;
  private String name;

  public User() {
  }

  public User(int id, int age, String name) {
    this.id = id;
    this.age = age;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", age=" + age +
            ", name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return id == user.id && age == user.age && Objects.equals(name, user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, age, name);
  }
}
class DAO<T>{
  HashMap<String, T> m = new HashMap<>();
  public void save(String id,T entity) {
    m.put(id, entity);
  }
  public T get(String id){
    return m.get(id);
  }
  public void update(String id,T entity){
    m.put(id, entity);
  }
  public List<T> list(){
    Collection<T> values = m.values();
    ArrayList<T> list = new ArrayList<>(values);
    return list;
  }
  public void delete(String id){
    if(m.containsKey(id)) {
      m.remove(id);
    }
  }
}