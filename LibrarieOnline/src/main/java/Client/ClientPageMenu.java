package Client;

import BorrowExceptions.NoBooksAdded;

public class ClientPageMenu {
	 public void books(String username) {
		 Books carti=new Books(username);
			carti.setVisible(true);
	 }

public void  BorrowList(String username) throws NoBooksAdded {
	BorrowListInterface li=new BorrowListInterface(username);
	li.setVisible(true);
}
public void feedback(String username) {
	Feedback feedback=new Feedback(username);
	feedback.setVisible(true);
}

}