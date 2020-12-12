package com.mystudy.shangjia;

import com.mystudy.factory.UsbKingFactory;
import com.mystudy.service.UsbSell;

//taobao是一个商家，代理金士顿U盘的销售
public class TaoBao implements UsbSell {
    //声明 商家代理的厂家具体是谁
    private UsbKingFactory factory = new UsbKingFactory();


    //实现销售U盘的功能
    @Override
    public float sell(int amount) {
        //向厂家发送订单，告诉厂家发货
        float price = factory.sell(amount);//厂家的价格
        //商家需要加价，代理要增加价格
        price += 25;//增强功能,代理类在完成目标类方法调用后，增强了功能
        //在目标类的方法调用后，做其他功能，都是增强的意思
        System.out.println("淘宝商家，返回一个优惠券给你");

        //增加的价格
        return price;
    }
}
