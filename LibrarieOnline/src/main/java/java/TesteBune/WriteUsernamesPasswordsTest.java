package TesteBune;


import static org.junit.Assert.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import Login.JSONFile;
import Login.WriteUsernamesPasswords;

public class WriteUsernamesPasswordsTest {
	private JSONArray user_pass= new JSONArray();
	private WriteUsernamesPasswords wup=new WriteUsernamesPasswords();
	@Test
	public void test() {
		try {
			JSONFile jfile=new JSONFile();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		JSONObject obj1= new JSONObject();
		JSONObject obj2= new JSONObject();
		JSONObject obj3= new JSONObject();
		
		String pas=JSONFile.encrypt("laurentiu");
		obj1.put("password",pas);
		obj1.put("username","laurentiu");
		user_pass.add(obj1);
		
		pas=JSONFile.encrypt("bogdan");
		obj2.put("password",pas);
		obj2.put("username","bogdan");
		user_pass.add(obj2);
		
		pas=JSONFile.encrypt("admin");
		obj3.put("password",pas);
		obj3.put("username","admin");
		user_pass.add(obj3);
		wup.WriteUsernamePass("src/test/resources/Usernames_passwords.json");
		assertEquals(wup.getListUser(), user_pass);
	}

}
