package Hotel_Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection1 {
    Connection connection;

    Statement statement;

    public connection1(){
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms","root","Shivam@1773");
                statement = connection.createStatement();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        System.out.println("Connection Successful");
        }


    }