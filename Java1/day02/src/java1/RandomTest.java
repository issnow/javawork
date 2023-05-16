package java1;
/*
如何获取一个n-m之间随机数
Math.random()-->[0.0, 1.0)之间
int i1 = (int)(Math.random() * (m-n+1)) + n;
 */
public class RandomTest {
  //获取10-20之间的随机数
  public static void main(String[] args) {
    int i1 = (int)(Math.random() * (20-10+1)) + 10;

    //for(int i = 0; i< 30; i++) {
    //  System.out.println((int)(Math.random() * (20-10+1)) + 10);
    //}

    //122 - 145之间的随机数
    for(int i = 0; i < 40;i++) {
      System.out.println((int)(Math.random() * (145-122+1)) + 122);
    }
  }
}
