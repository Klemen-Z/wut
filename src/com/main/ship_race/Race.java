package com.main.ship_race;

import java.util.*;

public class Race{

    private String name;

    ArrayList<String> ShipNames = new ArrayList<>();

    HashMap<Integer, Ship> Ships = new HashMap<>();
    HashMap<String, String> ShipTime = new HashMap<>();

    Race(String name) {
        setName(name);
        System.out.println("Welcome to the " + getName() + "");
        System.out.println("The competing ships are: ");
        fillNames();
        generateShips();
        getAllShips();
        start();
        getWinners();
    }

    public void fillNames(){
        ShipNames.add("Yamato");
        ShipNames.add("Long Lee");
        ShipNames.add("Vampire II");
        ShipNames.add("Puerto Rico");
        ShipNames.add("Conqueror");
        ShipNames.add("Xi Jing Ping");
    }

    public void getAllShips(){
        for(Ship ship: Ships.values()){
            System.out.println(ship.getNr() + " " + ship.getName());
        }
    }
    public void start(){
        for(Ship ship: Ships.values()){
            ShipTime.put(ship.getName() ,ship.timeForRace());
        }
    }
    public void getWinners(){
        int i = 1;
        SortedSet<Ship> orderOfWinners = new TreeSet<>(Ships.values());
        System.out.println(" ");
        System.out.println("The winners are: ");
        for (Ship ship: orderOfWinners) {
            System.out.println(i + " " + ship.getName());
            System.out.println("  Time (seconds): " + ship.getTimeS());
            i++;
        }
    }

    public void generateShips(){
        int i = 1;
        for (String name : ShipNames){
            Ships.put(i, new Ship(i, name));
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
