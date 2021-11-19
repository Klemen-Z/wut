package main;
import java.util.Random;
import java.util.Scanner;
public class Credit_Card {
    String name;
    String LName;
    private String typ;
    private int AcValue = 0;
    private int secretnum;
    private int accesparam = 200;
    private long cardNum;
    private final String[] opt = new String[3];
    Random r = new Random();
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    private String sec = "";
    private String sec2 = "";
    public void CreateCreditCard(){
        opt[0] = "scummy";
        opt[1] = "normal";
        opt[2] = "premium";
        int c = r.nextInt(3);
        this.typ = opt[c];
        for (int i = 0; i < 6;i++){
            setSec(sec + r.nextInt(9));
        }
        this.secretnum = Integer.parseInt(this.sec);
        for (int i = 0; i < 12;i++){
            setSec2(sec2 + r.nextInt(9));
        }
        if (c == 0){
            this.accesparam = 20;
        }
        if (c == 1){
            this.accesparam = 200;
        }
        if (c >= 2){
            this.accesparam = 2000;
        }
        this.cardNum = Long.parseLong(this.sec2);
        System.out.println("Please enter your first name: ");
        this.name = sc1.nextLine();
        System.out.println("Please enter your last name: ");
        this.LName = sc1.nextLine();
        String Owner = name + " " + LName;
        System.out.println("The Owner of this Credit card is " + Owner + ", Their card number is: " + this.cardNum + ", They are a " + this.typ + " member " + " and their Pin is: " + this.secretnum);
    }
    public void accessCreditCard(){
        if(this.accesparam == 0){
            System.out.println("Can't use this credit card anymore lol :P");
        }
        else{
            System.out.println("First Name: " + this.name + "\n Last Name: " + this.LName + "\n card Number: " + cardNum + "\n Pin: " + this.secretnum + "\n Current Value: " + this.AcValue + "\n Member Type: " + this.typ);
            this.accesparam--;
        }
    }
    public void choose(){
        while (true){
            System.out.println("input pin: ");
            String attemptAtPin = sc1.nextLine();
            if (!attemptAtPin.equals(Integer.toString(this.secretnum))){
                System.out.println("Try again buddy ol' pal");
            }
            else{
                break;
            }
        }
        while(true){
            System.out.println("What do you wish to do?");
            String r = sc3.nextLine();
            if (r.equalsIgnoreCase("r") || r.equalsIgnoreCase("remove")){
                removeValue();
            }
            else if (r.equalsIgnoreCase("ad") || r.equalsIgnoreCase("add")){
                addValue();
            }
            else if (r.equalsIgnoreCase("ac") || r.equalsIgnoreCase("access")){
                accessCreditCard();
            }
            else {
                System.out.println("left choosing process");
                closeScanners();
                break;
            }
        }
    }
    public void addValue(){
        if(this.accesparam == 0){
            System.out.println("Can't use this credit card anymore lol :P");
        }
        else{
            while (true){
                System.out.println("Insert added Value: ");
                try{
                    setAcValue(this.AcValue + sc2.nextInt());
                    break;
                } catch(Error ignored){
                }
            }
        }
    }
    public void removeValue(){
        if(this.accesparam == 0){
            System.out.println("Can't use this credit card anymore lol :P");
        }
        else{
            System.out.println("Insert removed Value: ");
            while (true){
                int temp;
                try{
                     temp = sc2.nextInt();
                    if (this.AcValue - temp <= 0){
                        this.AcValue = this.AcValue - temp;
                        System.out.println("You broke");
                        break;
                    }
                    else{
                        this.AcValue = this.AcValue - temp;
                        break;
                    }
                } catch(Error ignored){
                }
            }
        }
    }
    public void closeScanners(){
        sc1.close();
        sc2.close();
        sc3.close();
    }

    //get and set methods
    public long getCardNum() {
        return cardNum;
    }
    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }
    public int getSecretnum() {
        return secretnum;
    }
    public String getSec2() {
        return sec2;
    }
    public void setSec2(String sec2) {
        this.sec2 = sec2;
    }
    public int getAccesparam() {
        return accesparam;
    }
    public void setAccesparam(int accesparam) {
        this.accesparam = accesparam;
    }
    public void setAcValue(int acValue) {
        AcValue = acValue;
    }
    public int getAcValue() {
        return AcValue;
    }
    public void setSecretnum(int secretnum) {
        this.secretnum = secretnum;
    }
    public void setSec(String sec) {
        this.sec = sec;
    }
}