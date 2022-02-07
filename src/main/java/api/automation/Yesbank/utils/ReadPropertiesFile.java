package api.automation.Yesbank.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String propertyfile="config";
		Properties prop=loadProperty(propertyfile);
		System.out.println(prop.get("baseURL"));
	}



	public static Properties loadProperty(String filename) throws IOException
	{

		String path=System.getProperty("user.dir")+File.separator+"resources"+File.separator+filename+".properties";

		File file=new File(path);
		FileInputStream fileInputStream=new FileInputStream(file);
		Properties prop=new Properties();

		prop.load(fileInputStream);
		return prop;

	}

}
