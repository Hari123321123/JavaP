package restTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datap {

		
		@DataProvider(name="test") 
		
		public String [][]getlogindata(){
			
			String[][] a={{"getdata1","getdata2","djhsdh"},
					
			              {"a","c","d"},
			              
			              {"ffsa","asbs","hah"}
			
			};
			
			return a;	
		}
		
	@Test(dataProvider="test") 

		public void logintest(String a,String b ,String c) {
			
			System.out.println(a+"    "+b+c); 

	}}
	

