package java2;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
  @Test//properties读文件信息
  public void test() throws IOException {
    //String name = "tom";
    //String pwd = "123";
    //Properties pro = new Properties();
    //pro.put(name, pwd);
    //System.out.println(pro);
    File file = new File("info.properties");
    System.out.println(file.getAbsolutePath());
    Properties pro = new Properties();
    FileInputStream fis = new FileInputStream(file);
    pro.load(fis);
    System.out.println(pro.getProperty("key"));
    System.out.println(pro.getProperty("name"));
    System.out.println(pro.getProperty("pwd"));
    fis.close();
  }
}
