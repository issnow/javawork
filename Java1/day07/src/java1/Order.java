package java1;
/*
2.1权限修饰符： public、 protected、 缺省、 private。具体访问范围如下：
修饰符 本类内部  本包内 其他包的子类  其他包非子类
private   √       ×       ×             ×
缺省      √       √       ×             ×
protected √       √       √             ×
public    √       √       √             √
 */
public class Order {
  private int agePrivate;
  int ageDefault;
  protected int ageProtected;
  public int agePublic;
  private void fnPrivate(){}
  void fnDefault(){}
  protected void fnProtected(){}
  public void fnPublic(){}
  public void show(){
    agePrivate = 1;
    ageDefault = 1;
    ageProtected = 12;
    agePublic = 3;
    fnPrivate();
    fnDefault();
    fnProtected();
    fnPublic();
  }
}
