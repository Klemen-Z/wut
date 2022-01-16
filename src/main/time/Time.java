package main.time;

import java.util.HashMap;
import java.util.Random;

public class Time {

    HashMap<Integer, TimeFormat> times = new HashMap<>();

    Random r = new Random();

    Time(){
        generateTimes(3);
    }

    public void generateTimes(int amount){
        int i = 0;
        while(i < amount){
            times.put(i, new Time12((r.nextInt(23) + 1), r.nextInt(59)));
            i++;
        }
        while(i < (amount * 2)){
            times.put(i, new Time24(r.nextInt(23), r.nextInt(59)));
            i++;
        }
    }

    public static void main(String[] args) {
        Time t = new Time();
    }
}
