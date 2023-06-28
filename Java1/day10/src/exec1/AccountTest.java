package exec1;
/*
银行有一个账户。
有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
问题：该程序是否有安全问题，如果有，如何解决？
【提示】
1，明确哪些代码是多线程运行代码，须写入run()方法
2，明确什么是共享数据。
3，明确多线程运行代码中哪些语句是操作共享数据的。
 */
public class AccountTest {
  public static void main(String[] args) {
    Bank b1 = new Bank();
    User u1 = new User();
    User u2 = new User();
    u1.putMoney(b1);
    u1.putMoney(b1);
    u1.putMoney(b1);
    u2.putMoney(b1);
    u2.putMoney(b1);
    u2.putMoney(b1);
  }
}

class Bank implements Runnable {
  int money;
  @Override
  public void run() {
    fn();
  }
  public synchronized void fn(){
    money +=1000;
    System.out.println(money);
  }
}
class User {
  public void putMoney(Bank b){
    new Thread(b).start();
  }
}