package Medi;
import java.util.*;

import Medi.*;
public class Medicine {
	public static Scanner sc=new Scanner(System.in);
	public int quantity;
	public double price;
	public String name;
	public Medicine(String name,int quantity,double price){
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	public Medicine() {
	}
	public static String getEquiCity(int num){
		if(num==641010)//perur
			return "perur";
		else if(num==641045)//ramanathapuram
			return "ramanathapuram";
		else if(num==641035)//saravampatti
			return "saravampatti";
		else if(num==641015)//uppilipalayam
			return "uppilipalayam";
		else if(num==641004)//peelamedu
			return "peelamedu";
		else if(num==641006)//ganapathy
			return "ganapathy";
		else if(num==641012)//gandipuram
			return "gandipuram";
		else if(num==641103)//irugur
			return "irugur";
		return "";
	}
	public static boolean checkTablet(String name,int quantity) {
		for (Medicine element : AMain.med) {
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
		for (Medicine element : AMain.med) {
			if(element.name.equalsIgnoreCase(name)) {
				return element.price;
			}
		}
		return 0;
	}
	public static void orderViaPrescription(){
		System.out.println("Enter the name of the product given in your prescription");
		String name=sc.nextLine();
		System.out.println("Quantity : ");
		int quantity=sc.nextInt();
		if(!checkTablet(name,quantity)){
			System.out.println("Oops!!!currently we are under shortage of this tablet please do contact 987654217");
		}
		else{
			System.out.println("We have the product you requested");
			double p=quantity*getAmount(name);
			System.out.println("Your request : "+name+" "+quantity+" Price:"+p);
			System.out.println("Do you want to add to cart? : 1.Yes 2.No");
			int num=sc.nextInt();
			if(num==1) {
				Cart.hs.add(new Cart(name,quantity,p));
			}
			else {
				//break;
			}
		}
	}
	public static void needPrescription() {
		System.out.println("Call on medical tollfree- 1800 980 1234");
	}
	public void orderMedicine() {
		System.out.println("Type pincode");
		int pincode=sc.nextInt();
		int num;
		System.out.println(getEquiCity(pincode));
		do {
		System.out.println("Choose 1.Order via prescription 2.Need a prescription 3.revert back");
		num=sc.nextInt();
		sc.nextLine();
		switch(num){
			case 1:
				orderViaPrescription();
				break;
			case 2:
				needPrescription();
				break;
			case 3:
				break;
		}
		}while(num!=3);	
	}	
}