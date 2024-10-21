package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruit{
	public Mango() {
		
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, false);
		
	}
	
	@Override
	public void Accept(Scanner sc) {
		
		super.Accept(sc);
	}
	
	
//	@Override
//	public void display() {
//		
//		super.display();
//	}
	
	   
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet";
	}
      
}
