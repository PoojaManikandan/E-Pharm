package Medi;
import java.sql.SQLException;
import java.util.*;

public class AdminLoginSignup {
	static Scanner sc=new Scanner(System.in);
	String name,password,id;
	
	public static ArrayList<AdminLoginSignup> alog=new ArrayList<AdminLoginSignup>();
	AdminLoginSignup(String name,String id,String password){
		this.name=name;
		this.id=id;
		this.password=password;
	}
	
	public static void AdminSignup() {
		System.out.println("Enter your name : ");
		String s=sc.nextLine();
		System.out.println("Enter admin id : ");
		String id=sc.nextLine();
		System.out.println("Enter password : ");
		String password =sc.nextLine();
		try {
			Database.addAdmin(id,s,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alog.add(new AdminLoginSignup(s,id,password));
	}
	public static String checkValid(String idd,String pass) {
		for (AdminLoginSignup element : alog) {
			//System.out.println(element.id+" "+element.password+" "+element.name);
			if(idd.equals(element.id)) {
				//System.out.println("Insidde 1st if checks id");
				if(pass.equals(element.password)){
					System.out.println("Successful login "+element.name);
					return element.name;
				}
				else {
					System.out.println("Password incorrect");
					return "Password mismatch";
				}
			}
			else {
				System.out.println("Account not found..recheck login credentials or signup");
				return "signup";
			}
		}
		return " ";
	}
	public static boolean AdminLogin() {
		System.out.println("Enter your admin id: ");
		String n=sc.nextLine();
		System.out.println("Password: ");
		String pass=sc.nextLine();
		String name=checkValid(n,pass);
		if(name.equals("Password mismatch")) {
			//AMain.admin();
			return false;
		}
		else if(name.equals("signup")) {
			//AMain.admin();
			return false;
		}
		else if(name.equals(" ")) {
			return false;
		}
		else {
			System.out.println("Hello "+name);
			return true;
		}
		
	}
}
