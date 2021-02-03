package com.daniu101.chapter12.hw3;

public class AliPayHw3 extends PayHw3 {

    @Override
    public void payAccount(){
        System.out.println("支付宝的支付功能");
    }

    // 子类特有方法
    public void quickPay(){
        System.out.println("支付宝的快捷支付");
    }

}
