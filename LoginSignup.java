package Medi;
import java.sql.SQLException;
import java.util.*;
public class LoginSignup {
	public static ArrayList<LoginSignup> clog=new ArrayList<LoginSignup>();
	static Scanner sc=new Scanner(System.in);
	String name,addr,password,email;
	public long phn;
	String id;
	LoginSignup(String name,long phn,String addr,String email,String password){
		this.name=name;
		this.phn=phn;
		this.addr=addr;
		this.email=email;
		this.password=password;
	}
	LoginSignup(){
		
	}
	Database db=new Database();
	public void Csignup(){
		System.out.println("    ******LOGIN*******");
		System.out.println("Enter your mobile number to continue");
		long phn=sc.nextLong();
		sc.nextLine();
		System.out.println("Create an unique id: ");
		String id=sc.nextLine();
		System.out.println("Enter you full name: ");
		String name=sc.nextLine();
		System.out.println("Enter your full address: ");
		String addr=sc.nextLine();
		System.out.println("Enter email: ");
		String email=sc.nextLine();
		System.out.println("Enter password");
		String password=sc.nextLine();
//		try {
////			Database.addCustomer(id,name,phn,addr,email,password);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		clog.add(new LoginSignup(name,phn,addr,email,password));
	}
}
