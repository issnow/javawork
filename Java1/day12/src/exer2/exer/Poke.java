package exer2.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Poke {
  @Test
  public void test1(){
    String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] color = {"方片♦","梅花♣","红桃♥","黑桃♠"};
    ArrayList poker = new ArrayList();
    for (int i = 0; i <  color.length; i++) {
      for (int j = 0; j < num.length; j++) {
        poker.add(color[i]+num[j]);
      }
    }
    poker.add("大王");
    poker.add("小王");
    Collections.shuffle(poker);
    System.out.println(poker);
    ArrayList arr1 = new ArrayList();
    ArrayList arr2 = new ArrayList();
    ArrayList arr3 = new ArrayList();

    for (int i = 0; i < poker.size();) {
      arr1.add(poker.get(i));
      arr2.add(poker.get(i+1));
      arr3.add(poker.get(i+2));
      i+=3;
    }
    Collections.sort(arr1);
    Collections.sort(arr2);
    Collections.sort(arr3);
    System.out.println(arr1);
    System.out.println(arr2);
    System.out.println(arr3);

  }
}
