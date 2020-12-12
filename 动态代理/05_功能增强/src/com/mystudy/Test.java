package com.mystudy;

import com.mystudy.handler.MyHandler;
import com.mystudy.service.GongNeng;
import com.mystudy.service.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        /*GongNeng gn = new GongNeng();
        Integer num = gn.print("销售");
        System.out.println(num);*/

        //1.创建目标对象
        Hello gn = new GongNeng();
        //2.创建InvocationHandler对象
        InvocationHandler handler = new MyHandler(gn);
        //3.创建代理对象
        System.out.println("gn.getClass().getInterfaces():"+gn.getClass().getInterfaces()[0].getName());//com.mystudy.service.Hello
        Hello proxy =(Hello) Proxy.newProxyInstance(gn.getClass().getClassLoader(),gn.getClass().getInterfaces(),handler);
        //4.通过代理执行方法
        Integer res = proxy.print("xxx");
        System.out.println("通过动态代理完成增强功能:"+res);

    }
}
