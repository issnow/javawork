package java1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
编译时异常
|----- ClassNotFoundException
|----- FileNotFoundException
|----- IOException
 */
public class ErrorTest {
  @Test
  public void test1(){
    //Unhandled exception: java.lang.ClassNotFoundException
    //Class.forName("java.lang.String");
  }
  @Test
  public void test2() throws IOException, FileNotFoundException {
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
  }
}
