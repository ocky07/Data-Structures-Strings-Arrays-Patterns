package Arithmatical_Exception;



public class InsufficientException extends Exception{
    
	public InsufficientException() {
		super("Less balance.....");	
	}
	public InsufficientException(String s) {
		super(s);	
	}
	
}
