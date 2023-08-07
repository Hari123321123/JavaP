package java_project1;

import java.util.HashMap;
import java.util.HashSet;

public class uniq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    
		        String inputString = "deepaksh";
		        HashSet<Character> uniqueChars = new HashSet<Character>();
   
		        for (char ch : inputString.toCharArray()) {
		            if (Character.isLetter(ch)) { // Exclude non-alphabetic characters if needed
		                uniqueChars.add(ch);
		            }
		        }

		        System.out.println("Unique characters in the string: ");
		        for (char ch : uniqueChars) {
		            System.out.print(ch + " ");
		        }
		      
		        }
		    }


