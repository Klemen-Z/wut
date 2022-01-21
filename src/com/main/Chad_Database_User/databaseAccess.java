package com.main.Chad_Database_User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class databaseAccess {

    private String user;
    private String database;
    private String host;
    private String password;
    private String command;
    private String url;
    private int port;


    Scanner sc1 = new Scanner(System.in);

    databaseAccess(String database, String host, String user, String password, int port, String DBLang) {
        setDatabase(database);
        setHost(host);
        setPassword(password);
        setUser(user);
        setPort(port);
        setUrl("jdbc:" + DBLang + "://" + this.host + ":" + this.port + "/" + this.database + "?autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true");
        try {

            Connection connector = DriverManager.getConnection(this.url, this.user, this.password);

            Statement statement = connector.createStatement();

            while (true) {
                System.out.println("Type in a MySQL command: ");
                setCommand(sc1.nextLine());
                sc1.reset();
                if (this.command.equalsIgnoreCase("stop")) {
                    statement.close();
                    connector.close();
                    return;
                } else {
                    ResultSet results = statement.executeQuery(this.command);
                    String ergStr = "";

                    while (results.next()) {
                        ergStr = ergStr.concat("\n" + results.getString("ID") + " " + results.getString("Name") + "\n");
                    }
                    System.out.println(ergStr);

                    results.close();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getCommand() {
        return command;
    }

    public String getDatabase() {
        return database;
    }

    public String getUrl() {
        return url;
    }

    public String getHost() {
        return host;
    }

    public String getPassword() {
        return password;
    }

    public int getPort() {
        return port;
    }

    public String getUser() {
        return user;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
