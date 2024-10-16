package com.sunbeam.hardwareinvoice.p1;

import java.util.Scanner;

public class Invoice {
	

	private String partNumber;
    private String description;
    private int quantity;
    private double price;
    
    
	public Invoice() {
		partNumber="";
		description="";
		quantity=0;
		price=0.0;
	}


	public Invoice(String partNumber, String description, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}


	public String getPartNumber() {
		return partNumber;
	}


	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
   
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		setPartNumber(sc.next());
		
		
	}
	
//	public void display() {
//		System.out.println(e1.getPartNumber()+"      "+e1.getDescription()+"      "+e1.getQuantity()+"      "+e1.getPrice()+"    "+e1.totalPrice());
//
//	}
	
	
	public double totalBill=0;
	
	public void display(Invoice e1) {
		
		
		System.out.println(e1.getPartNumber()+"               "+e1.getDescription()+"               "+e1.getQuantity()+"                "+e1.getPrice()+"               ");
//		System.out.println("Part No "+"      "+"Description"+"      "+"Quantity"+"      "+"Price");
//		System.out.println("Part No "+"      "+"Description"+"      "+"Quantity"+"      "+"Price");
//		System.out.println("Part No "+"      "+"Description"+"      "+"Quantity"+"      "+"Price");

		
		
	
	}
	public double totalPrice(Invoice e1) {
		double amount=0;
		amount+=getQuantity()*getPrice();
		
		return amount;
	}
	
	
	
	
}
