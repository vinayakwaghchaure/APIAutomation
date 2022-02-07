package api.automation.Yesbank.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class GenericHelper {


	public Map<String, String> readJsonFile(String methodname,String jsonFilename ,String folderName) throws JsonIOException, JsonSyntaxException, FileNotFoundException
	{

		String filePath =System.getProperty("user.dir")+File.separator+"resources"+File.separator+folderName+File.separator+jsonFilename;

		@SuppressWarnings("deprecation")
		JsonElement jsonElment=(new JsonParser()).parse(new FileReader(filePath));

		JsonObject object=jsonElment.getAsJsonObject();

		JsonElement ele=object.get(methodname);
		JsonObject jsonObject=ele.getAsJsonObject();
		Map<String, String> mapObj=new HashMap<String, String>();
		@SuppressWarnings("rawtypes")
		Iterator iterator=jsonObject.entrySet().iterator();
		while(iterator.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Entry entry=(Entry) iterator.next();
			mapObj.put(entry.getKey().toString(), entry.getValue().toString());

		}


		/*System.out.println(mapObj.get("id"));
		System.out.println(mapObj.get("email"));
		System.out.println(mapObj.get("first_name"));
		System.out.println(mapObj.get("last_name"));
		System.out.println(mapObj.get("avatar"));*/

		return mapObj;

	}

	public Properties loadProperty(String filename) throws IOException
	{

		String path=System.getProperty("user.dir")+File.separator+"resources"+File.separator+filename+".properties";

		File file=new File(path);
		FileInputStream fileInputStream=new FileInputStream(file);
		Properties prop=new Properties();

		prop.load(fileInputStream);
		return prop;

	}

	
	public Map<String, String> readJsonFileSimple(String jsonFilename ,String folderName) throws JsonIOException, JsonSyntaxException, FileNotFoundException
	{

		String filePath =System.getProperty("user.dir")+File.separator+"resources"+File.separator+folderName+File.separator+jsonFilename;

		@SuppressWarnings("deprecation")
		JsonElement jsonElment=(new JsonParser()).parse(new FileReader(filePath));

		JsonObject object=jsonElment.getAsJsonObject();

		//JsonElement ele=object.get(methodname);
		JsonObject jsonObject=object.getAsJsonObject();
		
		Map<String, String> mapObj=new HashMap<String, String>();
		@SuppressWarnings("rawtypes")
		Iterator iterator=jsonObject.entrySet().iterator();
		while(iterator.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Entry entry=(Entry) iterator.next();
			mapObj.put(entry.getKey().toString(), entry.getValue().toString());

		}


		/*System.out.println(mapObj.get("id"));
		System.out.println(mapObj.get("email"));
		System.out.println(mapObj.get("first_name"));
		System.out.println(mapObj.get("last_name"));
		System.out.println(mapObj.get("avatar"));*/

		return mapObj;

	}

}
