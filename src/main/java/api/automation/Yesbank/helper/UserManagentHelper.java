package api.automation.Yesbank.helper;

import java.util.Map;

import api.automation.Yesbank.POJO.UserPOJO;
import api.automation.Yesbank.utils.RESTUtils;
import api.automation.Yesbank.utils.URLGeneratorEndpoints;
import io.restassured.response.Response;

public class UserManagentHelper {

	String baseURL;
	RESTUtils utils;
	URLGeneratorEndpoints url;
	UserPOJO userPOJO;
	Response response;

	public UserManagentHelper(String baseURL)
	{
		this.baseURL=baseURL;
		utils=new RESTUtils();
		url=new URLGeneratorEndpoints(baseURL);
	}

	public Response getSpecificUserDetails(Map<String, String> testData)
	{
		//	int id=Integer.parseInt(testData.get("userId"));
		try {
			response=	utils.get(url.getUsers);
			if (response.getStatusCode()!=200) {
				//	throw new Exception("failed to get details with id "+id+"and using API"+url.getUsers+"/"+id+"and the response body is"+response);
			}

		} catch (Exception e) {
			e.getMessage();

		}
		return response;
	}




	public Response addNewUser(Map<String, String> testdata) throws Exception
	{
		String payload=userPOJO.getUserAdd(testdata);
		try {
			response=utils.post(url.addUsers, payload);
			if (response.getStatusCode()!=200) {
				throw new Exception("failed to add new user using API "+url.addUsers+"and the response body is"+response.getBody().asString());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return response;

	}

}
