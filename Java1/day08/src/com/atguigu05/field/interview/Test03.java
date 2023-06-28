package com.atguigu05.field.interview;

/**
 * @author 尚硅谷-宋红康
 * @create 16:03
 */
public class Test03 {
    public static void main(String[] args) {
        Sub s = new Sub();
    }
}
class Base{
    Base(){
        method(100);
    }
    {
        System.out.println("base");//1
    }
    public void method(int i){
        System.out.println("base : " + i);
    }//2, 4
}
class Sub extends Base{
    Sub(){
        super.method(70);
    }
    {
        System.out.println("sub");//3
    }
    public void method(int j){
        System.out.println("sub : " + j);
    }
}
