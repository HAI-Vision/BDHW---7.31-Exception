package myexception;

public class LowAgeException extends Exception{
	public LowAgeException() {
        super();
    }

    public LowAgeException(String message) {
        super(message);
    }
}
