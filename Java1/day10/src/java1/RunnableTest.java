package java1;

public class RunnableTest {
  public static void main(String[] args) {
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println(13213);
      }
    }).start();
    Thread1 t1 = new Thread1();
    Thread1 t2 = new Thread1();
    new Thread(t1).start();
    new Thread(t2).start();
  }
}
class Thread1 implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      if(i %2==0) {
        System.out.println(Thread.currentThread().getName() + ":"+i);
      }
    }
  }
}