package Test1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String index1="12110000101000001011";
		//int[] index=new int[] {23,65,1,8,99,56};
		char[]index=index1.toCharArray();
		//System.out.println(index[4]);
	 ArrayList<Character>d=new ArrayList<Character>();
	 
	 
	int length=index.length;
	for(int i=0;i<length;i++)
	{
		for(int j=i+1;j<length;j++) 
		{
			if(index[i]>index[j]) 
        {
		char temp=index[j];
		index[j]=index[i];	
		index[i]=temp;
			}
		}
		
	System.out.println(index[i]+"    "+d.add(index[i]));
	}
		
	System.out.println(index[0]+"  "+index[1]);	
	d.remove(19);
	System.out.println(d);
	
	

	
	}

}

