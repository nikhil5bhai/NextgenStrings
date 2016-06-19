package com.nextgen.strings;
import java.util.Scanner;
public class StringReverse {
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String original = s.nextLine();
		
		System.out.println("The reverse of string is  "+reversemethod(original));			
	}	
	
	public static String reversemethod(String input){
		String reverse= "";
		if (input.length()==0){
			return "";
		}		
		if (input.length()==1){
			return input;
		}
		if (input.length()>=2){
		for (int i= input.length()-1; i>=0; i--){
			reverse = reverse + input.charAt(i);			
		    }
		}
		return reverse;
	}
}
	
	
		
		
	
	