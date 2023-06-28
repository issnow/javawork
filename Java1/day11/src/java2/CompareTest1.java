package java2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest1 {
  @Test
  public void test1(){
    String[] arr = new String[]{"y","g", "e"};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  @Test
  public void test2(){
    Product[] arr = new Product[5];
    arr[0] = new Product("华为", 6299);
    arr[1] = new Product("小米", 4999);
    arr[2] = new Product("vivo", 5999);
    arr[3] = new Product("苹果", 9999);
    arr[4] = new Product("荣耀", 6299);
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  @Test
  public void test3(){
    Product[] arr = new Product[5];
    arr[0] = new Product("华为", 6299);
    arr[1] = new Product("小米", 4999);
    arr[2] = new Product("vivo", 5999);
    arr[3] = new Product("苹果", 9999);
    arr[4] = new Product("荣耀", 6299);
    Comparator c = new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if(o1 instanceof Product && o2 instanceof Product) {
          Product c1 = (Product) o1;
          Product c2 = (Product) o2;
          return Double.compare(c1.getPrice(), c2.getPrice());
        }
        throw new RuntimeException("类型不匹配");
      }
    };
    //Arrays.sort(arr, c);
    Arrays.sort(arr, new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    System.out.println(Arrays.toString(arr));
  }
}
