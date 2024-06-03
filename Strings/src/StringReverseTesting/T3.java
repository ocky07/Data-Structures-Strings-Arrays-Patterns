package StringReverseTesting;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class T3 {
	 public static void main(String[] args) {
	        
	        String input = "j5ava i1s a2n o3ops lan4g";
	        
	        String[] words = input.split(" ");
	        Map<Integer, String> wordMap = new TreeMap<>();
	        
	        for (String word : words) {
	            String numericPart = "";
	            String textPart = "";
	            
	            for (char ch : word.toCharArray()) {
	                if (Character.isDigit(ch)) {
	                    numericPart += ch;
	                } else {
	                    textPart += ch;
	                }
	            }
	            
	            int order = Integer.parseInt(numericPart);
	            wordMap.put(order, textPart);
	        }
	        
	        StringBuilder output = new StringBuilder();
	        for (String word : wordMap.values()) {
	            output.append(word).append(" ");
	        }
	        
	        System.out.println("Output: " + output.toString().trim());
	    
}}
