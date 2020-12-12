package com.mystudy.factory;

import com.mystudy.service.UsbSell;


//目标类：金士顿厂家,不接受用户的单独购买。
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        System.out.println("目标类中方法被调用了");
        //一个18G的U盘是85
        //后期可以根据amount，可以实现不同的价格，例如一次卖一万个，单价是80
        return 85.0f;
    }
}
