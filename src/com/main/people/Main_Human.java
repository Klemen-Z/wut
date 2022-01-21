package com.main.people;

public class Main_Human {

    public static void main(String[] args) {
        Child Bobby = new Child(12, 130, 40, "Bob", "Kendrick", "Newspaper delivery.inc", "Delivery boy", 5, 1, false);
        System.out.println(" ");
        Teenager Tony = new Teenager(16, 170, 60, "Tony", "Brown", "McKing's", "Cashier", 12, 1, false);
        System.out.println(" ");
        Adult Andrea = new Adult(23, 175, 80, "Andrea", "Weissman", "SoftwareBuilders.ltd", "Project Manager", 25, 1.5, true);
        System.out.println(" ");
        Senior Hazel = new Senior(80, 175, 85, "Hazel", "Willman", "Unemployment benefits / Pension", "Retiree", 20, 1, true);
    }
}
