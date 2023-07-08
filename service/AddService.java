/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author SAI PRAVA KHILAR
 */
public class AddService {
    public static Connection cn= null;
    public static Statement st=null;
    public static boolean Add(String id,String name,String college,String passoutyear,String branch,String Course){
        try{
            cn =connection.ConnectionDb.getConnection();
            st=cn.createStatement();
            st.executeUpdate("insert into addstud values('"+id+"','"+name+"','"+college+"','"+passoutyear+"','"+branch+"','"+Course+"')");
            return true;
            
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        return false;
    }
}
