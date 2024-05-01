import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class userBo {
	 static Connection con=null; 
	userBo(){
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dailypractisce","root","root");
	}
	 catch (ClassNotFoundException |SQLException e) {			
			e.printStackTrace();
		}
	}
	
	 public User[] getUsers() {
			ArrayList<User> l = new ArrayList<User>();
			User[] u = null;
		 try {
			 Statement st=con.createStatement();
		ResultSet r=st.executeQuery("select * from user");
			 while(r.next()) {
				 int id=r.getInt(1);
		         String un=r.getString(2);
		         String p=r.getString(3);
		         l.add(new User(id,un,p));	
			 }
			 u=new User[l.size()];
				for(int i=0;i<l.size();i++) {
		         u[i]=l.get(i);    
				}
			 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
	return u;
	 }
	private   String encryptPassword(String password) {
		char[] ch=password.toCharArray();
		for(int i=0;i<ch.length;i++) {
			ch[i]=(char)(ch[i]+1);
		}
		return String.valueOf(ch);
	}
	
	 public  boolean validate(String username, String password) {
		 String p=null;
		 String n=null;
		String enPassword=encryptPassword(password);
          try {
        	  PreparedStatement st= con.prepareStatement("select * from user where name=?");
			st.setString(1,username);
          ResultSet r=st.executeQuery();  
          if(r.next()) {
        	  n=r.getString(2);
        	 p=r.getString(3);
          }
          }
          catch (SQLException e) {
  			e.printStackTrace();
  		}
          if(n!=null && p!=null) {
          String sp=encryptPassword(p);
		if(username.compareTo(n)==0 &&  enPassword.compareTo(sp)==0) {
			return true;
	}
		}
	return false ;
	}
}
