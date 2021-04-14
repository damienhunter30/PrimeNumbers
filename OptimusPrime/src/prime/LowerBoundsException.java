package prime;

@SuppressWarnings("serial")
public class LowerBoundsException extends Exception{
	public String getMessage(){
		return "This function requires integers greater than or equal to 1.";
	}
}