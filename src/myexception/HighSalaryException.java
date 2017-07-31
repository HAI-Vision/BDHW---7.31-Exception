package myexception;

public class HighSalaryException extends Exception{
	public HighSalaryException(){
			
	}
	public HighSalaryException(String message){
		super(message);
	}
}
