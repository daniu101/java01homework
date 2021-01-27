package com.daniu101.chapter9.hw2;

import com.daniu101.chapter9.SkinColour;

public class Animal2 {

    //身高
    double height;
    //肤色
    SkinColour skinColour;
    // 体重
    double weight;

    //带参构造方法
    public Animal2(double height, SkinColour skinColour, double weight) {

        this.height = height;
        this.skinColour = skinColour;
        this.weight = weight;
    }

    //吃饭方法
    void eat() {
        System.out.println("我是吃饭方法");
    }

    //跑一步方法
    void run(int number) {

        for (int i = 0; i < number; i++) {
            System.out.println("我是跑第" + i + "步方法");
        }

    }

}
