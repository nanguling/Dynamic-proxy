package com.mystudy.shangjia;

import com.mystudy.factory.UsbKingFactory;
import com.mystudy.service.UsbSell;

public class WeiShang implements UsbSell {
    //代理的是 金士顿，定义目标厂家类
    private UsbKingFactory factory = new UsbKingFactory();
    @Override
    public float sell(int amount) {
        //调用目标类的方法
        float price = factory.sell(amount);
        //只增加1元
        price += 1;
        return price;
    }
}
