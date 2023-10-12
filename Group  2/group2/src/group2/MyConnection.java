/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class MyConnection {
    Connection con;
    String db = "jdbc:mysql://localhost:3306/javaproject";
    String username = "root";
    String password = "";
        
        public MyConnection(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            }catch (ClassNotFoundException ex) {
                System.out.println("Class not found and unable to connect..."+ex.getLocalizedMessage());
            }try{
            con = DriverManager.getConnection(db, username, password);
        }catch (java.sql.SQLException ex2) {
            ex2.printStackTrace();
            }
        } 

  
}
