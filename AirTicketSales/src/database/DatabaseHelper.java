package database;

import java.sql.*;

public class DatabaseHelper {
    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/databasename";
    private String name = "root";
    private String password = "kamal997";
    public DatabaseHelper(){

    }
    public Connection getConnection(){
        try{
            con = DriverManager.getConnection(url,name,password);
        }catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            return con;
        }
    }
}
