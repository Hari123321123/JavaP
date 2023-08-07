package java_project1;

import java.util.HashSet;

public class strA {

	public static void main(String[] args) {
		 //create an integer array having some duplicate elements   
        String str="deeeeppppakjhhdhsssfffdsdudisddnjjvfd3228498r938090490995vnfvssssssssss";
        
        //create a hashmap having integer type of key-value  
        HashSet<Character> hashs = new HashSet<Character>();   
          
        //use for loop to pull the elements of array to hashmap's key  
        for (int j = 0; j < str.length()-1; j++) {   
            hashs.add(str.toCharArray()[j]);  
            
        }   
        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method   
        System.out.println(hashs);
    StringBuilder b=new StringBuilder(str);
    b.reverse();
    
    System.out.println(b);
    
    }   

}
