package com.daniu101.chapter13;

/*
作业一：定义一个抽象父类，计算图形的周长和面积；
然后封装正方形、三角形、圆的子类，分别计算它们的周长和面积。
并完成测试。
 */

// 正方形
public class Trang extends  Shap{

    @Override
    public void line() {
        System.out.println("计算三角形的周长");
    }

    @Override
    public void area() {
        System.out.println("计算三角形的面积");
    }
}
