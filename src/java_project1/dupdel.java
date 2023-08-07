package java_project1;

import java.util.HashSet;
import java.util.Set;

public class dupdel {

	
		// TODO Auto-generated method stub
		
		    public static String removeDuplicates(String input) {
		        Set<Character> uniqueChars = new HashSet<>();
		        StringBuilder result = new StringBuilder();

		        for (int i = 0; i < input.length(); i++) {
		            char currentChar = input.charAt(i);
		            if (!uniqueChars.contains(currentChar)) {
		                uniqueChars.add(currentChar);
		                result.append(currentChar);
		            }
		        }

		        return result.toString();
		    }

		    public static void main(String[] args) {
		        String input = "HellHHgshafgsgdfhagfaaaaaaaaaaffffffffffftwwwwwwwwwwwwwwwshhhhhhhhhhxahjvxxxxxxxxxxxxxxxxxxxxannnnnnnnnnnnnnnHHH";
		        String result = removeDuplicates(input);
		        System.out.println("Input: " + input);
		        System.out.println("Result: " + result);
		    }
		

	}


