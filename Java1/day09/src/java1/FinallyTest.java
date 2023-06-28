package java1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {
  @Test
  public void test2(){
    try{
      String str = "hello";
      int i = Integer.parseInt(str);
      System.out.println(i);
    }catch (NumberFormatException err){
      err.printStackTrace();
      System.out.println(10 / 0);
    }finally {
      System.out.println("finally");
    }
  }
  @Test
  public void test3() {
    //实际开发中 finally的使用
    FileInputStream fis = null;
    try{
      File f = new File("C:\\Users\\h5_ch\\Desktop\\hello.txt");
      //Unhandled exception: java.io.FileNotFoundException
      fis = new FileInputStream(f);
      //Unhandled exception: java.io.IOException
      int data = fis.read();
      while (data!= -1){
        System.out.print((char)data);
        data = fis.read();
      }
    }catch (FileNotFoundException err){
      err.printStackTrace();
    }catch (IOException err){
      err.printStackTrace();
    }finally {
      //重点: 将流资源的关闭操作放在finally中
      try{
        if(fis != null)
          fis.close();
      }catch (IOException err) {
        err.printStackTrace();
      }
    }
  }
}
