package java1;

import org.junit.Test;

public class CustomerDAO extends DAO<Customer>{
  @Test
  public void test1(){
    CustomerDAO c = new CustomerDAO();
    c.insert(new Customer());
    Customer customer = c.get(1);
  }
}
