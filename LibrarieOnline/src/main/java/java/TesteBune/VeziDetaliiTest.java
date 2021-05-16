package TesteBune;
import static org.junit.Assert.*;

import org.junit.Test;

import Client.BookModel;
import Client.VeziDetalii;

public class VeziDetaliiTest {

	@Test
	public void test() {
		BookModel bm=new BookModel("Ion", "Pamant si iubire","Lv","drama","1980","/carte_noua.jpg");
		VeziDetalii vd=new VeziDetalii(bm, "diana");
		new VeziDetalii(bm, "diana");
		vd.getBtnNewButton().doClick();
		assertEquals(true,vd.isButton1());
	}
	@Test
	public void test1() {
		BookModel bm=new BookModel("Ion", "Pamant si iubire","Lv","drama","1980","/carte_noua.jpg");
		VeziDetalii vd=new VeziDetalii(bm, "diana");
		new VeziDetalii(bm, "diana");
		vd.getBtnNewButton_1().doClick();
		assertEquals(true,vd.isButton2());
	}

}
