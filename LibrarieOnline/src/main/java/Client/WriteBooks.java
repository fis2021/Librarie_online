package Client;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteBooks {
	private static List<BookModel> list=new ArrayList<BookModel>();
	public static void write(BookModel e) {
		list.add(e);
		
	}
	
	public static void set_list(List<BookModel> list1) {
		list=list1;
	}
	public static void remove(BookModel e) {
		list.remove(e);
		
	}
	public static List<BookModel> get_list() {
		return list;
	}
}
