package encapsulation.exer2;

public class Book {
  private String bookName;
  private String author;
  private double price;

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book{" +
            "bookName='" + bookName + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            '}';
  }
}
