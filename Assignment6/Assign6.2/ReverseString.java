package assignment.six.b;

import java.util.Scanner;

public class ReverseString {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter String ");
       String readstring=sc.next();
       String s2="";
     
      
       for(int i=readstring.length()-1;i>=0;i--) {
    	  
    	  s2=s2+readstring.charAt(i);
       }
       System.out.println("Reverse String is : "+s2);
	}

}
