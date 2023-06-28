package com.atguigu10._enum.exer1;

public class SingleTonTest {
  public static void main(String[] args) {
    System.out.println(GF.xiaoli.name());
    System.out.println(GF.xiaoli.name() == GF.xiaoli.toString());
  }
}
class S {
  private S(){}
  S instance = new S();
  public S getInstance(){
    return this.instance;
  }
}

enum Bank{
  CCB;
}
enum GF{
  xiaoli(20);
  private final int age;
  private GF(int age){
    this.age = age;
  }
}
class S3{
  private S3(){}
  public static final S3 instance = new S3();
  //public static S3 getInstance() {
  //  return instance;
  //}
}