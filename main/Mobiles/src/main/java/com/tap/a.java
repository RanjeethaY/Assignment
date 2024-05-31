package com.tap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class a {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","root");
			PreparedStatement st=con.prepareStatement("update  mob  set files=?  where Name='Oppo' ");
		
			FileReader	f = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Mobiles\\img\\a.jsp");
			
			st.setCharacterStream(1,f);
			int i=st.executeUpdate();
			System.out.println(i);
			
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
