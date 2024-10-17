package com.app.geometry;
import java.util.Scanner;
import java.lang.Math;

public class Point2D {
     double x;
     double y;
      
    public Point2D() {
    	//this.x = 0;
		//this.y = 0;
    }
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	 
	public String getDetails(){
		return ("x point : "+ x +" , "+" Y point : "+y);
	}
	
    
	public boolean isEqual(Point2D p2)
	{
		 return this.x==p2.x && this.y==p2.y;
			
	}
	
	 
	 public double calculateDistanced(Point2D p2) 
	 {
		 if(this.x==p2.x && this.y==p2.y) {
			 System.out.println("Points are equal");
			 return 0.0;
		 }
		 else {
		   double distance= Math.sqrt(Math.pow((this.x-p2.x), 2) + Math.pow((this.y-p2.y), 2));
		   return distance;
		 }
		
	 }
	 
	 public void accept() {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter Point x : ");
		   x=sc.nextDouble();
		  
	     System.out.println("Enter Point y : ");
	      y=sc.nextDouble();
		 
		 
	 }
     
     
     

}