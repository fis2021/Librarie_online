package ExceptionsLogin;

public class WrongUsernameandPassword extends Exception {
	public WrongUsernameandPassword() {
		super(String.format("Username si parola gresita!"));
	}
}


