package assign6;

public class ExceptionLineTooLong extends RuntimeException{

	public ExceptionLineTooLong() {
		
	}
	
	public ExceptionLineTooLong(String message) {
		super(message);
	}
}
