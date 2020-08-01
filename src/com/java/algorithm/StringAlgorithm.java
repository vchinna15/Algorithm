package com.datastructure;

import java.util.HashMap;

public class StringAlgorithm {
	
	 public static void allSubStringsOfString(String str) 
	    { 
		 int n = str.length();
	       for (int i = 0; i < n; i++)  
	           for (int j = i+2; j <= n; j++) 
	             
	                // Please refer below article for details 
	                // of substr in Java 
	                // https://www.geeksforgeeks.org/java-lang-string-substring-java/ 
	                System.out.println(str.substring(i, j)); 
	    } 
	 
	 public static void duplicateCharCount(String inputString) {
		 //Creating a map containing char as key and count as value
		 HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		 //convert given input string to char array
		 char[] strArray = inputString.toCharArray();
		 //checking each char of strAray
		 for (char c: strArray) {
			 if (charCountMap.containsKey(c)) 
				 charCountMap.put(c, charCountMap.get(c)+1);			 
		 	else
		 		charCountMap.put(c,1);

	 }
		 
		 
	 }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print all substrings of string
		String str = "abcd";
		allSubStringsOfString(str);;
		//FInd Intersection
		//use String array; string split method, stringbuilder class
		String[] arr = new String[2];
		arr[0] = "1, 2, 3";
		arr[1] = "4, 2, 3,5";
		
		String str1[] = arr[0].split(",");
		String str2[] = arr[1].split(",");
		String answer = "";
		for (int i=0; i < str1.length; i++ ) {
			for (int j=0; j < str2.length; j++) {
				if (str1[i].equals(str2[j])) {
					answer = answer+","+str1[i].trim();
				}
			}
		}
		System.out.println(answer);
		// FInd Intersection

		//Two sum problem - Brute-force appoach
		
		
	}

}
