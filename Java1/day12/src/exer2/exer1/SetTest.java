package exer2.exer1;

import java.util.*;

public class SetTest {
  public static void main(String[] args) {
    ArrayList arr = new ArrayList();
    arr.addAll(Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2));
    System.out.println(arr);
    List list = duplicateList(arr);
    System.out.println(list);
  }

  public static List duplicateList(List list) {
    //Iterator iterator = list.iterator();
    //TreeSet arr = new TreeSet();
    //while (iterator.hasNext()) {
    //  Object in = iterator.next();
    //  if (in instanceof Integer) {
    //    arr.add(in);
    //  }else {
    //    throw new RuntimeException("类型异常");
    //  }
    //}
    //list.clear();
    //Iterator iter2 = arr.iterator();
    //while (iter2.hasNext()) {
    //  list.add(iter2.next());
    //}
    //return list;
    return new ArrayList(new HashSet(list));
  }
}
