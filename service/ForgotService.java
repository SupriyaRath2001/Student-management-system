/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;

/**
 *
 * @author SAI PRAVA KHILAR
 */
public class ForgotService {
    public static Connection cn=null;
    public static Statement st=null;
    public static boolean Forgotpassword(String Name,String Password){
        try{
            cn=connection.ConnectionDb.getConnection();
            st= cn.createStatement();
            st.execute("update student set password ='"+Password+"' where Name='"+Name+"'" );
            return true;
        }
        catch(SQLException se){
            se.printStackTrace();
    }
        return false;
    }
}
