package main.ship_race;

import java.util.Random;

public class Ship {

    Random r = new Random();

    private String name;
    private int timeS;
    private int nr;

    Ship(int nr, String name){
           setName(name); setNr(nr);
    }
    public int timeForRace(){
        int time = r.nextInt(600);
        while (time < 300){
            time = r.nextInt(600);
        }
        setTimeS(time);
        return time;
    }

    public int getNr() {
        return nr;
    }

    public int getTimeS() {
        return timeS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public void setTimeS(int timeS) {
        this.timeS = timeS;
    }
}
