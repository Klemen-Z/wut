package com.main.time;

public class Time12 extends TimeFormat {

    Time12(int hour, int minute) {
        super(hour, minute);
    }

    @Override
    void dispTime() {
        int h = getHour();
        String type;
        if (h > 12){
            type = "pm";
            h = h - 12;
        } else {
            type = "am";
        }
        System.out.println( "The time is: " + h + " : " + getMinute() + " " + type);
    }
}
