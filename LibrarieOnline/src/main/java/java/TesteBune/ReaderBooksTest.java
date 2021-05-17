package TesteBune;
import static org.junit.Assert.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import Client.ReaderBooks;

public class ReaderBooksTest {
	private JSONArray jsonArray=new JSONArray();
	@Test
	public void test() {
		JSONObject obj1= new JSONObject();
		obj1.put("Poza","/calul_balan.png");
		obj1.put("Descriere","se plimba");
		obj1.put("Autor","Diaaaa");
		obj1.put("Titlu carte","Bianca");
		obj1.put("An aparitie","1879");
		obj1.put("Genul","romntic");
		jsonArray.add(obj1);
		ReaderBooks rb=new ReaderBooks();
		rb.read_books("src/test/resources/Books.json");
		assertEquals(rb.getbooks(),jsonArray);
	}

}
