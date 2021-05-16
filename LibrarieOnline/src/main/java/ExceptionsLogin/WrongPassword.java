package ExceptionsLogin;
public class WrongPassword extends Exception {
	public WrongPassword() {
		super(String.format("Parola gresita!"));
	}
}
