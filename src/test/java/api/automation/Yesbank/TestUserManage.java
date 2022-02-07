package api.automation.Yesbank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import api.automation.Yesbank.helper.GenericHelper;

public class TestUserManage {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		GenericHelper helper=new GenericHelper();
		Map<String,String> map=new HashMap<String, String>();
		
		map=helper.readJsonFile("data","userTest","userManage");
		System.out.println(map.get("id"));
		System.out.println(map.get("email"));
		System.out.println(map.get("first_name")); 
		System.out.println(map.get("last_name"));
		System.out.println(map.get("avatar"));

		

		
	}

}
