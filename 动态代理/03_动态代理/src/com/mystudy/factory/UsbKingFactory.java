package com.mystudy.factory;

import com.mystudy.service.UsbSell;

//目标类
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        //目标方法
        System.out.println("目标类中执行了目标类的sell方法");
        return 85.0f;
    }
}
