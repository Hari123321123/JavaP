package java_project1;

import java.util.HashMap;

public class req_rep {

	public static  String req() { 	
		
		HashMap h=new HashMap();
		
		h.put("name", "anand");
		String courtname []= {"highcourt","supreme"};
		h.put("courtname", courtname );
		// TODO Auto-generated method stub
String reqbody="{ \"\"name \": \"anand \", \"courtname\" :[\"highourt\",\"supremecout\",relative: true]";
return reqbody;
	}

}
