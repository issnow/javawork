package java1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandleTest1 {
  @Test
  public void test1(){
    try{
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      System.out.println(n);
    }catch (InputMismatchException err){
      System.out.println("InputMismatchException错误");
    }catch (NullPointerException err){
      System.out.println("NullPointerException 错误");
    }catch (RuntimeException err){
      System.out.println("RuntimeException 错误");
    }finally {
      System.out.println("finally");
    }
    System.out.println("结束");
  }
  @Test
  public void test2(){
    try{
      String str = "hello";
      int i = Integer.parseInt(str);
      System.out.println(i);
    }catch (NumberFormatException err){
      //err.printStackTrace();
      //err.getMessage();
      System.out.println(err.getMessage());
    }
  }
  @Test
  public void test3() {
    try{
      File f = new File("C:\\Users\\h5_ch\\Desktop\\hello.txt");
      //Unhandled exception: java.io.FileNotFoundException
      FileInputStream fis = new FileInputStream(f);
      //Unhandled exception: java.io.IOException
      int data = fis.read();
      while (data!= -1){
        System.out.print((char)data);
        data = fis.read();
      }
      fis.close();
    }catch (FileNotFoundException err){
      err.printStackTrace();
    }catch (IOException err){
      err.printStackTrace();
    }
  }
}
