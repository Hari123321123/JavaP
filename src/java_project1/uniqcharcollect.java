package java_project1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class uniqcharcollect {

	public static void uniqint()   
    {   
		
		
        //create an integer array having some duplicate elements   
        int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
  
        //create a hashmap having integer type of key-value  
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
        //use for loop to pull the elements of array to hashmap's key  
        for (int j = 0; j < arrayWithDuplicates.length; j++) {   
            hashmap.put(arrayWithDuplicates[j], j);   
        }   
        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method   
        System.out.println(hashmap.values());   
    }  
	public static void uniqchar()   
    {   
        //create an integer array having some duplicate elements   
        String str="deeeeppppakjhhdhsssssssssssss";     
        //create a hashmap having integer type of key-value  
        HashSet<Character> hashs = new HashSet<Character>();   
          
        //use for loop to pull the elements of array to hashmap's key  
        for (int j = 0; j < str.length(); j++) {   
           hashs.add(str.toCharArray()[j]);  
           System.out.println(hashs);
        }   
        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method   
    }   

}
