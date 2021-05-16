package TesteBune;

import static org.junit.Assert.*;

import org.junit.Test;

import Admin.Editare_carte;
import Admin.Meniu_Admin;

public class Editare_carteTest {

	@Test
	public void test1() {
		Editare_carte ed=new Editare_carte();
		new Editare_carte();
		ed.get_but().doClick();
		assertEquals(true,ed.get_bol_but());
	}
	@Test
	public void test2() {
		Editare_carte ed=new Editare_carte();
		new Editare_carte();
		ed.get_but1().doClick();
		assertEquals(true,ed.get_bol_but1());
	}

}
