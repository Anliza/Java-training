package com.systechafrica.assignments.pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBConnection {
    private static final Logger LOGGER = Logger.getLogger(DBConnection.class.getName());

    public Connection connectToDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//load db driver

            String connectionUrl = "jdbc:mysql://localhost:3306/anndb";
            String user = "root";
            String password = "Annliza22#";
            return DriverManager.getConnection(connectionUrl, user, password);//connect to db (anndb)
            
        } catch (ClassNotFoundException | SQLException e) {
            LOGGER.info("Connection to database failed");
            return null;
        }
        
    }

}
