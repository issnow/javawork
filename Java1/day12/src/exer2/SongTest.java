package exer2;

import org.junit.Test;

import java.util.*;

public class SongTest {
  @Test
  public void test(){
    HashMap map = new HashMap();
    ArrayList arr = new ArrayList();
    arr.add("1");
    arr.add("2");
    arr.add("3");
    arr.add("4");
    map.put("周杰伦", arr);

    map.put("林俊杰", Arrays.asList("5","6","7","8"));
    Set set = map.entrySet();
    Iterator it = set.iterator();
    while (it.hasNext()) {
      Map.Entry item = (Map.Entry) it.next();
      System.out.println(item.getKey() +"-->"+ item.getValue());
    }
  }


  //案例：二级联动
  //
  //将省份和城市的名称保存在集合中，当用户选择省份以后，二级联动，显示对应省份的地级市供用户选择。
  //
  //效果演示见课件。
  //
  //提示：如果输入的省份不正确，需要重新输入。 如果输入的城市不正确，需要重新输入。
  //
  //已有代码：
  //
  //class CityMap{
  //
  //  public static Map model = new HashMap();
  //
  //  static {
  //    model.put("北京", new String[] {"北京"});
  //    model.put("辽宁", new String[] {"沈阳","盘锦","铁岭","丹东","大连","锦州","营口"});
  //    model.put("吉林", new String[] {"长春","延边","吉林","白山","白城","四平","松原"});
  //    model.put("河北", new String[] {"承德","沧州","邯郸","邢台","唐山","保定","石家庄"});
  //    model.put("河南", new String[] {"郑州","许昌","开封","洛阳","商丘","南阳","新乡"});
  //    model.put("山东", new String[] {"济南","青岛","日照","临沂","泰安","聊城","德州"});
  //  }
  //
  //}
  @Test
  public void test2(){
    //Map m = new HashMap();
    //m.put(1,2);
    //System.out.println(m.get(3));
    ArrayList arr = new ArrayList();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    Object[] array = arr.toArray();
    System.out.println(array);
    int[] arr1 = new int[]{1,2,3};
    List list = Arrays.asList(arr1);
  }

  public static void main(String[] args) {
    Map m = CityMap.model;
    Scanner s = new Scanner(System.in);
    while (true) {
      System.out.println("省份选择:");
      String pr = s.next();
      String[] val = (String[]) m.get(pr);
      if(val != null) {
        for (Object obj:val) {
          System.out.print(obj);
        }
        System.out.println("城市选择:");
        String city = s.next();
        List arr = Arrays.asList(val);
        int i = arr.indexOf("city");
        if(i != -1) {
          System.out.println("等级完毕");
        }
      }
      break;
    }
  }
}
class CityMap{

  public static Map model = new HashMap();

  static {
    model.put("北京", new String[] {"北京"});
    model.put("辽宁", new String[] {"沈阳","盘锦","铁岭","丹东","大连","锦州","营口"});
    model.put("吉林", new String[] {"长春","延边","吉林","白山","白城","四平","松原"});
    model.put("河北", new String[] {"承德","沧州","邯郸","邢台","唐山","保定","石家庄"});
    model.put("河南", new String[] {"郑州","许昌","开封","洛阳","商丘","南阳","新乡"});
    model.put("山东", new String[] {"济南","青岛","日照","临沂","泰安","聊城","德州"});
  }

}