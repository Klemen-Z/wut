package main.Store;

public class Cust_ID_Manager {
    static int CustID = 0;
    public static int newCustID(){
        CustID++;
        return CustID;
    }
}
