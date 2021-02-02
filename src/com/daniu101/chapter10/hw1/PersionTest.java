package com.daniu101.chapter10.hw1;

public class PersionTest {

    public static void main(String[] args) {

        Persion persion = new Persion();
        persion.setName("张三");
        persion.setHeight(89.9D);
        persion.setAge(12);

        System.out.println(persion.toString());

    }
}
