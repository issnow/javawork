package java2;
/*
1. 为什么需要手动抛出异常对象？
在实际开发中，如果出现不满足具体场景的代码问题，我们就有必要手动抛出一个指定类型的异常对象。
2. 如何理解"自动 vs 手动"抛出异常对象？
过程1：“抛”
    "自动抛" ： 程序在执行的过程当中，一旦出现异常，就会在出现异常的代码处，自动生成对应异常类的对象，并将此对象抛出。
    "手动抛" ：程序在执行的过程当中，不满足指定条件的情况下，我们主动的使用"throw + 异常类的对象"方式抛出异常对象。
过程2：“抓”
    狭义上讲：try-catch的方式捕获异常，并处理。
    广义上讲：把“抓”理解为“处理”。则此时对应着异常处理的两种方式：① try-catch-finally ② throws
3. 如何实现手动抛出异常？
在方法内部，满足指定条件的情况下，使用"throw 异常类的对象"的方式抛出。
4. 注意点：throw后的代码不能被执行，编译不通过。
5. 面试题：throw 和 throws 的区别？ “上游排污，下游治污”
 */
public class ManulThrow {
  public static void main(String[] args) {
    //try{
    //  ManulThrow mn = new ManulThrow();
    //  mn.regist(-1);
    //}catch (RuntimeException e){
    //  e.printStackTrace();
    //  System.out.println(e.getMessage());
    //}
    try{
      ManulThrow mn = new ManulThrow();
      mn.regist1(-1);
    }catch (Exception e){
      System.out.println(e. getMessage());
    }
  }
  int id;
  public void regist(int id){
    if(id < 0){
      throw new RuntimeException("不能小于0");
    }
  }
  public void regist1(int id) throws Exception {
    if(id < 0){
      throw new Exception("不能小于0");
    }
  }
}