package main.clothes;

public class Shoes extends Clothes{

    Shoes(int Size, String Brand, String Type) {
        super(Size, Brand, Type);
    }

    @Override
    void getClothes() {
        System.out.println("Size: " + getSize() + "Brand: " + getBrand() + "Type: " + getType());
    }
}
