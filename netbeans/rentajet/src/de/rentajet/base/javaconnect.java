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
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/teamh2?transformedBitIsBoolean=false&tinyInt1isBit=false", "root", "1234");
	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/teamh2?tinyInt1isBit=false", "root", "1234");
	//Connection conn = DriverManager.getConnection("jdbc:mysql:t//localhost/teamh2", "root", "1234" &tinyInt1isBit=" + "tinyInt1isBit"); transformedBitIsBoolean  ?transformedBitIsBoolean=false , "tinyInt1isBit= 'true'
	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/teamh2", "root", "1234");
	//JOptionPane.showMessageDialog( null, "Verbindung zur Datenbank ist hergestellt" );
	return conn;
	}catch (Exception e){
		JOptionPane.showMessageDialog( null, e );
		return null;
	
	}
	
	
	}
	
}
