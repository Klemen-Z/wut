package main.people.clothes;

public class Pants extends Clothes{

    Pants(int Size, String Brand, String Type) {
        super(Size, Brand, Type);
    }

    @Override
    void getClothes() {
        System.out.println("Size: " + getSize() + "Brand: " + getBrand() + "Type: " + getType());
    }
}
