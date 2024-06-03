package com.prudhvi.NewStringProgrames;

public class ReverseEachWordInaString {
public static void main(String[] args) {
	 String s= "java is an oops lang"; //avaj si na spoo gnal
     String revsentence= revwords(s);
     System.out.println(revsentence);
	
}
public static String revwords(String sentence) {
	
    StringBuilder reversedSentence = new StringBuilder();
    StringBuilder currentWord = new StringBuilder();
    
    for (int i = 0; i < sentence.length(); i++) {
        char c = sentence.charAt(i);
        if (c == ' ') {
            reversedSentence.append(reverseWord(currentWord)).append(" ");
            currentWord.setLength(0);  // Clear the current word
        } else {
            currentWord.append(c);
        }
    }

    reversedSentence.append(reverseWord(currentWord));  // Append the last word

    return reversedSentence.toString();
}
public static String reverseWord(StringBuilder word) {
    StringBuilder reversedWord = new StringBuilder();
    for (int i = word.length() - 1; i >= 0; i--) {
        reversedWord.append(word.charAt(i));
    }
    return reversedWord.toString();
}


}
