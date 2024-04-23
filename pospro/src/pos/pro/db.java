/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Go
 */
public class db {
   
 public static Connection mycon(){
 
     String userName = "root";
     String userPassword = "";
     String databaseUrl = "jdbc:mysql://localhost:3306/pos";
     Connection con = null ;
     
     try {
         
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(databaseUrl,userName,userPassword);
         return con;
         
         
     } catch (ClassNotFoundException | SQLException e) {
         
         System.out.println(e);
         return null;
     }
     
 
 
 }   
    
    
    
}
