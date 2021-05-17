package TesteBune;


import static org.junit.Assert.*;

import org.junit.Test;

import Client.ClientPageInterface;

public class ClientPageInterfaceTest {

	@Test
	public void test() {
		ClientPageInterface cpi=new ClientPageInterface("diana");
		new ClientPageInterface("diana");
		cpi.get_button1().doClick();
		assertEquals(true, cpi.get_bool_button1());
	}
	@Test
	public void test1() {
		ClientPageInterface cpi=new ClientPageInterface("diana");
		new ClientPageInterface("diana");
		cpi.getBtnNewButton().doClick();
		assertEquals(true, cpi.isButton2());
	}
	@Test
	public void test2() {
		ClientPageInterface cpi=new ClientPageInterface("diana");
		new ClientPageInterface("diana");
		cpi.getBtnNewButton_1().doClick();
		assertEquals(true, cpi.isButton3());
	}

}
