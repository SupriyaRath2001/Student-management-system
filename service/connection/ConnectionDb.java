package connection;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SAI PRAVA KHILAR
 */
import java.sql.*;
public class ConnectionDb {
    public static Connection cn=null;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jtmanagementsystem","root","system");
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        finally{
            return cn;
        }
    }
}
