package Hotel.Management.System;

import java.sql.*;
public class Connect {
	
	Connection c;
	Statement s;
	
	public Connect() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/projecthms","root","######"); // Instead of '#' type your MySQL Password'
			s = c.createStatement();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
public static void main(String[] args) {

}
}
