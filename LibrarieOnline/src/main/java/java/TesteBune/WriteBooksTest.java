package TesteBune;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Client.BookModel;
import Client.WriteBooks;

public class WriteBooksTest {


	@Test
	public void test1() {
		List<BookModel> list=new ArrayList<BookModel>();
		BookModel bm=new BookModel("Ion", "Pamant si iubire","Lv","drama","1980","/carte_noua.jpg");
		BookModel bm1=new BookModel("Ionita", "Pamant si iubire","Lv","drama","1980","/carte_noua.jpg");
		list.add(bm);
		list.add(bm1);
		WriteBooks.set_list(list);
		assertEquals(list,WriteBooks.get_list());
	}
	
}
