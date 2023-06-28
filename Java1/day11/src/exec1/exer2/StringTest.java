package exec1.exer2;

import java.util.Arrays;

public class StringTest {
  public static void main(String[] args) {
    String s = " ab ";
    System.out.println(s.trim());
    MyString ms = new MyString();
    System.out.println("-------"+ms.trim(" ") + "00000000");

    String s1 = "hello";
    System.out.println(ms.reverse(s1));
    System.out.println(ms.reverse(s1, 1, 3));
    System.out.println(ms.getCount("abkkcadkabkebfkabkskab", "ab"));

    System.out.println(ms.getLongestStr("abcwerthelloyuiodef", "cvhellobnm"));
    System.out.println(ms.fn5("bad"));
  }

}

class MyString {
  public String trim(String str) {
    if(str != null) {
      int start = 0;
      int end = str.length() - 1;
      while (start < end && str.charAt(start) == ' ') {start++;}
      while (start < end && str.charAt(end) == ' ') {end--;}
      if(str.charAt(start) == ' ') {
        return "";
      }
      return str.substring(start, end + 1);
    }
    return null;
  }
  public String reverse(String str){
    char[] arr = str.toCharArray();
    int len = arr.length - 1;
    for (int i = 0; i < len / 2; i++) {
      char temp = arr[i];
      arr[i] = arr[len - i];
      arr[len - i] = temp;
    }
    return new String(arr);
  }
  public String reverse(String str, int start, int end){
    char[] arr = str.toCharArray();
    //int len = end + start;
    //int len1 = arr.length - 1;
    //for (int i = start; i < len / 2; i++) {
    //  char temp = arr[i];
    //  arr[i] = arr[len1 - i];
    //  arr[len1 - i] = temp;
    //}
    for(;start < end;start ++ , end --) {
      char temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
    }
    return new String(arr);
  }
  public int getCount(String str, String target){
    //abkkcadkabkebfkabkskab
    int index = str.indexOf(target);
    int count = 0;
    while (index >= 0) {
      count++;
      index = str.indexOf(target, index+target.length());
    }
    return count;
  }
  public String getLongestStr(String str, String str1){//"hello1"
    int len = str1.length();
    boolean flag = false;
    String res = "";
    for (int i = len - 1; i > 0; i --) {
      for (int j = 0;j < len -i;j++) {
        String temp = str1.substring(j, i + j);
        if(str.indexOf(temp) >= 0) {
          res = temp;
          flag = true;
          break;
        }
      }
      if(flag) {
        break;
      }
    }
    return res;
  }
  public String fn5(String str){
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    return new String(arr);
  }
}
