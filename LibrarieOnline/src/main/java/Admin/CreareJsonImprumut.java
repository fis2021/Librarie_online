package Admin;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class CreareJsonImprumut {

	@SuppressWarnings("unchecked")
	public void creare(ArrayList imprumut) {
		
		int aux=0;
		JSONArray list_imprumut= new JSONArray();
		for(int i=0;i<imprumut.size()/4;i++)
		{
				JSONObject obj1= new JSONObject();
				obj1.put("Username",imprumut.get(aux));
				aux++;
				obj1.put("Titlu",imprumut.get(aux));
				aux++;
				obj1.put("Accepta",imprumut.get(aux));
				aux++;
				obj1.put("Respinge",imprumut.get(aux));
				aux++;
				list_imprumut.add(obj1);
				
		}
		try(FileWriter file =new FileWriter("src/main/resources/CreareJsonImprumut.json"))
		{
			file.write(list_imprumut.toString());
			file.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
