package com.mystudy;

import com.mystudy.impl.Hello;
import com.mystudy.impl.Hello2;
import com.mystudy.service.HelloServie;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //Hello hello = new Hello();
        //hello.sayHello("张三");

        //使用反射机制执行sqyHello方法。核心：Method（类中方法）
        HelloServie hello = new Hello();
        //获取sayHello名称对应的Method类对象
        Method method = HelloServie.class.getMethod("sayHello", String.class);
        //通过method可以执行sayHello方法的调用
        /*
            invoke是Method类中的一个方法。表示执行方法的调用
            参数：
                1.Object，表示对象，要执行这个对象的方法
                2.Object... args，方法执行时的参数值
            返回值：
                Object，方法执行的返回值
         */
        //表达的意思就是：执行hello对象的sayHello，参数是李四
        HelloServie hello2 = new Hello2();
        Object ret = method.invoke(hello2,"李四");
    }
}
