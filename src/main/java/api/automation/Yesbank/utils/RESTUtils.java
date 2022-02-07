package api.automation.Yesbank.utils;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RESTUtils {


	public Response  get(String url)
	{
		return	RestAssured.given()
				//.header(header)
				.get(url);

	}


	public Response  getWithParam(String url,Map<String,Integer> map)
	{
		return	RestAssured.given()
				.queryParams(map)
				.log().all()
				//.header(header)
				.get(url);
	}


	public Response  post(String url,String body)
	{
		return	RestAssured.given()
				.contentType("application/json")
				.log().all()
				.body(body)
				.post(url);
	}

	public Response put(String url,String body)
	{
		return	RestAssured.given()
				.contentType("application/json")
				.log().all()
				.body(body)
				.post(url);
	}

	
	public Response delete(String url,Map<String,Integer> map)
	{
		return	RestAssured.given()
				.queryParams(map)
				.log().all()
				.get(url);
	}
	
	public Response deleteSimple(String url)
	{
		return	RestAssured.given() 
				.log().all()
				.delete(url);
	}




}
