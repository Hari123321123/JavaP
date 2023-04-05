package Test1;
import java.util.ArrayList;

public class repeatingchar2 {

	public static void main(String[] args) {
		
		//TO find 1st occurance of repeating charachter
		repeatingchar("abcaadebcfedhgwqekjjhjhsdahhwq jhgsavzvajbjjsdhahjdvznbvcvdhvc");
		

	}

	public static void repeatingchar(String strng)
	{
		char [] chararray= strng.toCharArray();
		int  count = chararray.length;
		for(int i=0;i<count;i++) 
		{
			int charcount = 1;
			for(int j=i+1;j<count;j++)
			{
				if(chararray[i]==chararray[j])
				{
		charcount++;
		chararray[j]='0';  //incase of char we use single inverted comma, for string we use double inverted comma.
		         }
		    }
			
			if(charcount>1&&chararray[i]!='0') 
			{
		System.out.println(chararray[i]+"="+charcount);// if we want to print all repeating chars and there name use this with out break.
		// break;// if we want only first occcurance then use break;
		
		    }	
			if(charcount==1&&chararray[i]!='0') 
			{
				System.out.println(chararray[i]);
			}
		}
	}
}

