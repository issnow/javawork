package exer1.test1;

public class Person {
  private String name;
  private int lifeValue;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLifeValue() {
    return lifeValue;
  }

  public void setLifeValue(int lifeValue) {
    if(lifeValue < 0) {
      throw new NoLifeValueException("生命值不能为负数：" + lifeValue);
    }
    this.lifeValue = lifeValue;
  }

  public Person() {
  }

  public Person(String name, int lifeValue) {
    //this.name = name;
    //this.lifeValue = lifeValue;
    this.setName(name);
    this.setLifeValue(lifeValue);
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", lifeValue=" + lifeValue +
            '}';
  }
}
