package com.sunbeam.hardwareinvoice.p1;

import java.util.Scanner;

public class Information {
      public static void main(String[] args) {
    	  
    	double setBill=0;
    	 
    	  
		Invoice e1=new Invoice();
		Invoice e2=new Invoice();
		Invoice e3=new Invoice();
		Invoice e4=new Invoice();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter partno : ");
		e1.setPartNumber(sc.next());
		
		System.out.println("Enter Part Name : ");
		e1.setDescription(sc.next());
		
		System.out.println("Enter Quantity : ");
		e1.setQuantity(sc.nextInt());
		
		System.out.println("Enter Price : ");
		double pri=sc.nextDouble();
		if(pri<0) {
			System.out.println("Enter Positive number : ");
		}
		else {
			e1.setPrice(pri);
		}
		
		
		
		System.out.println("Enter partno : ");
		e2.setPartNumber(sc.next());
		
		System.out.println("Enter Part Name : ");
		e2.setDescription(sc.next());
		
		System.out.println("Enter Quantity : ");
		e2.setQuantity(sc.nextInt());
		
		System.out.println("Enter Price : ");
		double pr=sc.nextDouble();
		if(pr<0) {
			System.out.println("Enter positive number ");
		}
		else {
			e2.setPrice(pr);
		}
	
		
		System.out.println("Part No "+"      "+"Description"+"      "+"Quantity"+"      "+"Price");
		e1.display(e1);
		e2.display(e2);
		
		setBill+=e1.totalPrice(e1);
		setBill+=e2.totalPrice(e2);
		
		
			System.out.println("Total Bill is : "+setBill);
		
		
	}
      
      
}
//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item 
//sold at the store. An Invoice should include four pieces of information as fields—a part number 
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a 
//price per item (double). Your class should have a constructor 
//that initializes the four instance variables. Provide a set and a get method for each instance variable. 
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the 
//amount as a double value. 
//If the quantity is not positive, it should be set to 0. 
//If the price per item is not positive, it should be set to 0.0. 
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities. 