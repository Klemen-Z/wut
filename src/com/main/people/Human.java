package com.main.people;

public abstract class Human {
    int age;
    int height;
    int weight;
    String firstName;
    String lastName;


    Human(int Age,int Height,int Weight,String FirstName, String LastName){
        setAge(Age);
        setHeight(Height);
        setWeight(Weight);
        setFirstName(FirstName);
        setLastName(LastName);
        dispStats();
    }

    public int getAge() {
        return age;
    }

    public String getHeight() {
        return height + "cm";
    }

    public String getWeight() {
        return weight + "kg";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    abstract void dispStats();
}
