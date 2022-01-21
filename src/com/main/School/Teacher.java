package com.main.School;

import java.util.Random;

public class Teacher {

    private int Age;
    private String sClass;
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private int social_credit;

    private final String[] lastNames = new String[6];
    private final String[] firstNames = new String[6];
    private final String[] classes = new String[3];
    private final String[] phoneNums = new String[6];
    private final int[] ages = new int[3];

    Random r = new Random();

    Teacher(){
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
        setSocial_credit(1000);
    }

    Teacher(String FName, String LName, int age, String Classes){
        fillAges();
        fillClasses();
        fillFNames();
        fillLNames();
        fillPhoneNums();

        setAgee(age);
        setFirstNamee(FName);
        setLastNamee(LName);
        setsClasse(Classes);
        setPhoneNumber(r.nextInt(5));
        setSocial_credit(1000);
    }

    private void fillAges() {
        ages[0] = 30;
        ages[1] = 32;
        ages[2] = 28;
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
        int[] areaCode = new int[41];

        areaCode[0] = 21;
        areaCode[1] = 22;
        areaCode[2] = 24;
        areaCode[3] = 26;
        areaCode[4] = 27;
        areaCode[5] = 31;
        areaCode[6] = 33;
        areaCode[7] = 34;
        areaCode[8] = 41;
        areaCode[9] = 43;
        areaCode[10] = 44;
        areaCode[11] = 51;
        areaCode[12] = 52;
        areaCode[13] = 55;
        areaCode[14] = 56;
        areaCode[15] = 58;
        areaCode[16] = 61;
        areaCode[17] = 62;
        areaCode[18] = 71;
        areaCode[19] = 74;
        areaCode[20] = 76;
        areaCode[21] = 77;
        areaCode[22] = 78;
        areaCode[23] = 79;
        areaCode[24] = 800;
        areaCode[25] = 81;
        areaCode[26] = 840;
        areaCode[27] = 842;
        areaCode[28] = 844;
        areaCode[29] = 848;
        areaCode[30] = 860;
        areaCode[31] = 868;
        areaCode[32] = 869;
        areaCode[33] = 878;
        areaCode[34] = 900;
        areaCode[35] = 901;
        areaCode[36] = 906;
        areaCode[37] = 91;
        areaCode[38] = 98;
        areaCode[39] = 99;

        String temps;
        StringBuilder temp = new StringBuilder(areaCode[r.nextInt(39)] + " ");

        for (int i = 0; i < 3; i++){
            temps = String.valueOf(r.nextInt(9));
            temp.append(temps);
        }
        temp.append(" ");
        for (int j = 0; j < 2; j++){
            for (int i = 0; i < 2; i++){
                temps = String.valueOf(r.nextInt(9));
                temp.append(temps);
            }
            temp.append(" ");
        }

        return temp.toString();
    }

    public int getAge() {
        return Age;
    }

    public int getSocial_credit() {
        return social_credit;
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


    public void setAgee(int age) {
        this.Age = age;
    }

    public void setFirstNamee(String FName) {
        this.FirstName = FName;
    }

    public void setLastNamee(String LName) {
        this.LastName = LName;
    }

    public void setsClasse(String Classes) {
        this.sClass = Classes;
    }


    public void setSocial_credit(int social_credit) {
        this.social_credit = social_credit;
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