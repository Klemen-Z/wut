package com.main;
public class cow{
    private String name = " ";
    private double weight = 0;
    public String getCowName(){
        return this.name;
    }
    public double getCowWeight(){
        return this.weight;
    }
    public void setCowName(String Name){
        this.name = Name;
    }
    public void setCowWeight(Double Weight){
        this.weight = Weight;
    }
    public void getCow(){
        System.out.println("Name: " + getCowName());
        System.out.println("Weight: " + getCowWeight() + "kg");
    }
    public void setCow(String Name, double Weight){
        setCowName(Name);
        setCowWeight(Weight);
    }
}
