/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecrans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Juliette
 */
public class DataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/junior","Juliette","serpentkawaii");
            Statement stmt=co.createStatement();
            ResultSet rs=stmt.executeQuery("select username,password from user"); 
            while(rs.next())  
                System.out.println(rs.getString(1)+"  "+rs.getString(2));
            co.close();  
        }
        catch (Exception e)
        {
            System.out.println(e);
        }  
    }
    
}
