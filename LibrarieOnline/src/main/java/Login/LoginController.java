package Login;
import java.io.FileWriter;
import Client.*;

import javax.swing.JOptionPane;
import Admin.*;

import ExceptionsLogin.WrongPassword;
import ExceptionsLogin.WrongUsername;
import ExceptionsLogin.WrongUsernameandPassword;

public class LoginController  {
	private int flag=0;
	public LoginController(String user, String pas) {
		try {
			UsernameandPasswordComparator login=new UsernameandPasswordComparator();
			login.handle_login(user, pas);
			if(user.equals("admin") && pas.equals("admin"))
			{
				Meniu_Admin admin=new Meniu_Admin();
				admin.setVisible(true);
				flag=1;
				
			}
			else 
			{
				ClientPageInterface clientpage=new ClientPageInterface(user);
				clientpage.setVisible(true);
				flag=1;
				
			}
			
		}
			catch(WrongUsername e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			catch(WrongPassword e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			catch(WrongUsernameandPassword e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
	}
	public int get_flag() {
		return flag;
	}
}


