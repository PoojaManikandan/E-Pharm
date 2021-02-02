package Medi;
import java.util.*;
public class HealthCare {
	public static Scanner sc=new Scanner(System.in);
	public String name;
	public int quantity;
	public double price;
	public HealthCare(String name,int quantity,double price){
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	public HealthCare() {
		
	}
	public static boolean checkStock(String name,int quantity){
		for(HealthCare element:AMain.health) {
			if(element.name.equalsIgnoreCase(name) && element.quantity>=quantity) {
				return true;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static double getAmount(String name) {
		for(HealthCare element:AMain.health) {
			if(element.name.equalsIgnoreCase(name)) {
				return element.price;
			}
		}
		return 1.0;
	}
	public void orderHealthCareProduct() {
		System.out.println("Enter product name : ");
		String name=sc.next();
		System.out.println("Enter quantity : ");
		int quan=sc.nextInt();
		if(!checkStock(name,quan)) {
			System.out.println("Oops!!!currently we are under shortage of this tablet please do contact our nearby pharmacy");
		}
		else {
			double amt=quan*getAmount(name);
			System.out.println("Your request : "+name+" "+quan+" price: "+amt);
			System.out.println("Do you want to add to cart? 1.yes 2.no");
			int num=sc.nextInt();
			if(num==1) {
				Cart.hs.add(new Cart(name,quan,amt));
			}
			else {
			//	break;
			}
			
		}
		
	}
}