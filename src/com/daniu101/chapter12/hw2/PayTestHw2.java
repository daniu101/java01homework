package com.daniu101.chapter12.hw2;

/*
作业二：在作业一的基础上，建立支付的操作类，
操作类中有使用支付的方法，传入参数为支付父类，并测试。
然后在不改变操作类代码的基础上，增加银联、美团、京东支付的子类，并测试。
 */
public class PayTestHw2 {

    public static void main(String[] args) {

        // 操作类的测试
        PayOpHw2 payOpHw2 = new PayOpHw2();

        // 应用多态
        AliPayHw2 aliPayHw2 = new AliPayHw2();
        payOpHw2.usePay(aliPayHw2);

        // 应用多态
        MeiPayHw2 meiPayHw2 = new MeiPayHw2();
        payOpHw2.usePay(meiPayHw2);
    }
}
