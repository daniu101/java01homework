package com.daniu101.chapter11.hw2;

// 测试每一代车都有什么功能
public class CarTest{

    public static void main(String[] args) {

        //第1代车
        System.out.println("第1代车:");
        CarFirst carFirst = new CarFifth();
        carFirst.go();

        //第2代车
        System.out.println("第2代车:");
        CarSecond carSecond = new CarSecond();
        carSecond.go();
        carSecond.reversingImage();
        carSecond.voice();

        //第3代车
        System.out.println("第3代车:");
        CarThird carThird = new CarThird();
        carThird.go();
        carThird.reversingImage();
        carThird.voice();
        carThird.stopAirbag();
        carThird.stopPark();

        //第4代车
        System.out.println("第4代车:");
        CarForth carForth = new CarForth();
        carForth.go();
        carForth.reversingImage();
        carForth.voice();
        carForth.stopAirbag();
        carForth.stopPark();
        carForth.autoStop();
        carForth.autoGo();
        carForth.upPower();

        //第5代车
        System.out.println("第5代车:");
        CarFifth carFifth = new CarFifth();
        carFifth.go();
        carFifth.reversingImage();
        carFifth.voice();
        carFifth.stopAirbag();
        carFifth.stopPark();
        carFifth.autoStop();
        carFifth.autoGo();
        carFifth.upPower();
        carFifth.aiGo();

    }
}
