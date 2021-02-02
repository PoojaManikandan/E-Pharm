package Medi;
import java.util.*;
public class Cart {
	public static HashSet<Cart> hs=new HashSet<Cart>();
	public static Scanner sc=new Scanner(System.in);
	String name;
	int quantity;
	double price;
	Book b=new Book();
	Cart(String name,int quantity,double price){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	Cart(){
		
	}
	public void viewCart(){
		double sum=0;
		System.out.println();
		/*if(LoginSignup.isLogedin) {
			System.out.println("    ***********Your Cart*********");
			for(Cart elem:hs) {
				System.out.println(elem.name+" "+elem.quantity+" "+elem.price);
				sum+=elem.price;
			}
			System.out.println("Total amount :"+sum);
			System.out.println("Do you want to make any changes? 1.yes 2.no");
			int n=sc.nextInt();
			if(n==1) {
				//break;
			}
			else if(n==2) {
				System.out.println("Place order? 1.yes 2.no");
				int temp=sc.nextInt();
				if(temp==1) {
					System.out.println("Check all the details you have entered.....");
					System.out.println("Youe name : "+LoginSignup.name);
					System.out.println("Your mobile number : "+LoginSignup.phn);
					System.out.println("The product will be delivered to this address : "+LoginSignup.addr);
					System.out.println("Recheck the details enter '1' to make any changes '2' to proceed");
					temp=sc.nextInt();
					while(temp!=2){
						System.out.println("Which entity you need to be changed 1.Name 2.Phone number 3.Address");
						int tem=sc.nextInt();
						sc.nextLine();
						changeValues(tem);
						System.out.println("Corrected details : ");
						System.out.println("Youe name : "+LoginSignup.name);
						System.out.println("Your mobile number : "+LoginSignup.phn);
						System.out.println("The product will be delivered to this address : "+LoginSignup.addr);
						System.out.println("Recheck the details enter '1' to make any changes '2' to proceed");
						temp=sc.nextInt();
					}
					if(temp==2) {
						
						b.bookProduct();
					}
				}
				else {
					//break;
				}
				//break;
			}
		}
		else {
			System.out.println("Oops!! you haven't login your account");
			System.out.println("   ............Redirecting you to the login page........");
			LoginSignup l=new LoginSignup();
			l.loginsignup();
		}*/
	}
}
