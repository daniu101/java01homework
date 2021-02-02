package com.daniu101.chapter10.hw2;

public class ApplePhoneTest {

    public static void main(String[] args) {

        ApplePhone applePhone = new ApplePhone();
        applePhone.setBrand("小米");
        applePhone.setState(true);
        applePhone.setSize(6.6D);

        System.out.println(applePhone.toString());

    }
}
