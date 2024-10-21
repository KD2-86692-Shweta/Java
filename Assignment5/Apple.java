package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruit{
	
	
	
public Apple() {
		super();
		
	}

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, true);
		
	}

	@Override
		public void Accept(Scanner sc) {
		
			super.Accept(sc);
		}
	
	
//	@Override
//		public void display() {
//			
//			super.display();
//		}
//	@Override
//		public String toString() {
//			
//			return super.toString();
//		}
//@Override
//public string taste() {
//	return "Sweet and Sour";
//	
//}
	
	@Override
		public String taste() {
		return "Sweet and Sour";
			
		}
}
