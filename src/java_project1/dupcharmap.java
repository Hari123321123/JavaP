package java_project1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class dupcharmap {

	public static void
    main(String args[]) throws IOException
    {
        // Given String str
        String str = "geeksforgeeks";
        // Function Call
	        // Creating a HashMap containing char
	        // as a key and occurrences as a value
	        Map<Character,Integer> map
	            = new HashMap<Character, Integer>();
	 
	        // Converting given string into
	        // a char array
	        char[] charArray = str.toCharArray();
	 
	        // Checking each character
	        // of charArray
	        for (char c : charArray) {
	 
	            if (map.containsKey(c)) {
	 
	                // If character is present
	                // in map incrementing it's
	                // count by 1
	                map.put(c, map.get(c) + 1);
	            }
	            else {
	                // If character is not present
	                // in map putting this
	                // character into map with
	                // 1 as it's value.
	                map.put(c, 1);
	            }
	        }
	        System.out.println(map
                    + "\n \n : "
                    + map.values());
	        
	        Path path = Paths.get("C:\\req.xlsx");
	        
	        long size = Files.size(path);
	       System.out.println(size); 
	       
	        // Traverse the HashMap, check
	        // if the count of the character
	        // is greater than 1 then print
	        // the character and its frequency
	        /*for (Map.Entry<Character, Integer> entry :
	             map.entrySet()) {
	 
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey()
	                                   + " : "
	                                   + entry.getValue());
	                
	            }
	                
	            
	            else 
	            {
	            	  System.out.println(entry.getKey()
                              + " : "
                              + entry.getValue());
	            }
	                
	            }*/
	        }
	    }
	 
	    // Driver Code
	    

	


