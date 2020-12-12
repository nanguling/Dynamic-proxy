package com.mystudy.impl;

import com.mystudy.service.HelloServie;

public class Hello2 implements HelloServie {
    @Override
    public void sayHello(String s) {
        System.out.println("==你好:"+s);
    }
}
