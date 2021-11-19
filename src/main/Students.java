package main;

import java.util.Random;

public class Students {

    private int Age;
    private String sClass;
    private String FirstName;
    private String LastName;
    private String PhoneNumber;

    private String[] lastNames = new String[6];
    private String[] firstNames = new String[6];
    private String[] classes = new String[3];
    private String[] phoneNums = new String[6];
    private int[] ages = new int[3];

    Random r = new Random();

    Students(){
        fillAges();
        fillClasses();
        fillFNames();
        fillLNames();
        fillPhoneNums();

        setAge(r.nextInt(2));
        setFirstName(r.nextInt(5));
        setLastName(r.nextInt(5));
        setsClass(r.nextInt(2));
        setPhoneNumber(r.nextInt(5));
        System.out.println("Student:" + "\n" + "Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Age: " + getAge() + "\n" + "Class: " + getsClass() + "\n" + "Phone Number: " + getPhoneNumber());
    }

    private void fillAges() {
        ages[0] = 15;
        ages[1] = 14;
        ages[2] = 16;
    }
    private void fillClasses() {
        classes[0] = "I2b";
        classes[1] = "I1b";
        classes[2] = "I3b";
    }
    private void fillFNames() {
        firstNames[0] = "Lucas";
        firstNames[1] = "Alex";
        firstNames[2] = "Stephan";
        firstNames[3] = "Marie";
        firstNames[4] = "Steve";
        firstNames[5] = "Elizabeth";
    }
    private void fillLNames() {
        lastNames[0] = "Smith";
        lastNames[1] = "Brown";
        lastNames[2] = "Williams";
        lastNames[3] = "Johnson";
        lastNames[4] = "Miller";
        lastNames[5] = "Davis";
    }
    private void fillPhoneNums() {
        phoneNums[0] = "+41 " + RandomPhoneNum();
        phoneNums[1] = "+41 " + RandomPhoneNum();
        phoneNums[2] = "+41 " + RandomPhoneNum();
        phoneNums[3] = "+41 " + RandomPhoneNum();
        phoneNums[4] = "+41 " + RandomPhoneNum();
        phoneNums[5] = "+41 " + RandomPhoneNum();
    }

    public String RandomPhoneNum(){
        int[] areacode = new int[40];

        areacode[0] = 21;
        areacode[1] = 22;
        areacode[2] = 24;
        areacode[3] = 26;
        areacode[4] = 27;
        areacode[5] = 31;
        areacode[6] = 33;
        areacode[7] = 34;
        areacode[8] = 41;
        areacode[9] = 43;
        areacode[10] = 44;
        areacode[11] = 51;
        areacode[12] = 52;
        areacode[13] = 55;
        areacode[14] = 56;
        areacode[15] = 58;
        areacode[16] = 61;
        areacode[17] = 62;
        areacode[18] = 71;
        areacode[19] = 74;
        areacode[20] = 76;
        areacode[21] = 77;
        areacode[22] = 78;
        areacode[23] = 79;
        areacode[24] = 800;
        areacode[25] = 81;
        areacode[26] = 840;
        areacode[27] = 842;
        areacode[28] = 844;
        areacode[29] = 848;
        areacode[30] = 860;
        areacode[31] = 868;
        areacode[32] = 869;
        areacode[33] = 878;
        areacode[34] = 900;
        areacode[35] = 901;
        areacode[36] = 906;
        areacode[37] = 91;
        areacode[38] = 98;
        areacode[39] = 99;

        String temps;
        String temp = "";

        temp = String.valueOf(areacode[r.nextInt(39)]) + " ";
        for (int i = 0; i < 3; i++){
            temps = String.valueOf(r.nextInt(9));
            temp = temp + temps;
        }
        temp = temp + " ";
        for (int j = 0; j < 2; j++){
            for(int i = 0; i < 2; i++){
                temps = String.valueOf(r.nextInt(9));
                temp = temp + temps;
            }
            temp = temp + " ";
        }
        return temp;
    }

    public int getAge() {
        return Age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getsClass() {
        return sClass;
    }

    public void setAge(int index) {
        this.Age = ages[index];
    }

    public void setFirstName(int index) {
        this.FirstName = firstNames[index];
    }

    public void setLastName(int index) {
        this.LastName = lastNames[index];
    }

    public void setPhoneNumber(int index) {
        this.PhoneNumber = phoneNums[index];
    }

    public void setsClass(int index) {
        this.sClass = classes[index];
    }
}
