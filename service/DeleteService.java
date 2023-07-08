/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;


/**
 *
 * @author SAI PRAVA KHILAR
 */
public class DeleteService {
    public static Connection cn=null;
    public static Statement st=null;
    public static boolean DeleteById(String name){
        try{
           cn= connection.ConnectionDb.getConnection();
           st= cn.createStatement();
           st.executeUpdate("delete from addstud where name='"+name+"'");
           return true;
           
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        return false;
    }
}
