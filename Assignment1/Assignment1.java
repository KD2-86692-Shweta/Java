import java.util.Scanner;

public class Assignment1 {
   public static void main(String[] args) {
	   
	   Scanner sc=new Scanner(System.in);
	   double num1=0;
	   double num2=0;
	   double Average;
	   System.out.println("Enter First Value : ");
	   if(sc.hasNextDouble()) {
	   if(sc.hasNextInt()) {
		   System.out.println("Enter Double value.... :( ");
		  
	   }
	   else{
		   num1=sc.nextDouble();
	   }
	   }
	   
	   
	   
	   
	System.out.println("Enter Second Value : ");
	
	 if(sc.hasNextDouble()) {
		   if(sc.hasNextInt()) {
			   System.out.println("Enter Double value.");
		   }
		   else{
			   num2=sc.nextDouble();
		   }
		   }
	
	 Average=(num1+num2)/2;
	 System.out.println("Average of two numbers : "+Average);
   }

}
