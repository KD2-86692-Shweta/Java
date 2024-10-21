package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	
	public static int menu(Scanner sc) {
		System.out.println("________________________________________________________________________");
		System.out.println("0. Exit");
		System.out.println("1. Add mango ");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display name of all Fruits in basket ");
		System.out.println("5. Display tastes of all stale(not fresh) fruits in the basket");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket. ");
		System.out.println("7. Mark a fruit as stale ");
		System.out.println("8.  Mark all sour fruits stale");
		System.out.println("________________________________________________________________________");
		System.out.println("Enter choice : ");
		return sc.nextInt();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Basket Size : ");
		int size=sc.nextInt();
		
		
		Fruit[] basket=new Fruit[size];
		//array of references we cannot create obj of abstract class
		int counter=0;
		int i=0;
		
		
		
		int choice;
		
		while((choice=menu(sc))!=0) {
			switch(choice) {
			
			case 0:
				System.exit(choice);
				break;
			case 1:
				if(counter<size) {
//					System.out.println("Enter Name : ");
//					String name=sc.next();
//					System.out.println("Enter Color : ");
//					String color=sc.next();
//					System.out.println("Weight : ");
//					double weight=sc.nextDouble();
					
					basket[counter]=new Mango();
					basket[counter].Accept(sc);
					counter++;
				}
				break;
			case 2:
				
				if(counter<size) {
					basket[counter]=new Orange();
					basket[counter].Accept(sc);
					counter++;
					
				}
				break;
			case 3:
				if(counter<size) {
					basket[counter]=new Apple();
					basket[counter].Accept(sc);
					counter++;
				}
				break;
			case 4:
				//for (int i=0;i<counter;i++)
				// if(basket[i)!=null)
                //{
                //System.out.println(basket[i].getName());
                //}
				//for      each      arr
				for(Fruit fruit:basket) {
					if(fruit !=null) {
						System.out.println("Fruit : "+fruit.getName());
					}
				}
				break;
			case 5:
				
				for(Fruit fruit:basket) {
					if(fruit !=null) {
						System.out.println(fruit);
					}
				}
				break;
				
			case 6:
				System.out.println("tastes of all stale(not fresh) fruits in the basket");
				for(Fruit fruit:basket) {
					if(fruit!=null && !fruit.getFresh(false)) {
						System.out.println(fruit.getName()+" : "+fruit.taste()); 
					}
				}
				
				break;
			case 7:
			{
				System.out.println("Enter index- ");
				i=sc.nextInt();
				if(i>=0 && i<counter)
				{
					if(basket[i]!=null)
					{
						basket[i].setFresh(false);
						 System.out.println("Marked fruit as stale.");
					}
				}
			}
				break;
			case 8:
				
				for(Fruit fruit:basket) {
					if(fruit !=null && fruit.taste().equals("sour")){
						fruit.setFresh(false);
						System.out.println("Marked friut as sour");
					}
					else
					{
						System.out.println("Sweet");
					}
				}
				break;
			default:
				System.out.println("Enter valid choice ");
				
			
			
			}
		}

	}

}
