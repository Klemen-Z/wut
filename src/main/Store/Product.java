package main.Store;

import java.util.Random;

public class Product {

    private int itemNo;
    private String Name;
    private double Price;
    private int qty;

    private final double[] Prices = new double[4];
    private final String[] Names = new String[4];

    Random r = new Random();

    Product(int itemNo, int qty){
        fillNames();
        fillPrices();

        setItemNo(itemNo);
        setName(Names[r.nextInt(3)]);
        setPrice(Prices[r.nextInt(3)]);
        setQty(qty);
    }

    private void fillNames() {
        Names[0] = "Air Freshener";
        Names[1] = "Soap";
        Names[2] = "Steak";
        Names[3] = "Milch";
    }
    private void fillPrices() {
        Prices[0] = 20.35;
        Prices[1] = 6.55;
        Prices[2] = 5.0;
        Prices[3] = 12.50;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public int getItemNo() {
        return itemNo;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
