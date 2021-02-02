package Medi;
import java.util.*;
import Medi.*;
public class AMain {
	public static Scanner sc=new Scanner(System.in);
	public static ArrayList<Medicine> med=new ArrayList<Medicine>();
	public static ArrayList<HealthCare> health=new ArrayList<HealthCare>();
	public static void addMedicine() {
		System.out.println("Enter the name of the medicine");
		String s=sc.nextLine();
		System.out.println("Enter the quantity");
		int q=sc.nextInt();
		System.out.println("Enter price of each tablet");
		double p=sc.nextDouble();
		med.add(new Medicine(s,q,p));
	}
	public static void addHealthCare() {
		System.out.println("Enter the name of the product");
		String s=sc.nextLine();
		System.out.println("Enter the quantity");
		int q=sc.nextInt();
		System.out.println("Enter price of each product");
		double p=sc.nextDouble();
		health.add(new HealthCare(s,q,p));
	}
	public static void read() {
		System.out.println("    **********OUR STOCKS IN MEDICINE********");
		for(int i=0;i<med.size();i++) {
			System.out.println(med.get(i).name);
			System.out.println(med.get(i).quantity);
			System.out.println(med.get(i).price);
		}
		System.out.println("    **********OUR STOCKS IN HEALTHCARE PRODUCTS********");
		for(int i=0;i<health.size();i++) {
			System.out.println(health.get(i).name);
			System.out.println(health.get(i).quantity);
			System.out.println(health.get(i).price);
		}
	}
	public static void admin() {
		int n,temp,num,temp1;
		do {
			System.out.println("1.Login 2.Signup 3.Revert back");
			n=sc.nextInt();
			sc.nextLine();
			if(n==3) {
				break;
			}
			System.out.println("value of n "+n+" inside loop");
			switch(n) {
			case 1:
				if(AdminLoginSignup.AdminLogin()) {
					do {
						System.out.println("Enter which sevice you need 1.Create 2.Update 3.Read 4.Delete 5.Exit");
						num=sc.nextInt();
						switch(num) {
							case 1:
								do {
									System.out.println("1.medicine 2.Healthcare 3.revert back");
									temp=sc.nextInt();
									sc.nextLine();//-------->check<---------------------
									switch(temp) {
									case 1:
										addMedicine();
										break;
									case 2:
										addHealthCare();
										break;
									case 3:
										break;
									}
								}while(temp!=3);
								break;
							case 2:
								do {
									System.out.println("1.Update Medicine 2.Update Healthcare 3.Revert back");
									temp1=sc.nextInt();
									switch(temp1) {
									case 1:
										//updateMedicine();
										break;
									case 2:
										//updateHealthcare();
										break;
									case 3:
										break;
									}
								}while(temp1!=3);
								break;
							case 3:
								read();
								break;
							case 4:
								//delete();
								break;
							case 5:
								break;
						}
					}while(num!=5);					
				}
				else {
					admin();
				}
				break;
			case 2:
				AdminLoginSignup.AdminSignup();
				break;
			case 3:
				break;
			}
		}while(n<3);
		
	}
}
