package com.atguigu10._enum.exer3;

public class ColorTest {
  public static void main(String[] args) {
    System.out.println(Color.RED);
  }
}

enum Color {
  RED(255, 0, 0, "红"),
  ORANGE(255, 0, 0, "红"),
  YELLOW(255, 0, 0, "红"),
  GREEN(255, 0, 0, "红"),
  CYAN(255, 0, 0, "红"),
  BLUE(255, 0, 0, "红"),
  PURPLE(255, 0, 0, "红");
  private final int red;
  private final int green;
  private final int blue;
  private final String desc;

  Color(int red, int green, int blue, String desc) {
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.desc = desc;
  }

  @Override
  public String toString() {
    return "Color{" +
            "red=" + red +
            ", green=" + green +
            ", blue=" + blue +
            ", desc='" + desc + '\'' +
            '}';
  }
}