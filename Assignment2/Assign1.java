import java.util.Scanner;
public class Assign1 {

	public static void main(String[] args) {
		    	  Scanner sc=new Scanner(System.in);
		    	  System.out.println("Enter Number : ");
		    	  int num=sc.nextInt();
		    	  
		    	  String s1=Integer.toBinaryString(num);
		    	  System.out.println("Given Number : "+num); 
		    	  System.out.println("Binary equivalent : "+s1);
		    	  
		    	  String s2=Integer.toOctalString(num);
		    	  System.out.println("Octal equivalent : "+s2);
		    	  
		    	  String s3=Integer.toHexString(num);
		    	  System.out.println("Hexadecimal Equivalent : "+s3);
		    	  
		    	  
		      }
}
	

