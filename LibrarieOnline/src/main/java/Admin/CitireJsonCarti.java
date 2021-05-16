package Admin;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CitireJsonCarti {
	private String t;
	private String d;
	private String a;
	private String aut;
	private String g;
	private String p;
	private int nr;
	/**
	 * Launch the application.
	 */
	public void get_nr_titluri()
	{
		JSONParser parser = new JSONParser();
		try (Reader reader = new FileReader("src/main/resources/Books.json")) 
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
	public void get_titlu(int count)
	{
		JSONParser parser = new JSONParser();
		int aux=0;
		try (Reader reader = new FileReader("src/main/resources/Books.json")) 
		{
			JSONArray jsonArray = (JSONArray) parser.parse(reader);
			Iterator<JSONObject> it = jsonArray.iterator();
			while (it.hasNext()&&aux!=count) 
			{
				JSONObject obj = it.next();
			
				d=(String) obj.get("Descriere");
				aut=(String) obj.get("Autor");
				t=(String) obj.get("Titlu carte");
				a=(String) obj.get("An aparitie");
				g=(String) obj.get("Genul");
				p=(String) obj.get("Poza");
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
	public String get_t()
	{
		return t;
	}
	public String get_d()
	{
		return d;
	}
	public String get_a()
	{
		return a;
	}
	public String get_aut()
	{
		return aut;
	}
	public String get_g()
	{
		return g;
	}
	public String get_p()
	{
		return p;
	}
	public int get_nr()
	{
		return nr;
	}
}
