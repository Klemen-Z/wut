package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Adresse {
    private String Name;
    private String Vorname;
    private int Zip;
    private String Strasse;
    private String Ort;

    Scanner sc1 = new Scanner(System.in);
    File log = new File("main/log.txt");
    FileWriter writer = new FileWriter("log.txt");

    Adresse() throws IOException {
        if (!log.exists()){
            log.createNewFile();
        }
        else{
            log.delete();
            log.createNewFile();
        }
        log.setWritable(true);
        System.out.println("Name bitte: ");
        setName(sc1.nextLine());
        sc1.reset();
        System.out.println("Vorname bitte: ");
        setVorname(sc1.nextLine());
        sc1.reset();
        System.out.println("Strasse bitte: ");
        setStrasse(sc1.nextLine());
        sc1.reset();
        System.out.println("Ort bitte: ");
        setOrt(sc1.nextLine());
        sc1.reset();
        System.out.println("ZIP bitte: ");
        setZip(sc1.nextInt());
        sc1.close();
        System.out.println("Name: " + getName() + " " + getVorname() + "\n" + "Strasse: " + getStrasse() + "\n" + "Ort: " + getOrt() + "\n" + "ZIP: " + getZip());
        writer.write("Name: " + getName() + "\n" + "Vorname: " + getVorname() + "\n" + "Strasse: " + getStrasse() + "\n" + "Ort: " + getOrt() + "\n" + "ZIP: " + getZip());
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        Adresse adresse = new Adresse();
    }

    public int getZip() {
        return Zip;
    }
    public String getName() {
        return Name;
    }
    public String getVorname() {
        return Vorname;
    }
    public String getStrasse() {
        return Strasse;
    }
    public String getOrt() {
        return Ort;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setStrasse(String strasse) {
        Strasse = strasse;
    }
    public void setVorname(String vorname) {
        Vorname = vorname;
    }
    public void setZip(int zip) {
        Zip = zip;
    }
    public void setOrt(String ort) {
        Ort = ort;
    }
}