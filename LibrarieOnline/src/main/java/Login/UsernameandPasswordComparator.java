package Login;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import ExceptionsLogin.WrongPassword;
import ExceptionsLogin.WrongUsername;
import ExceptionsLogin.WrongUsernameandPassword;

public class UsernameandPasswordComparator  {
	private ReaderUsernamesPassword unames_pass=new ReaderUsernamesPassword();
	
	public void handle_login(String name, String password) throws WrongPassword,WrongUsername,WrongUsernameandPassword {
		boolean flag_username=false;
		boolean flag_password=false;
		unames_pass.readusernamespasswords("src/main/resources/Usernames_passwords.json");
		JSONArray usernames_passwords=unames_pass.getusernamespasswords();
		Iterator<JSONObject> it = usernames_passwords.iterator();
		while (it.hasNext()) {
			JSONObject obj = it.next();
			System.out.println(obj.get("username") + " - " + obj.get("password"));
			String u=(String)obj.get("username");
			String v=(String)obj.get("password");
			String pass=JSONFile.decrypt(v);
			if (u.equals(name)) {
				System.out.println("am gasit");
				flag_username=true;
			}
			if (pass.equals(password)) {
					flag_password=true;
				}
		}
			if(flag_username==true && flag_password==false) throw new WrongPassword();
			if(flag_username==false && flag_password==true) throw new WrongUsername();
			if(flag_username==false && flag_password==false) throw new WrongUsernameandPassword();
					
	}
}





