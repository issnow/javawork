package java1;

import org.junit.Test;

public class MenuDAO extends DAO<Menu>{
  @Test
  public void test(){
    MenuDAO m = new MenuDAO();
    m.insert(new Menu());
    m.get(1);
  }
}
