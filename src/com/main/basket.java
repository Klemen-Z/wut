package com.main;
class basket {
    protected double billAmount;
    protected int amountOfStuff;
    protected double recievedTax;
    public void basket(double cost, int amount)
    {
        this.billAmount = cost;
        this.amountOfStuff = amount;
    }
    public void calculateTax()
    {
        this.recievedTax = 19* billAmount /119;
        this.billAmount = this.billAmount + recievedTax;
    }
    public double getBillAmount() {
        return billAmount;
    }
    public double getRecievedTax() {
        return recievedTax;
    }
    public int getAmountOfStuff() {
        return amountOfStuff;
    }
    public void endResult()
    {
        calculateTax();
        System.out.println("Total Cost: " + getBillAmount());
        System.out.println("Amount of Articlesin basket: " + getAmountOfStuff());
        System.out.println("Tax: " + getRecievedTax());
    }
}
