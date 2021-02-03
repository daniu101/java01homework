package com.daniu101.chapter12.hw3;

/*
作业三：在作业一二的基础上，
给支付宝、PayPal、美团增加特有的快捷支付方法，
并通过多态的转型进行特有方法的测试。
 */
public class PayTestHw3 {

    public static void main(String[] args) {

        // 就是普通的类使用
        System.out.println("************************");
        AliPayHw3 aliPayHw3 = new AliPayHw3();
        aliPayHw3.payAccount();
        aliPayHw3.returnAccount();
        // 特有方法
        aliPayHw3.quickPay();

        // 多态
        System.out.println("**********************");
        PayHw3 payHw3  = new AliPayHw3();
        payHw3.payAccount();
        payHw3.returnAccount();
        // 父类对象时不能调用子类特有方法 无法调用
        //payHw3.quickPay();

        // 通过转型 调用特有方法
        System.out.println("**********************");
        AliPayHw3 payHw3Ali = (AliPayHw3)payHw3;
        payHw3Ali.quickPay();

    }
}
