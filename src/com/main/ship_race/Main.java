package com.main.ship_race;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
        Race derby = new Race("Kentucky Derby");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
