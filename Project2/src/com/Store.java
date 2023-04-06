package com;
import java.util.Scanner;
public class Store {
	void method1() {
		System.out.println("Welcome to Acqua-Store");
		System.out.println("-----------------------------------");
		System.out.println("1)Prawns");
		System.out.println("2)Fish");
		System.out.println("3)Crab");
		System.out.println("-----------------------------------");
		System.out.println("Enter your choice :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("-----------------------------------");
		switch(a) {
			case 1:
				System.out.println("Select type of Prawns you need");
				System.out.println("-----------------------------------");
				System.out.println("1)Vanmeni------------1kg-------Rs.350");
				System.out.println("2)Tiger--------------1kg-------Rs.550");
				System.out.println("3)Godavri Prawns-----1kg-------Rs.220");
				System.out.println("4)Andi Prawns--------1kg-------Rs.200");
				System.out.println("5)Lake Prawns--------1kg-------Rs.100");
				System.out.println("-----------------------------------");
				System.out.println("Enter your choice :");
				int type=sc.nextInt();
				if(type==1) {
					System.out.println("Kg's required :");
					int c=sc.nextInt();
					System.out.println("-----------------------------------");
					int price=c*350;
					System.out.println("Total Amount :Rs."+price);
					System.out.println("-----------------------------------");
					System.out.println("Press 1 to order");
					System.out.println("Press 2 for Main Menu");
					System.out.println("Press 3 to exit");
					System.out.println("-----------------------------------");
					int d=sc.nextInt();
					if(d==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Prawns"+"          "+"Vanameni"+"           "+c+"           "+price);
						System.out.println("---------------------------------------------------");
						if(price>=1000) {
							System.out.println("Congratulations you had got 10% discount on above Rs.1000 purchase");
							int discount=(price*10)/100;
							int amount=price-discount;
							System.out.println("Total Price         : "+price);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+price);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+price);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(d==2) {
						this.method1();
					}
					else {
						break;
					}
				}
				else if(type==2) {
					System.out.println("Kg's required :");
					int c=sc.nextInt();
					System.out.println("-----------------------------------");
					int price=c*550;
					System.out.println("Total Amount :Rs."+price);
					System.out.println("-----------------------------------");
					System.out.println("Press 1 to order");
					System.out.println("Press 2 for Main Menu");
					System.out.println("Press 3 to exit");
					System.out.println("-----------------------------------");
					int d=sc.nextInt();
					if(d==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Prawns"+"          "+"Tiger"+"           "+c+"           "+price);
						System.out.println("---------------------------------------------------");
						if(price>=1000) {
							System.out.println("Congratulations you had got 10% discount on above Rs.1000 purchase");
							int discount=(price*10)/100;
							int amount=price-discount;
							System.out.println("Total Price         : "+price);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+price);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+price);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(d==2) {
						this.method1();
					}
					else {
						break;
					}
				}
				else if(type==3) {
					System.out.println("Kg's required :");
					int c=sc.nextInt();
					System.out.println("-----------------------------------");
					int price=c*220;
					System.out.println("Total Amount :Rs."+price);
					System.out.println("-----------------------------------");
					System.out.println("Press 1 to order");
					System.out.println("Press 2 for Main Menu");
					System.out.println("Press 3 to exit");
					System.out.println("-----------------------------------");
					int d=sc.nextInt();
					if(d==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Prawns"+"       "+"Godavri Prawns"+"       "+c+"           "+price);
						System.out.println("---------------------------------------------------");
						if(price>=1000) {
							System.out.println("Congratulations you had got 10% discount on above Rs.1000 purchase");
							int discount=(price*10)/100;
							int amount=price-discount;
							System.out.println("Total Price         : "+price);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+price);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+price);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(d==2) {
						this.method1();
					}
					else {
						break;
					}
				}
				else if(type==4) {
					System.out.println("Kg's required :");
					int c=sc.nextInt();
					System.out.println("-----------------------------------");
					int price=c*220;
					System.out.println("Total Amount :Rs."+price);
					System.out.println("-----------------------------------");
					System.out.println("Press 1 to order");
					System.out.println("Press 2 for Main Menu");
					System.out.println("Press 3 to exit");
					System.out.println("-----------------------------------");
					int d=sc.nextInt();
					if(d==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Prawns"+"        "+"Andi Prawns"+"          "+c+"           "+price);
						System.out.println("---------------------------------------------------");
						if(price>=1000) {
							System.out.println("Congratulations you had got 10% discount on above Rs.1000 purchase");
							int discount=(price*10)/100;
							int amount=price-discount;
							System.out.println("Total Price         : "+price);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+price);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+price);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(d==2) {
						this.method1();
					}
					else {
						break;
					}
				}
				else if(type==5) {
					System.out.println("Kg's required :");
					int c=sc.nextInt();
					System.out.println("-----------------------------------");
					int price=c*100;
					System.out.println("Total Amount :Rs."+price);
					System.out.println("-----------------------------------");
					System.out.println("Press 1 to order");
					System.out.println("Press 2 for Main Menu");
					System.out.println("Press 3 to exit");
					System.out.println("-----------------------------------");
					int d=sc.nextInt();
					if(d==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Prawns"+"       "+"Lake Prawns"+"          "+c+"           "+price);
						System.out.println("---------------------------------------------------");
						if(price>=1000) {
							System.out.println("Congratulations you had got 10% discount on above Rs.1000 purchase");
							int discount=(price*10)/100;
							int amount=price-discount;
							System.out.println("Total Price         : "+price);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+price);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+price);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(d==2) {
						this.method1();
					}
					else {
						break;
					}
				}
				break;
			case 2:
				System.out.println("Select type od Fish you need");
				System.out.println("-----------------------------------");
				System.out.println("1)Pandukappa---------1kg------Rs.1500");
				System.out.println("2)Silavathi----------1kg------Rs.800");
				System.out.println("3)Gadichepa----------1kg------Rs.500");
				System.out.println("4)Bangaruthiga-------1kg------Rs.900");
				System.out.println("-----------------------------------");
				System.out.println("Enter your choice :");
				int f1=sc.nextInt();
				if(f1==1) {
					System.out.println("Enter No.of Kg's required :");
					int fkg=sc.nextInt();
					System.out.println("---------------------------------");
					int famount=fkg*1500;
					System.out.println("Total amount :"+famount);
					System.out.println("---------------------------------");
					System.out.println("Press 1 to order");
					System.out.println("Press 2 for Main Menu");
					System.out.println("Press 3 to exit");
					System.out.println("-----------------------------------");
					int fa=sc.nextInt();
					if(fa==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Fish"+"          "+"Pandukappa"+"          "+fkg+"          "+famount);
						System.out.println("---------------------------------------------------");
						if(famount>=1000) {
							System.out.println("Congratulations you had got 10% discount on above Rs.1000 purchase");
							int discount=(famount*10)/100;
							int amount=famount-discount;
							System.out.println("Total Price         : "+famount);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(fa==2) {
						this.method1();
					}
					else {
						break;
					}
				}
				else if(f1==2) {
					System.out.println("Enter No.of Kg's required :");
					int fkg=sc.nextInt();
					System.out.println("---------------------------------");
					int famount=fkg*500;
					System.out.println("Total amount :"+famount);
					System.out.println("---------------------------------");
					System.out.println("Press 1 to order");
					System.out.println("Press 2 for Main Menu");
					System.out.println("Press 3 to exit");
					System.out.println("-----------------------------------");
					int fa=sc.nextInt();
					if(fa==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Fish"+"          "+"Silavathi"+"          "+fkg+"          "+famount);
						System.out.println("---------------------------------------------------");
						if(famount>=1000) {
							System.out.println("Congratulations you had got 10% discount on above Rs.1000 purchase");
							int discount=(famount*10)/100;
							int amount=famount-discount;
							System.out.println("Total Price         : "+famount);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(fa==2) {
						this.method1();
					}
					else {
						break;
					}
				}
				else if(f1==3) {
					System.out.println("Enter No.of Kg's required :");
					int fkg=sc.nextInt();
					System.out.println("---------------------------------");
					int famount=fkg*800;
					System.out.println("Total amount :"+famount);
					System.out.println("---------------------------------");
					System.out.println("Press 1 to order");
					System.out.println("Press 2 for Main Menu");
					System.out.println("Press 3 to exit");
					System.out.println("-----------------------------------");
					int fa=sc.nextInt();
					if(fa==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Fish"+"          "+"Gadichepa"+"          "+fkg+"          "+famount);
						System.out.println("---------------------------------------------------");
						if(famount>=1000) {
							System.out.println("Congratulations you had got 10% discount on above Rs.1000 purchase");
							int discount=(famount*10)/100;
							int amount=famount-discount;
							System.out.println("Total Price         : "+famount);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);;
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(fa==2) {
						this.method1();
					}
					else {
						break;
					}
				}
				else if(f1==4) {
					System.out.println("Enter No.of Kg's required :");
					int fkg=sc.nextInt();
					System.out.println("---------------------------------");
					int famount=fkg*800;
					System.out.println("Total amount :"+famount);
					System.out.println("---------------------------------");
					System.out.println("Press 1 to order");
					System.out.println("Press 2 for Main Menu");
					System.out.println("Press 3 to exit");
					System.out.println("-----------------------------------");
					int fa=sc.nextInt();
					if(fa==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Fish"+"          "+"Bangaruthiga"+"          "+fkg+"          "+famount);
						System.out.println("---------------------------------------------------");
						if(famount>=1000) {
							System.out.println("Congratulations you had got 10% discount on above Rs.1000 purchase");
							int discount=(famount*10)/100;
							int amount=famount-discount;
							System.out.println("Total Price         : "+famount);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(fa==2) {
						this.method1();
					}
					else {
						break;
					}
				}
				break;
			case 3:
				System.out.println("Select type of Crab you need");
				System.out.println("-----------------------------------");
				System.out.println("1)Guddupetha---------1kg-----Rs.1200");
				System.out.println("2)Normal Crab--------1kg-----Rs.600");
				System.out.println("-----------------------------------");
				System.out.println("Enter your choice :");
				int c1=sc.nextInt();
				if(c1==1) {
					System.out.println("Enter No.of Kg's required :");
					int fkg=sc.nextInt();
					System.out.println("---------------------------------");
					System.out.println("---------------------------------");
					int famount=fkg*1200;
					System.out.println("Total amount :"+famount);
					System.out.println("Press 1 to order");
					System.out.println("Press 2 for Main Menu");
					System.out.println("Press 3 to exit");
					System.out.println("-----------------------------------");
					int fa=sc.nextInt();
					if(fa==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Crab"+"          "+"Guddupetha"+"          "+fkg+"          "+famount);
						System.out.println("---------------------------------------------------");
						if(famount>=1000) {
							System.out.println("Congratulations you had got 10% discount on above Rs.1000 purchase");
							int discount=(famount*10)/100;
							int amount=famount-discount;
							System.out.println("Total Price         : "+famount);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println();
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(fa==2) {
						this.method1();
					}
					else {
						break;
					}
				}
				if(c1==2) {
					System.out.println("Enter No.of Kg's required :");
					int fkg=sc.nextInt();
					System.out.println("---------------------------------");
					int famount=fkg*600;
					System.out.println("Total amount :"+famount);
					System.out.println("---------------------------------");
					System.out.println("Press 1 to order");
					System.out.println("Press 2 to main menu");
					System.out.println("Press 3 to exit");
					System.out.println("Press 4 to Add more Iteams");
					System.out.println("-----------------------------------");
					int fa=sc.nextInt();
					if(fa==1) {
						Scanner sc1=new Scanner(System.in);
						System.out.println("Enter your name :");
						String name=sc1.nextLine();
						Scanner sc3=new Scanner(System.in);
						System.out.println("Enter your MobileNo :");
						String e=sc3.nextLine();
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter your Address :");
						String add=sc2.nextLine();
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("--------------------Billing/Ordering------------------");
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Item          Item-Type          Kg's         Price");
						System.out.println("---------------------------------------------------");
						System.out.println("Crab"+"          "+"Normal Petha"+"          "+fkg+"          "+famount);
						System.out.println("---------------------------------------------------");
						System.out.println();
						if(famount>=1000) {
							System.out.println("Congratulations you get 10% discount on above Rs.1000 purchase");
							int discount=(famount*10)/100;
							int amount=famount-discount;
							System.out.println();
							System.out.println("Total Price         : "+famount);
							System.out.println("Discount(10%)       : "+discount);
							System.out.println("Price after discount : "+amount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+amount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else {
							System.out.println("If u order more than Rs.1000 you will get 10% discount");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("         Customer Details");
							System.out.println("         ----------------");
							System.out.println("Customer name        : "+name);
							System.out.println("Customer MobileNo    : "+e);
							System.out.println("Delivered to Address : "+add);
							System.out.println();
							System.out.println("Total Amount to pay  : Rs."+famount);
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
					}
					else if(fa==2) {
						this.method1();
					}
					else if(fa==3){
						break;
					}
					else {
						this.method1();
						if(fa==1) {
							
						}
					}
				}
			}
		}
	public static void main(String[] args) {
		Store s=new Store();
		s.method1();
		System.out.println();
		System.out.println("=============Thank You for Visiting Aqua-Store==========");
		System.out.println();
		System.out.println("For more information Dial:+91-8688558855");
		System.out.println("                     Mail:abc@gmail.com");
		System.out.println();
		System.out.println("********************** Visit Again*********************");
	}
}