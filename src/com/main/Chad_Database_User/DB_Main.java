package com.main.Chad_Database_User;

import java.util.Scanner;

public class DB_Main {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("type host name (case sensitive): ");
        String host = sc1.nextLine();

        System.out.println("type access port: ");
        String port = sc1.nextLine();

        System.out.println("type database language (case sensitive): ");
        String DB_Lang = sc1.nextLine();

        System.out.println("type database name (case sensitive): ");
        String DB = sc1.nextLine();

        System.out.println("type username (case sensitive): ");
        String username = sc1.nextLine();

        System.out.println("type password (case sensitive): ");
        String password = sc1.nextLine();

        if (password == null){
            password = "";
        }

        databaseAccess DB_boi = new databaseAccess( DB, host, username, password, Integer.parseInt(port), DB_Lang);
    }
}
