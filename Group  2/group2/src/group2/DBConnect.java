/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group2;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author Admin
 */
public class DBConnect {
    
    public static Connection connect(){
        
        String db = "jdbc:mysql://localhost:3306/javaproject";
        String username = "root";
        String password = "";
        Connection con = null;
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection(db, username, password);
        }catch (Exception ex) {
            System.out.println("inter.DBConnect.connect()");
            JOptionPane.showConfirmDialog(null,ex);
        }
        return con;    
    }
    
}
