package Client;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateBorrowList {
	JSONArray list_imprumut= new JSONArray();
	public void create(String username,List<BookModel> list, String res) {
		int aux=0;
		for(BookModel e:list) {
			JSONObject obj1= new JSONObject();
			obj1.put("Titlu",e.getTitlu());
			obj1.put("Username",username);
			list_imprumut.add(obj1);
				
		}
		try(FileWriter file =new FileWriter(res))
		{
			file.write(list_imprumut.toString());
			file.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public JSONArray get_list() {
		return list_imprumut;
	}

}
