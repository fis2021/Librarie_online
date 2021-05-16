package TesteBune;

import static org.junit.Assert.*;

import org.junit.Test;

import Admin.Meniu_Admin;

public class Meniu_AdminTest {

	@Test
	public void test1() {
		Meniu_Admin adm=new Meniu_Admin();
		new Meniu_Admin();
		adm.get_btn().doClick();
		assertEquals(true,adm.get_bol_btn());
	}
	@Test
	public void test2() {
		Meniu_Admin adm=new Meniu_Admin();
		new Meniu_Admin();
		adm.get_btn1().doClick();
		assertEquals(true,adm.get_bol_btn1());
	}
	@Test
	public void test3() {
		Meniu_Admin adm=new Meniu_Admin();
		new Meniu_Admin();
		adm.get_btn2().doClick();
		assertEquals(true,adm.get_bol_btn2());
	}
}
