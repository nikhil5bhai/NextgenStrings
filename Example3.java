package com.nextgen.strings;
import java.util.Scanner;

public class Example3 {
	public static void main(String args[]){
		
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = st.nextLine();
		
		if(input.length()<=0){
			System.out.println("The string is empty");
		}
		if (input.length()==1){
			System.out.println("The string is palindrome");
		}
		if (input.length()==2){
			if (input.charAt(0)==(input.charAt(1)))
				System.out.println("The string is palindrome");
			else
				System.out.println("The string is not palindrome");
		}
		if(input.length()>=3){
		
		for(int i=0;i<(input.length()-1)/2;i++){
			if(input.charAt(i)==input.charAt(input.length()-(i+1))){
			System.out.println("The string is palindrome");
			}
			else
				System.out.println("The string is not palindrome");
		}
		
		}
		
		
	}

}
