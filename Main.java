package Medi;
import java.util.*;
public class Main {
	public static void checkOffer() {
		System.out.println("1.Use code 'flat20' to get 20% offer on purchase more than 500");
		System.out.println("2.Use code 'firstoff' to get 5% offer on any purchase");
		System.out.println("3.Use code 'coronaoff' to get a 50ml sanitizer free on purchase on more than 400");
		System.out.println();
	}
	public static void  customer() {
		int n;
		System.out.println();
		System.out.println("               *************E-PHARM WELCOMES YOU*************");
		System.out.println();
		do{
			System.out.println("Choose the service you look for");
			System.out.println("1.Order Medicine 2.HealthCare Products 3.Check offers 4.Login/Signup 5.View Cart 6.exit");
			n=sc.nextInt();
			switch(n){
				case 1:
					m.orderMedicine();
					//Order Medicine   flutter
					break;
				case 2:
					h.orderHealthCareProduct();
					//HealthCare Products
					break;
				case 3:
					checkOffer();
					//check offers
					break;
				case 4:
					//l.Csignup();
					break;
				case 5:
					c.viewCart();
					break;
				case 6:
					//exit
					break;
			}
		}while(n!=6);
	}
	public static HealthCare h=new HealthCare();
	public static Medicine m=new Medicine(); 
	public static LoginSignup l=new LoginSignup();
	public static Cart c=new Cart();
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		do{
			System.out.println("1.Admin 2.Customer 3.exit");
			num=sc.nextInt();
			switch(num) {
			case 1:
				AMain.admin();
				break;
			case 2:
				customer();
				break;
			case 3:
				break;
			}
		}while(num!=3);
	}
}