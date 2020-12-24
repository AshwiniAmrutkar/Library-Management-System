package libmaneg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/*
 *
 * @author SUMIT
 */
public class JDBC {
    
  
    
    public static void main(String[] args){
     
    try {
	      Class.forName("com.mysql.jdbc.Driver");
	    Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Management_System", "root", "Ashwini987");
            Statement s=c.createStatement();
            System.out.println("DATABASE CREATED SUCEEFULLY");
        }
	catch (Exception e)  //Handle other exceptions 
	{
	System.out.println(e);
	}
    }
}