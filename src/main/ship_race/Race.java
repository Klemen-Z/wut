package main.ship_race;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Race {

    Random r = new Random();

    private String name;

    ArrayList<String> ShipNames = new ArrayList<>();

    HashMap<Integer, Ship> Ships = new HashMap<>();
    HashMap<Integer, Integer> ShipTime = new HashMap<>();

    Race(String name){
        setName(name);
        System.out.println("Welcome to the " + getName() + "");
        fillNames();
        generateShips();
        getAllShips();
        start();
    }

    public void fillNames(){
        ShipNames.add("Yamato");
        ShipNames.add("Long Lee");
        ShipNames.add("Vampire II");
        ShipNames.add("Puerto Rico");
        ShipNames.add("Conqueror");
    }

    public void getAllShips(){
        for(Ship ship: Ships.values()){
            System.out.println(ship.getNr() + " " + ship.getName());
        }
    }
    public void start(){
        int i = 1;
        for(Ship ship: Ships.values()){
            ShipTime.put(i ,ship.timeForRace());
            i++;
        }
    }

    public String namePick(){
        String name;
        int index;
        if (ShipNames.size() > 1){
            index = r.nextInt(ShipNames.size() - 1);
        } else{
            index = 0;
        }
        name = ShipNames.get(index);
        ShipNames.remove(index);
        return name;
    }

    public void generateShips(){
        int i = 1;
        while (i < 6){
            Ships.put(i, new Ship(i, namePick()));
            i++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}