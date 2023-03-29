package com.example.airbnb.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AirbnbDB {

    //initialize db path in the constructor
    private String connectionUrl;

    public AirbnbDB(final String url) {
        connectionUrl = url;
    }

    private String fromResultSet(final ResultSet rs){

        return "";
    }


}
