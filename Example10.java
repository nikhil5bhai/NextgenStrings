package com.nextgen.strings;

import java.util.Scanner;

public class Example10 {
	public static void main(String args[]){

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String original = s.nextLine();
		int count=1; int i = 0; int j=0;
		
		while(j<original.length()-1){
		
		System.out.print(original.charAt(i));
		if (original.charAt(i)!=original.charAt(i+1)){
				count=1;
			}
		for(i=0;i<original.length()-1;i++){
			if (original.charAt(i)==original.charAt(i+1)){
			count=count+1;
			}		
		System.out.print(count);
		j++;
		}
	}	
}
}