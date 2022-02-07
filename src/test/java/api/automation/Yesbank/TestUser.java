package api.automation.Yesbank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.testng.annotations.Test;

import api.automation.Yesbank.helper.GenericHelper;
import api.automation.Yesbank.helper.UserManagentHelper;
import io.restassured.response.Response;

public class TestUser {
	
	
	
	/*@Test(enabled=false)
	public void getUserDetails() throws IOException
	{
		
		GenericHelper helper=new GenericHelper();
     	@SuppressWarnings("static-access")
		Properties properties=	helper.loadProperty("config");
		String baseURL=properties.getProperty("baseURL");
		UserManagentHelper helpermange=new UserManagentHelper(baseURL);
		Map<String, String> testData=new HashMap<String, String>();
		testData=helper.readJsonFile("", "userTest.json", "userManage");
		Response response;
		response=helpermange.getSpecificUserDetails(testData);
		//System.out.println(response.prettyPrint());
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
	}*/

	
	@Test
	public void addNewUser() throws Exception
	{
		
		GenericHelper helper=new GenericHelper();
    // 	@SuppressWarnings("static-access")
		Properties properties=	helper.loadProperty("config");
		String baseURL=properties.getProperty("baseURL");
		UserManagentHelper helpermange=new UserManagentHelper(baseURL);
		
		Map<String, String> testdata=new HashMap<String, String>();
		testdata=helper.readJsonFileSimple("add.json", "userManage");
		Response response;
		response=helpermange.addNewUser(testdata);
		//System.out.println(response.prettyPrint());
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
	}
}
