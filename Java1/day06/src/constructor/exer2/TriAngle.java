package constructor.exer2;

public class TriAngle {
  public static void main(String[] args) {
    TriAngle t = new TriAngle(3,2);
    System.out.println(t.calcArea());
  }
  private int base;
  private int height;

  public int getBase() {
    return base;
  }

   public int getHeight() {
    return height;
  }

  public int calcArea(){
    return this.base *this.height;
  }

  public TriAngle(int base, int height) {
    this.base = base;
    this.height = height;
  }
}
