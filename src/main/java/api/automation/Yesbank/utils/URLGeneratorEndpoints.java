package api.automation.Yesbank.utils;

public class URLGeneratorEndpoints {
	
	
	public String getUsers="api/users/2";
	public String addUsers="api/users";
	public String updateUsers="api/users";
	public String deleteUsers="api/users";


	public URLGeneratorEndpoints(String baseURL)
	{
		getUsers= baseURL +getUsers;
		addUsers= baseURL +addUsers;
		updateUsers= baseURL +updateUsers;
		deleteUsers= baseURL +deleteUsers;

	}
	

}
