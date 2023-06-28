package encapsulation.exer2;

public class BookTest {
  public static void main(String[] args) {
    Book b = new Book();
    b.setPrice(40);
    b.setAuthor("过程");
    b.setBookName("vue计算");
    System.out.println(b.toString());
  }
}
