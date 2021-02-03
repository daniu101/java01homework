package com.daniu101.chapter12.hw3;

public class PayPalPayHw3 extends PayHw3 {

    @Override
    public void payAccount(){
        System.out.println("PayPal的支付功能");
    }

    // 子类特有方法
    public void quickPay(){
        System.out.println("PayPal的快捷支付");
    }

}
