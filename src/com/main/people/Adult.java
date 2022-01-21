package com.main.people;

public class Adult extends Human{
    Adult(int Age, int Height, int Weight, String FirstName, String LastName, String Job_Name, String Position, int Salary, double Multiplier, boolean fullTime) {
        super(Age, Height, Weight, FirstName, LastName);
        Job job = new Job(Job_Name, Salary, Multiplier, Position, fullTime);
    }

    @Override
    void dispStats() {
        System.out.println("Age: " + getAge() + ", Height: " + getHeight() + ", Weight: " + getWeight() + ", Name: " + getFirstName() + " " + getLastName());
    }
}
