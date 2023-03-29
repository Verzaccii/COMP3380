package com.example.airbnb.application;

public class Main {

    public static String connectionUrl = "jdbc:sqlserver://uranium.cs.umanitoba.ca;"
            + "database=Airbnb;"
            + "user=colomagz@uranium.cs.umanitoba.ca;"
            + "password=7917361;"
            + "encrypt=true;"
            + "trustServerCertificate=false;"
            + "loginTimeout=30;";

    public static String getConnectionUrl(){
        return connectionUrl;
    }
}
