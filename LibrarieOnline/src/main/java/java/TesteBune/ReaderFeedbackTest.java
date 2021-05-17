package TesteBune;


import static org.junit.Assert.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import Client.ReaderFeedback;

public class ReaderFeedbackTest {
	JSONArray test=new JSONArray();
	@Test
	public void test() {
			JSONObject obj1= new JSONObject();
			JSONObject obj2= new JSONObject();
			
			obj1.put("Username", "bianca");
			obj1.put("Titlu", "Io contra Statele Unite ale Americii");
			obj1.put("Respinge", false);
			obj1.put("Accepta", true);
			
			obj2.put("Username", "Diana");
			obj2.put("Titlu", "In cautarea nemuririi");
			obj2.put("Respinge", false);
			obj2.put("Accepta", true);
			 
			test.add(obj1);
			test.add(obj2);
			
			ReaderFeedback rf=new ReaderFeedback();
			rf.readfromfile(0,"src/test/resources/Json_imprumut2.json");
			assertEquals(test, rf.get_list());
		}
	}

