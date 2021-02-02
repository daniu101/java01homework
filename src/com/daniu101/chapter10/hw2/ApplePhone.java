package com.daniu101.chapter10.hw2;

/*
作业二：封装一苹果手机类，其属性有品牌、尺寸、开机状态，打电话和上网行为，
使用关键字private保护尺寸和开机状态在合适的范围内，并建立测试类进行测试。
然后重写toString方法，输出类似10.1.5的第二个toString例子。
 */
public class ApplePhone {

    String brand;
    private double size;
    private boolean state;

    void call(){
        System.out.println("打电话");
    }

    void network(){
        System.out.println("上网");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size < 0){
            System.out.println("尺寸不能小于0");
        }else {
            this.size = size;
        }

    }

    public boolean setState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "这是一个toString方法";
    }
}
