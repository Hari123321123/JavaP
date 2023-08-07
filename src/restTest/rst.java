package restTest;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.apache.http.Header;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.Assert;
public class rst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String reqbody="{ \"\"name \": \"anand \", \"courtname\" :[\"highourt\",\"supremecout\",relative: true]";
		
		
		JSONObject j =new JSONObject();
		 j.put("name","hari");
	j.put("Job","qa");
		System.out.println(j.toString());
       HashMap h=new HashMap();
		/*JSONObject j =new JSONObject();
		 j.put("name","anand");
			String courtname1 []= new String[]{"highcourt","supremecout"};
       j.put("relative","true");
	j.put("courtname", courtname1);
		System.out.println(j.toString());*/
		RestAssured.baseURI="http://www.backgroundverification.com";
		String result= given().headers("content-Type","application/json").body(j.toString())
				.when().post("https://reqres.in/api/users").then().extract().response().asString();
		System.out.println(result);
		RequestSpecification request=RestAssured.given();
	  Response res=given().headers("content-Type","application/json").body(j.toString())
			.when().post("https://reqres.in/api/users");
	  System.out.println(res.getCookies());
	 Headers h22 =res.getHeaders();
long  e= res.getTime();
//obtain Response as string
String j1 = res.asString();

// obtain ValidatableResponse type
ValidatableResponse v = res.then();

//verify response time lesser than 1000 milliseconds
v.time(Matchers.lessThan(1000L));
System.out.println(e);
	  
for(io.restassured.http.Header hd:h22)
{
	System.out.println(hd.getName()+"  == "+hd.getValue());
}
	 	  
}}


