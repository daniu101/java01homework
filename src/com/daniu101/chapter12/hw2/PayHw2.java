package com.daniu101.chapter12.hw2;

public class PayHw2 {

    // 暂用 double
    private double account;

    public void payAccount(){
        System.out.println("父类的支付功能");
    }

    public void returnAccount(){
        System.out.println("父类的退款方法");
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}
