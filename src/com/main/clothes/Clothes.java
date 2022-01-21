package com.main.clothes;

public abstract class Clothes {
    int size;
    String brand;
    String type;

    Clothes(int Size, String Brand, String Type){
        setBrand(Brand);
        setSize(Size);
        setType(Type);
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    abstract void getClothes();
}
