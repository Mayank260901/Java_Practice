package Lab2;
//raising issue in this class name something about serialization, else is working properly.
public class InvalidEmailException extends Exception{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidEmailException(String email) {
	super(email);
}
}
