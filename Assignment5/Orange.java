package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruit{
	
	
	
   public Orange() {
		
	}

	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, true);
		
	}

	@Override
		public void Accept(Scanner sc) {
			super.Accept(sc);
		}
	
//	@Override
//		public void display() {
//			super.display();
//		}
	
@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sour";
	}
}
