package exec1.exer2;

import java.util.Arrays;

public class Answer {
  public static void main(String[] args) {
    Util u = new Util();
    u.fn("  ab  ");
    u.fn2("helloworld", 1, 4);//holleworld
    u.fn3("abkkcadkabkebfkabkskab", "ab");//holleworld
    u.fn4("hello");
  }
}
class Util{
  public void fn(String str) {
    int left = 0;
    int right =str.length() - 1;
    while (left < right && str.charAt(left) == ' ') {
      left ++;
    }
    while (left < right && str.charAt(right) == ' ') {
      right--;
    }
    if(str.charAt(left) == ' ')
      System.out.println("");
    String s = str.substring(left,right+1);
    System.out.println("--"+s+"--");
  }
  public void fn2(String str, int l, int r){
    byte[] arr=  str.getBytes();
    for (; l < r; l++,r--) {
      byte temp = arr[l];
      arr[l] = arr[r];
      arr[r] = temp;
    }
    String re = new String(arr);
    System.out.println(re);
  }
  public void fn3(String str, String target){
    int index = str.indexOf(target);
    int count = 0;
    while (index >= 0) {
      count++;
      index = str.indexOf(target, index + target.length());
    }
    System.out.println(count);

  }
  public void fn4(String str) {
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    System.out.println(new String(arr));

  }
}