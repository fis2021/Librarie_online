package TesteBune;

import static org.junit.Assert.*;

import org.junit.Test;

import Admin.Editare_carte;
import Admin.Stergere_carte;

public class Stergere_carteTest {

	@Test
	public void test1() {
		Stergere_carte ed=new Stergere_carte();
		new Stergere_carte();
		ed.get_but().doClick();
		assertEquals(true,ed.get_bol_but());
	}
	@Test
	public void test2() {
		Stergere_carte ed=new Stergere_carte();
		new Stergere_carte();
		ed.get_but1().doClick();
		assertEquals(true,ed.get_bol_but1());
	}
	
}
