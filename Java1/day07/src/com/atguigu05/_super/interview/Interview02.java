package com.atguigu05._super.interview;

/**
 * @author 尚硅谷-宋红康
 * @create 14:02
 */
public class Interview02{
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());//atguigu
        System.out.println(s.getInfo());//尚硅谷
        s.test();//尚硅谷,atguigu
        System.out.println("-----------------");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());//atguigu
        System.out.println(s.getInfo());//大硅谷
        s.test();//大硅谷 atguigu
    }
}
class Father{
    private String info = "atguigu";
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
}
class Son extends Father{
    private String info = "尚硅谷";
    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}
