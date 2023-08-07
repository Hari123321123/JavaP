package java_project1;

import java.util.HashMap;

import org.json.JSONObject;

public class strgg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Haribhau Shahaji Chaudhari";
String s1=s.toLowerCase();
				int count =s.length();
				String rvs="";
				char [] string =s1.toCharArray();

				for (int i=count-1;i>=0 ;i--)

				{
				rvs=rvs+ s.charAt(i);
				}

				System.out.println(rvs.toLowerCase());
	
	
	 StringBuilder b=new StringBuilder(s);
	    b.reverse();
	    
	    System.out.println(b);
	    
	    
HashMap h=new HashMap();
		
		h.put("name","anand");
		String courtname []= {"highcourt","supreme"};
		h.put("courtname",courtname  );
		h.toString();
		
		
JSONObject h1=new JSONObject();
		
		h1.put("name","anand");
		String courtname1 []= {"highcourt","supreme"};
		h1.put("courtname",courtname1  );
		h1.toString();
		System.out.println(h1);
}}
