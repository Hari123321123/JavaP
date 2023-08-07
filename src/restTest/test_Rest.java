package restTest;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.hc.core5.http.ContentType;
import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
public class test_Rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Response  res =given().header("Content-Type","application/json").when().get("https://jsonplaceholder.typicode.com/users");
    String resp =given().header("Content-Type","application/json").when().get("https://jsonplaceholder.typicode.com/users").then().extract().response()
				.asString();
  //Headers hd=res.getHeaders();
//	hd.getValue(resp);hd.getList(resp);
    
 //   Map<String,String>m=res.getCookies();
//res.getTime();
	    JsonPath d= new JsonPath(resp);
	    JSONArray iy= new JSONArray(resp);	
	    int size=iy.length();
		//ArrayList<String>name=d.get("name");
	for (int i=0;i<=size-1;i++) 
		
	{
		String dd=d.getString("["+i+"].username");
		String address=d.getString("["+i+"].address");
		String a_street=d.getString("address["+i+"].street");
		String lt=d.getString("address.geo["+i+"].lat");
		String ln=d.getString("address.geo["+i+"].lng");
		String bs=d.getString("company["+i+"].name");
		int id=d.getInt("["+i+"].id");		
	    System.out.println(id +"      "+dd+"   "+address  +"   "+a_street+"    "+lt+"     "+ln+"   "+bs );		
	}
	
    //BY JSONOBJECT AND JSON ARRAY
       JSONArray d1= new JSONArray(resp);	
    for (int i=0;i<=size-1;i++) 
    {
	  int id =d.getInt("["+i+"].id");
	  String dd=d.getString("["+i+"].username");
	  String lat1=d1.getJSONObject(i).getJSONObject("address").getJSONObject("geo").getString("lat");
	  String lng1=d1.getJSONObject(i).getJSONObject("address").getJSONObject("geo").getString("lng");
	  System.out.println("id is   "+id+" username     "+dd+"  lat  "+lat1+"   "+" long "+lng1);
    }
  }
} 
