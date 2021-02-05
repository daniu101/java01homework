package com.daniu101.chapter13;

/*
作业一：定义一个抽象父类，计算图形的周长和面积；
然后封装正方形、三角形、圆的子类，分别计算它们的周长和面积。
并完成测试。
 */

// 测试类
public class ShapTest {

    public static void main(String[] args) {

        Shap shap = new Square();
        shap.line();
        shap.area();

        Trang trang = new Trang();
        trang.line();
        trang.area();

        Cir cir = new Cir();
        cir.line();
        cir.area();

    }

}
