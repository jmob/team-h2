package de.rentajet.base;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author j.schipplick
 */
import java.sql.*;
import javax.swing.*;
public class javaconnect {
	
	Connection conn= null;
	public static Connection ConnectDb(){
	
	try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/teamh2", "root", "1234");
	JOptionPane.showMessageDialog( null, "Connection Established" );
	return conn;
	}catch (Exception e){
		JOptionPane.showMessageDialog( null, e );
		return null;
	
	}
	
	
	}
	
}
