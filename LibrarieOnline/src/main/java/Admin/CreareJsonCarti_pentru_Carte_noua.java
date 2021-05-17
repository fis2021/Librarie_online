package Admin;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class CreareJsonCarti_pentru_Carte_noua{
	private JSONArray list_imprumut= new JSONArray();
	@SuppressWarnings("unchecked")
	public void creare(ArrayList imprumut, String res) {
		
		int aux=0;
		
		for(int i=0;i<imprumut.size()/6;i++)
		{
				JSONObject obj1= new JSONObject();
				obj1.put("Descriere",imprumut.get(aux));
				aux++;
				obj1.put("Autor",imprumut.get(aux));
				aux++;
				obj1.put("Titlu carte",imprumut.get(aux));
				aux++;
				obj1.put("An aparitie",imprumut.get(aux));
				aux++;
				obj1.put("Genul",imprumut.get(aux));
				aux++;
				obj1.put("Poza",imprumut.get(aux));
				aux++;
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
	public JSONArray lista()
	{
		return list_imprumut;
	}

}
