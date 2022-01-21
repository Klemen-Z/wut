package com.main;
public class billing {
    private double taxPercent = 0.19;
    private double billAmount = 100;
    private double discount = 0.03;
    private double bruttoAmount;
    private double discountedAmount;
    public double getDiscountedAmount() {
        return discountedAmount;
    }
    public double getBruttoAmount() {
        return bruttoAmount;
    }
    public double getDiscount() {
        return discount;
    }
    public double getBillAmount() {
        return billAmount;
    }
    public double getTaxPercent() {
        return taxPercent;
    }
    public void setDiscount(double Discount) {
        this.discount = Discount;
    }
    public void setBruttoAmount(double bruttoAmount) {
        this.bruttoAmount = bruttoAmount;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }
    public void setDiscountedAmount(double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }
    public double bruttoCalculation(){
        double temp;
        temp = this.billAmount * this.taxPercent;
        temp = temp + this.billAmount;
        setBruttoAmount(temp);
        System.out.println("Cost: " + this.bruttoAmount);
        return temp;
    }
    public double discountedamount(){
        double temp;
        temp = this.bruttoAmount * this.discount;
        temp = this.bruttoAmount - temp;
        setDiscountedAmount(temp);
        System.out.println("Cost: " + this.discountedAmount);
        return temp;
    }
    public void newBill(double discountTBA, double tax, double cost){
        setDiscount(discountTBA);
        setTaxPercent(tax);
        setBillAmount(cost);
    }
}
