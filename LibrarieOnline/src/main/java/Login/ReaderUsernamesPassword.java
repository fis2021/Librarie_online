package Login;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class ReaderUsernamesPassword {
	private JSONArray jsonArray;
	public void readusernamespasswords(String res) 
	{
		JSONParser parser = new JSONParser();
		try (Reader reader = new FileReader(res)) {
			jsonArray = (JSONArray) parser.parse(reader);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
	}
	public JSONArray getusernamespasswords() {
		return jsonArray;
	}
}