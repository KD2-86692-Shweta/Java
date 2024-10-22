package assign6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	try {
			CheckLength cl=new CheckLength();
			cl.accept(sc);
			
		}catch(ExceptionLineTooLong e){
			e.printStackTrace();
			
		}
		}
	}


