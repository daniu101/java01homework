package com.daniu101.chapter9.hw2;

import com.daniu101.chapter9.SkinColour;

public class Animal2Test {

    public static void main(String[] args) {

        //创建对象,并使用带参构造方法初始化
        Animal2 an = new Animal2(69.4D, SkinColour.BLACK,35D);

        //输出
        System.out.println(an.height);
        System.out.println(an.skinColour);
        System.out.println(an.weight);

        //调用传参的方法
        an.run(100);

    }

}
