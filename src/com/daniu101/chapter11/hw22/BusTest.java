package com.daniu101.chapter11.hw22;

/*
1行走功能
2倒车影像、车内音响
3防撞气囊、防撞停车
4自动泊车、巡航驾驶、上坡助力
5自动驾驶
 */
public class BusTest{

    public static void main(String[] args) {

        // 1
        System.out.println("*********************1");
        BusFirst busFirst = new BusFirst();
        busFirst.run();

        //2
        System.out.println("*********************2");
        BusSecond busSecond = new BusSecond();
        busSecond.run();
        busSecond.reRunImage();
        busSecond.vioce();

        //3
        System.out.println("*********************3");
        BusThird busThird = new BusThird();
        busThird.run();
        busThird.reRunImage();
        busThird.vioce();
        busThird.stopBag();
        busThird.stopPark();

        //4
        System.out.println("*********************4");
        BusForth busForth = new BusForth();
        busForth.run();
        busForth.reRunImage();
        busForth.vioce();
        busForth.stopBag();
        busForth.stopPark();
        busForth.autoRun();
        busForth.autoPark();
        busForth.upPower();

        //5
        System.out.println("*********************5");
        BusFifth busFifth = new BusFifth();
        busFifth.run();
        busFifth.reRunImage();
        busFifth.vioce();
        busFifth.stopBag();
        busFifth.stopPark();
        busFifth.autoRun();
        busFifth.autoPark();
        busFifth.upPower();
        busFifth.aiRun();

    }

}
