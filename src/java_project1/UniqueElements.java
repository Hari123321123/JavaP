package java_project1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9};

        // Using HashSet to get unique elements
        Collection<Integer> uniqueElements = new HashSet<>();

        // Adding array elements to the HashSet
        for (int num : array) {
            uniqueElements.add(num);
        }
        // Converting HashSet back to ArrayList
        ArrayList<Integer> uniqueList = new ArrayList<>(uniqueElements);

        // Printing the unique elements
        System.out.println("Unique Elements:");
        for (int num : uniqueList) {
            System.out.println(num);
        }
    }
}
