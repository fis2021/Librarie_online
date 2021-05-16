package ExceptionsLogin;
public class WrongUsername extends Exception {
	public WrongUsername(){
		super(String.format("Username gresit!"));
	}
}
