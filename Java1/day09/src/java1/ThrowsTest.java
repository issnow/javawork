package java1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
异常处理的方式2：throws
1. 格式：在方法的声明处，使用"throws 异常类型1,异常类型2,..."
2. 举例：
public void test() throws 异常类型1,异常类型2,.. {
    //可能存在编译时异常
}
3. 是否真正处理了异常？
> 从编译是否能通过的角度看，看成是给出了异常万一要是出现时候的解决方案。此方案就是，继续向上抛出(throws)。
> 但是，此throws的方式，仅是将可能出现的异常抛给了此方法的调用者。此调用者仍然需要考虑如何处理相关异常。
  从这个角度来看，throws的方式不算是真正意义上处理了异常。
4. 方法的重写的要求：(针对于编译时异常来说的)
子类重写的方法抛出的异常类型可以与父类被重写的方法抛出的异常类型相同，或是父类被重写的方法抛出的异常类型的子类。
5. 开发中，如何选择异常处理的两种方式？(重要、经验之谈)
- 如果程序代码中，涉及到资源的调用（流、数据库连接、网络连接等），则必须考虑使用try-catch-finally来处理，
  保证不出现内存泄漏。
- 如果父类被重写的方法没有throws异常类型，则子类重写的方法中如果出现异常，只能考虑使用try-catch-finally
  进行处理，不能throws。
- 开发中，方法a中依次调用了方法b,c,d等方法，方法b,c,d之间是递进关系。此时，如果方法b,c,d中有异常，
  我们通常选择使用throws，而方法a中通常选择使用try-catch-finally。
 */
public class ThrowsTest {
  @Test
  public void test3() throws FileNotFoundException, IOException {
    File f = new File("C:\\Users\\h5_ch\\Desktop\\hello.txt");
    //Unhandled exception: java.io.FileNotFoundException
    FileInputStream fis = new FileInputStream(f);
    //Unhandled exception: java.io.IOException
    int data = fis.read();
    while (data != -1) {
      System.out.print((char) data);
      data = fis.read();
    }
    fis.close();
  }
  @Test
  public void test2() throws FileNotFoundException, IOException{
    test3();
  }
  @Test
  public void test1(){
    try{
      test2();
    }catch (FileNotFoundException err){
      err.printStackTrace();
    }catch (IOException err){
      err.printStackTrace();
    }
  }
}
