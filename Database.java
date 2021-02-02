package Medi;
import java.sql.*;
/*
 * 1.Import the sql package 
 * 2.load and register the driver
 * 3.Create a connection
 * 4.Create a statement
 * 5.execute a query
 * 6.process the results
 * 7.close connection
 */
public class Database {
//	public static void addCustomer(String id,String name,long phn,String addr,String email,String password) throws SQLException, ClassNotFoundException {
//		
//		String url="jdbc:mysql://localhost:3306/pharmacy";
//		String user="root";
//		String pass="pooja";
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url, user, pass);
//		Statement st=con.createStatement();
//		st.executeQuery("Insert into table customer values(id,name,phn,addr,email,password)");
////		ResultSet rs=st.executeQuery("");
////		rs.next();//takes the pointer to next record;
////		String temp=rs.getString("name");
//		st.close();
//		con.close();	
//	}
	
	
	public static void addAdmin(String id,String name,String password) throws ClassNotFoundException, SQLException {
		System.out.println("Inside db function");
		String url="jdbc:mysql://localhost:3306/pharmacy?autoReconnect=true&useSSL=false";
		String user="root";
		String pass="pooja";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st=con.createStatement();
		st.executeQuery("Insert into table customer values(id,name,password)");
		st.close();
		con.close();
		
		
//		String url="jdbc:mysql://localhost:3306/pharmacy?verifyServerCertificate=false&useSSL=true";
//		String user="root";
//		String pass="pooja";
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection(url, user, pass);
//		Statement st=con.createStatement();
//		ResultSet rs=st.executeQuery(" select a_name from adminn where a_id='po123' ");
//		rs.next();//takes the pointer to next record;
//		String temp=rs.getString("a_name");
//		System.out.println("temp "+temp);
//		st.close();
//		con.close();
	}
	
}



