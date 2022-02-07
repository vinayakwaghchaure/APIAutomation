package api.automation.Yesbank;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import api.automation.Yesbank.POJO.UserPOJO;
import api.automation.Yesbank.utils.RESTUtils;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestRequest {

	/*@Test
	public void getUser()
	{
		String url="https://reqres.in/api/users/2";
		RESTUtils restUtils=new RESTUtils();
		Response response=restUtils.get(url);
		System.out.println(response.prettyPrint());
	}*/


	@Test(enabled=false)
	public void getUser1()
	{
		String url="https://reqres.in/api/users";
		RESTUtils restUtils=new RESTUtils();

		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("page", 2);
		Response response=restUtils.getWithParam(url, map);
		response.prettyPrint();
		
	}


	
	@Test(enabled=true)
	public void UserCreate()
	{
		String name,job,createdAt;
		int id;
		String url="https://reqres.in/api/users";
		Reporter.log("URL :"+url);
		RESTUtils restUtils=new RESTUtils();
		UserPOJO userPOJO =new UserPOJO();
		Map<String,String> testdata=new HashMap<String,String>();
		testdata.put("name", "morpheus");
		testdata.put("job", "leader");
		String add=userPOJO.getUserAdd(testdata);
		Reporter.log("\n Json Send data to the POST Method :"+add);

		Response response=restUtils.post(url, add);
		Reporter.log("\n Response data :"+response.prettyPrint());
		System.out.println("response :"+response.prettyPrint());
	
		//Assertion
		name =JsonPath.from(response.getBody().asString()).get("name");
		Reporter.log("name :"+name);
        Assert.assertEquals(name, "morpheus", "name of value do not match");
		System.out.println(name);
		
		job =JsonPath.from(response.getBody().asString()).get("job");
		System.out.println(job);
        Assert.assertEquals(job, "leader", "leader of value do not match");
		Reporter.log("job :"+job);
		
		id =Integer.parseInt((String) JsonPath.from(response.getBody().asString()).get("id"));
		Reporter.log("id :"+id);
		System.out.println(id);
		
		createdAt =JsonPath.from(response.getBody().asString()).get("createdAt");
		System.out.println(createdAt);
		Reporter.log("createdAt :"+createdAt);
		
		//Assertion
		Reporter.log(createdAt);
		assertThat((new Object[] {name,job}),is(new Object[] {"morpheus","leader"}));

	}
	
	
	@Test(enabled=true)
	public void UserCreate2()
	{
		String name,job,createdAt;
		int id;
		String url="https://reqres.in/api/users";
		Reporter.log("URL :"+url);
		RESTUtils restUtils=new RESTUtils();
		UserPOJO userPOJO =new UserPOJO();
		Map<String,String> testdata=new HashMap<String,String>();
		testdata.put("name", "morpheus");
		testdata.put("job", "leader");
		String add=userPOJO.getUserAdd(testdata);
		Reporter.log("\n Json Send data to the POST Method :"+add);

		Response response=restUtils.post(url, add);
		Reporter.log("\n Response data :"+response.prettyPrint());
		System.out.println("response :"+response.prettyPrint());
	
		//Assertion
		name =JsonPath.from(response.getBody().asString()).get("name");
		Reporter.log("name :"+name);
        Assert.assertEquals(name, "morpheu23", "name of value do not match");
		System.out.println(name);
		
		job =JsonPath.from(response.getBody().asString()).get("job");
		System.out.println(job);
        Assert.assertEquals(job, "leader", "leader of value do not match");
		Reporter.log("job :"+job);
		
		id =Integer.parseInt((String) JsonPath.from(response.getBody().asString()).get("id"));
		Reporter.log("id :"+id);
		System.out.println(id);
		
		createdAt =JsonPath.from(response.getBody().asString()).get("createdAt");
		System.out.println(createdAt);
		Reporter.log("createdAt :"+createdAt);
		
		//Assertion
		Reporter.log(createdAt);
		assertThat((new Object[] {name,job}),is(new Object[] {"morpheus","leader"}));
	}
	
	/*@Test(enabled=false)
	public void UpdateUser()
	{
		String url="https://reqres.in/api/users";
		RESTUtils restUtils=new RESTUtils();
		UserPOJO userPOJO =new UserPOJO();
		Map<String,String> testdata=new HashMap<String,String>();
		testdata.put("name", "morpheus");
		testdata.put("job", "Automation");

		String update=userPOJO.UpdateUser(testdata);
		Response response=restUtils.put(url, update);
		
		System.out.println("response :"+response.prettyPrint());
		
	}*/
	
	
	
	@Test(enabled=false)
	public void deleteUser()
	{
		String url="https://reqres.in/api/users/2";
		RESTUtils restUtils=new RESTUtils();
		
		Response response=restUtils.deleteSimple(url);
		
		System.out.println("response :"+response.prettyPrint());
		
	}
	
	

}
