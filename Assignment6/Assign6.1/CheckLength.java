package assign6;
import assign6.ExceptionLineTooLong;
import java.util.Scanner;

public class CheckLength {

	String readstring;
	
	public void accept(Scanner sc) throws ExceptionLineTooLong  
	{
		 System.out.println("Enter the String : ");
		 readstring=sc.next();
		 
		if(readstring.length()>80) {
		 throw new ExceptionLineTooLong();
		 }
	}

	@Override
	public String toString() {
		return "CheckLength [readstring=" + readstring + "]";
	}
	

	
}