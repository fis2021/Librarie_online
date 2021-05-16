package Client;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class BooksServices {
	private List<BookModel> carti=new ArrayList<BookModel>();
	private ReaderBooks readerbooks=new ReaderBooks();
	public BooksServices () {
		readerbooks.read_books("src/main/resources/Books.json");
		JSONArray books=readerbooks.getbooks();
		Iterator<JSONObject> it=books.iterator();
		while (it.hasNext()) {
			JSONObject obj = it.next();
			BookModel book=new BookModel((String)obj.get("Titlu carte"),(String)obj.get("Descriere"),(String)obj.get("Autor"),(String)obj.get("Genul"),(String)obj.get("An aparitie"),(String)obj.get("Poza"));
			carti.add(book);
		}
	}
	public List<BookModel> getbooks() {
		return carti;
	}
}
