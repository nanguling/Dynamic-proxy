package com.mystudy;

import com.mystudy.shangjia.WeiShang;

public class ShopMain {
    public static void main(String[] args) {

        //创建代理的商家taobao对象
        /*TaoBao taoBao = new TaoBao();
        //通过代理类，实现购买U盘，增加了优惠券等等
        float price = taoBao.sell(1);
        System.out.println("通过淘宝的商家，购买的U盘单价："+price);*/

        WeiShang weiShang = new WeiShang();
        float price = weiShang.sell(1);
        System.out.println("通过微商购买的价格:"+price);
    }


}
