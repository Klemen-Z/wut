package main.Store;

public class P_ID_Manager {
    static int ProductNo = 0;
    public static int newProductNo(){
        ProductNo++;
        return ProductNo;
    }
}
