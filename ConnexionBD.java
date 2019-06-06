/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecrans;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Juliette
 */
public class ConnexionBD {
    
    public static Connection getConnection() throws ClassNotFoundException{
        
        Connection co = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            co = DriverManager.getConnection("jdbc:mysql://localhost:3306/junior","Juliette","serpentkawaii");
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return co;
    }
    
}
