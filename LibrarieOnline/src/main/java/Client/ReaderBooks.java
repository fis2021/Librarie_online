package Client;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReaderBooks
{
	private JSONArray jsonArray;
	public void read_books(String res)
	{
		JSONParser parser = new JSONParser();
		try (Reader reader = new FileReader(res)) 
		{
			jsonArray = (JSONArray) parser.parse(reader);
			} catch (IOException e) 
			{
				e.printStackTrace();
			} catch (ParseException e) 
			{
				e.printStackTrace();
			}
	}
	public JSONArray getbooks() {
		return jsonArray;
	}
	
}