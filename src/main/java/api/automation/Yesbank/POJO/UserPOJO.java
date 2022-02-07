package api.automation.Yesbank.POJO;

import java.util.Map;

import com.google.gson.Gson;

public class UserPOJO {
	
	private String name;
	private String job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	


	public String getUserAdd(Map<String,String> testdata)
	{
		UserPOJO user =new UserPOJO();
		user.setName(testdata.get("name"));
		user.setJob(testdata.get("job"));

		Gson gson=new Gson();
		return gson.toJson(user);

	}
	
	
	
	public String UpdateUser(Map<String,String> testdata)
	{
		UserPOJO user =new UserPOJO();
		user.setName(testdata.get("name"));
		user.setJob(testdata.get("job"));

		Gson gson=new Gson();
		return gson.toJson(user);		
	}
	

}
