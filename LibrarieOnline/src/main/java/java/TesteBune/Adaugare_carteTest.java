package TesteBune;

import static org.junit.Assert.*;

import org.junit.Test;

import Admin.Adaugare_carte;
import Admin.Stergere_carte;

public class Adaugare_carteTest {

	@Test
	public void test1() {
		Adaugare_carte ed=new Adaugare_carte();
		new Adaugare_carte();
		ed.get_but().doClick();
		assertEquals(true,ed.get_bol_but());
	}
	@Test
	public void test2() {
		Adaugare_carte ed=new Adaugare_carte();
		new Adaugare_carte();
		ed.get_but1().doClick();
		assertEquals(true,ed.get_bol_but1());
	}

}
