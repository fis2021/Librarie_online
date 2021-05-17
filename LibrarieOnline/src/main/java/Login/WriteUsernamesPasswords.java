package Login;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteUsernamesPasswords {
	private JSONArray user_pass= new JSONArray();
	public void WriteUsernamePass(String res) {
	
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
	
	try(FileWriter file =new FileWriter(res))
	{
		file.write(user_pass.toString());
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
	public JSONArray getListUser()
	{
		return user_pass;
	}
}
