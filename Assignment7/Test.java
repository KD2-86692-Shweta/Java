package com.sunbeam.assign7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class StudentCityComparator implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getCity().compareTo(o2.getCity());
		}
}

class StudentMarksComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
}
class StudentRollComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getRoll()-o2.getRoll();
	}
}

public class Test {

	public static int menu(Scanner sc) {
		System.out.println("1. sorted on their city (asc) ");
		 System.out.println("2. sorted on their on marks (desc)  ");
		 System.out.println("3. sorted on their on name (asc) ");
		 System.out.println("4. sorted on the rollno (Hint- Use comparable)");
		 System.out.println("Enter Choice : ");
		 return sc.nextInt();
		
	}
	
	public static void display(Student[] arr) {
		System.out.println("____________________________________");
		for(Student e:arr)
			System.out.println(e);
		System.out.println("____________________________________");

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student stud[]=new Student[5];
		Comparator<Student> comparator;
		stud[0]=new Student(16,"Shweta","kolhapur",89);
		stud[1]=new Student(13,"Shivali","Sangli",87);
		stud[2]=new Student(14,"Snehal","Kolhapur",86);
		stud[3]=new Student(15,"Harshada","Kolhapur",85);
		stud[4]=new Student(12,"Mrunali","Nagpur",86);
		
	 int choice;
	 
	 while((choice = menu(sc))!=0) {
		 switch(choice) {
		 case 1:
			 comparator= new StudentCityComparator();
			 Arrays.sort(stud,comparator);
			 display(stud);
			 break;
			
		 case 2:
			comparator = new StudentMarksComparator();
			Arrays.sort(stud,comparator);
			display(stud);
			break;
			
		 case 3:
			 comparator =new StudentNameComparator();
			 Arrays.sort(stud,comparator);
			 display(stud);
			 break;
			 
		 case 4:
			 comparator = new StudentRollComparator();
			 Arrays.sort(stud,comparator);
			 display(stud);
			 break;
			 
		 case 0:
			 
			 System.exit(choice);
			 
		default:
			System.out.println("Enter valid Choice.");
		 
			 
			 
		 }
	 }
		
		
		
		

	}

}
