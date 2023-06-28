package exec1;
/*
新年倒计时
模拟新年倒计时，每隔1秒输出一个数字，依次输出10,9,8......1，最后输出：新年快乐！
 */
public class TimeTest {
  public static void main(String[] args) {
    new Thread(new Runnable() {
      int a = 10;
      @Override
      public void run() {
        while (a > 0) {
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(a--);
        }
        if(a <= 0) {
          System.out.println("happy new year!");
        }
      }
    }).start();
  }
}
