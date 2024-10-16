package com.sunbeam.assignment;

import java.util.Scanner;

public class Employee {

	
//		 Create a class called Employee that includes three fields—a first name (type String), a last 
//		 name (type String) and a monthly salary (double). Provide a constructor that initializes the three 
//		 instance variables. Provide a set and a get method for each instance variable. If the monthly salary 
//		 is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates 
//		 class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. 
//		 Then give each Employee a 10% raise and display each Employee’s yearly salary again.

		
		public String firstName;
		public String lastName;
		public double Salary;
		
		public Employee() {
			firstName="";
			lastName="";
			Salary=0.0;
		}
		public Employee(String firstName, String lastName, double salary) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			Salary = salary;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		
		public void accept() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter name : ");
			setFirstName(sc.next());
			
			System.out.println("Enter Lastname : ");
			setLastName (sc.next());
			
			System.out.println("Enter Monthly Salary : ");
			double sal=sc.nextDouble();
			if(sal < 0) {
				System.out.println("Can't set Salary");
				
			}
			else {
			setSalary(sal);
			}
		}
		
		public void display() {
			
			
			System.out.println("First Name : "+getFirstName());
			System.out.println("Last Name : "+getLastName());
			double sal=getSalary()*12;
			System.out.println("Monthly Salary : "+sal);
			double raise=sal*0.10;
			System.out.println("Early salary with 10 % raise : "+(sal+raise));
			System.out.println("___________________________________________________");
			
		}
		
		 
		
		
	

}

