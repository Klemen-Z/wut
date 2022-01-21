package com.main.time;

public class Time24 extends TimeFormat {

    Time24(int hours, int minutes) {
        super(hours, minutes);
    }

    @Override
    void dispTime() {
        System.out.println("The time is: " + getHour() + " : " + getMinute());
    }
}
