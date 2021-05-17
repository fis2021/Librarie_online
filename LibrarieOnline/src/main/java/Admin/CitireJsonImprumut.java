package Admin;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CitireJsonImprumut {
	private String username;
	private String titlu;
	private int nr=0;
	private JSONArray jsonArray=new JSONArray();
	/**
	 * Launch the application.
	 */
	public void get_numar_imprumuturi()
	{
		
		JSONParser parser = new JSONParser();
		try (Reader reader = new FileReader("src/main/resources/lista_imprumut.json")) 
		{
			JSONArray jsonArray = (JSONArray) parser.parse(reader);
			Iterator<JSONObject> it = jsonArray.iterator();
			while (it.hasNext()) 
			{
				JSONObject obj = it.next();
				nr++;
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ParseException e) 
		{
			e.printStackTrace();
		}
}		
	public void get_imprumut(int count, String res)
	{
		JSONParser parser = new JSONParser();
		int aux=0;
		try (Reader reader = new FileReader(res)) 
		{
			jsonArray = (JSONArray) parser.parse(reader);
			Iterator<JSONObject> it = jsonArray.iterator();
			while (it.hasNext()&&aux!=count) 
			{
				JSONObject obj = it.next();
				
				username=(String) obj.get("Username");
				titlu=(String) obj.get("Titlu");
				aux++;
				
			}
			} catch (IOException e) 
			{
				e.printStackTrace();
			} catch (ParseException e) 
			{
				e.printStackTrace();
			}
	}
	
	public String get_username()
	{
		return username;
	}
	public String get_titlu()
	{
		return titlu;
	}
	public int get_nr()
	{
		return nr;
	}
	public JSONArray get_array()
	{
		return jsonArray;
	}
}
