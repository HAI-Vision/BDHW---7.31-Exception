package myexception;

public class LowSalaryException extends Exception{
	public LowSalaryException(){
		
	}
	
	public LowSalaryException(String message){
		super(message);
	}
}
