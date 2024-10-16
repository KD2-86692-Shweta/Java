package com.sunbeam.assignment;

import java.util.Scanner;
class EmployeeTest{
//If the monthly salary 
//is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates 
//class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. 
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.


//public String firstName;
//public String lastName;
//public double Salary;
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	
	Employee e1=new Employee();
	e1.accept();
	e1.display();
	Employee e2=new Employee();
	e2.accept();
	e2.display();
	
	
	


}

}

