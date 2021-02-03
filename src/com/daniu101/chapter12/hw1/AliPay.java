package com.daniu101.chapter12.hw1;

/*
作业一：定义一个支付父类，有金额属性，支付、退款方法，
并对金额属性进行封装保护。
子类有支付宝、微信、PayPal，并且各种支付方式都有独特的支付功能。
建立测试类，测试三种支付方式不同状态的方法调用。
 */
public class AliPay extends Pay{

    @Override
    public void payAccount(){
        System.out.println("支付包的支付功能");
    }

}
