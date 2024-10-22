package assignment.six.b;

public class Palindrome {

	public static void main(String[] args) {
		String s1="MOM";
		
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--) {
		//	System.out.println(s1.charAt(i));
			s2=s2+s1.charAt(i);
			//System.out.println(s2);
		}
		
		if(s2.equals(s1)) {
			System.out.println(s1+" It is Palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
		
	   
	}

}
