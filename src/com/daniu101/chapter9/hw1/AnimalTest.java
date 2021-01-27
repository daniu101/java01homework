package com.daniu101.chapter9.hw1;

import com.daniu101.chapter9.SkinColour;

public class AnimalTest {

    public static void main(String[] args) {

        //创建对象
        Animal an = new Animal();

        //赋值
        an.height = 69.4D;
        an.skinColour = SkinColour.BLACK;
        an.weight = 34D;

        //输出
        System.out.println(an.height);
        System.out.println(an.skinColour);
        System.out.println(an.weight);

        //调用吃饭方法
        an.eat();
        //调用跑一步方法
        an.run();

    }

}
