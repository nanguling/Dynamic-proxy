package com.mystudy.service;

public class GongNeng implements Hello {
    @Override
    public int print(String name) {
        System.out.println("其他人写好的功能方法");
        return 2;
    }
}
