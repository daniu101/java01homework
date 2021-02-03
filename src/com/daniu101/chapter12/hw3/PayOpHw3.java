package com.daniu101.chapter12.hw3;

// 操作类
public class PayOpHw3 {

    // 传入的是父类
    /*
    多态的可扩展、简洁等体现在此方法上
     */
    public void usePay(PayHw3 payHw2){
        payHw2.payAccount();
        payHw2.returnAccount();
    }
}
