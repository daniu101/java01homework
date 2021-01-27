package com.daniu101.chapter8.hw1;

public class SwitchWeek {

    public static void main(String[] args) {

        Week week = Week.SUNDAY;

        switch (week) {
            //case 穿透
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                System.out.println("996的公司今天上班");
                break;
            case SUNDAY:
                System.out.println("今天终于放假了");
                // Tip 应该加上 break 跳出整个switch
                break;
            default:
                System.out.println("不知道今天周几");
                break;

        }
    }

}
