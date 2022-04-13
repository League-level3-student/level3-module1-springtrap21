package _00_Intro_To_ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList<String> bofa = new ArrayList<String>();
        // 2. Add five Strings to your list
    	bofa.add("balls");
    	bofa.add("sussy");
    	bofa.add("fornitemove");
    	bofa.add("fortniteclan");
    	bofa.add("kanye east");
        // 3. Print all the Strings using a standard for-loop
    	for(int i =0; i < bofa.size(); i++) {
    		String s = bofa.get(i);
    		System.out.println("Ayo? " + s);
    	}
        // 4. Print all the Strings using a for-each loop
    	for(String s : bofa) {
    		System.out.println(s);
    	}
    	
    	System.out.println("/n");
        // 5. Print only the even numbered elements in the list.
    	
        // 6. Print all the Strings in reverse order.
    	for(int i = bofa.size() - 1; i < bofa.size(); i--) {
    		String s = bofa.get(i);
    		System.out.println("Ayo? " + s);
    	}
        // 7. Print only the Strings that have the letter 'e' in them.
        for(int i = 0; i < bofa.size(); i++) {
        	if (bofa.contains("e")) {
				System.out.println(i);
			}
        }
    	
    }
}
