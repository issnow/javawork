package exer1;
/*
案例1：
案例2：为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
 */
public class AriExer1 {
  public static void main(String[] args) {
    int t = 89;
    int days = t/24;
    int hours = t%24;
    System.out.println("day:"+days+",hours:"+hours);

  }
}
