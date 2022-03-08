/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinemaapp;

import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class CinemaApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        connectDB x=new connectDB();
        x.connect();
    }
    
}
