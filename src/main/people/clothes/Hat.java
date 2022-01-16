package main.people.clothes;

public class Hat extends Clothes{

    Hat(int Size, String Brand, String Type) {
        super(Size, Brand, Type);
    }

    @Override
    void getClothes() {
        System.out.println("Size: " + getSize() + "Brand: " + getBrand() + "Type: " + getType());
    }
}
