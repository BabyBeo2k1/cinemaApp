/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinemaapp;

import java.sql.*;

/**
 *
 * @author admin
 */
public class connectDB {
    private Connection conn;
    private Statement statement;
    public Connection connect() throws SQLException{
        if(conn==null){
            String url="jbdc:mysql://localhost:3306/";
            String dbname="cinemadb";
            String driver="com.mysql.jdbc.Driver";
            String username="root";
            String password="";
        
            try
            {
                Class.forName(driver);
                this.conn= (Connection)DriverManager.getConnection(url+dbname,username,password);
                System.out.println("Connection successfully");
            }
            catch(ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
