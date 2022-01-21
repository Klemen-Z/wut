package com.main.clothes;

public class Shirt extends Clothes{

    Shirt(int Size, String Brand, String Type) {
        super(Size, Brand, Type);
    }

    @Override
    void getClothes() {
        System.out.println("Size: " + getSize() + "Brand: " + getBrand() + "Type: " + getType());
    }
}
