package com.library.utils;

import java.sql.*;

public class DbConnection {
    private static final String url = "jdbc:jtds:sqlserver://localhost/LibraryDb";
    private static final String user = "sa";
    private static final String password = "root";

    public static Connection Connect() throws SQLException, ClassNotFoundException {
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        }catch (ClassNotFoundException e){
            throw new ClassNotFoundException();
        }
        catch (SQLException e){
            throw new SQLException();
        }
    }
}