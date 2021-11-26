package main.Store;

import java.util.Random;

public class ProCust {

    public static void main(String[] args) {

        Random r = new Random();
        Customer c1 = new Customer(Cust_ID_Manager.newCustID());
        Product p1 = new Product(P_ID_Manager.newProductNo(), r.nextInt(100));
        Customer c2 = new Customer(Cust_ID_Manager.newCustID());
        Product p2 = new Product(P_ID_Manager.newProductNo(), r.nextInt(100));

        System.out.println("\nCustomer:\n" + "Customer id: " + c1.getCustID() + "\n" + "Customer name: " + c1.getFirstName() + " " + c1.getLastName() + "\n" + "Customer PhoneNum: " + c1.getPhoneNumber() + "\n" + "Address: " + c1.getAddress());
        System.out.println("\nCustomer:\n" + "Customer id: " + c2.getCustID() + "\n" + "Customer name: " + c2.getFirstName() + " " + c2.getLastName() + "\n" + "Customer PhoneNum: " + c2.getPhoneNumber() + "\n" + "Address: " + c2.getAddress());
        System.out.println("\nProduct:\n" + "Product Num: " + p1.getItemNo() + "\n" + "Product name: " + p1.getName() + "\n" + "Product price: " + p1.getPrice() + "\n" + "Product quantity: " + p1.getQty() + "\n" + "Total: " + p1.getQty()*p1.getPrice());
        System.out.println("\nProduct:\n" + "Product Num: " + p2.getItemNo() + "\n" + "Product name: " + p2.getName() + "\n" + "Product price: " + p2.getPrice() + "\n" + "Product quantity: " + p2.getQty() + "\n" + "Total: " + p2.getQty()*p2.getPrice());
    }
}
