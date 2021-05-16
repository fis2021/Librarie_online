package TesteBune;

import static org.junit.Assert.*;

import org.junit.Test;

import Admin.Lista_carti_interfata;
import Admin.Meniu_Admin;

public class Lista_carti_interfataTest {

	@Test
	public void test1() {
		Lista_carti_interfata list=new Lista_carti_interfata();
		new Lista_carti_interfata();
		list.get_but().doClick();
		assertEquals(true,list.get_bol_but());
	}
	@Test
	public void test2() {
		Lista_carti_interfata list=new Lista_carti_interfata();
		new Lista_carti_interfata();
		list.get_but1().doClick();
		assertEquals(true,list.get_bol_but1());
	}
	}


