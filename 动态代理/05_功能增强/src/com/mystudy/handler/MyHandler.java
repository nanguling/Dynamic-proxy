package com.mystudy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
    private Object obj = null;

    public MyHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //1.调用目标方法
        Object res = null;
        res = method.invoke(obj,args);

        //2.完成增强功能
        if (res != null) {
            Integer newRes = (Integer) res*2;
        }

        return res;
    }
}
