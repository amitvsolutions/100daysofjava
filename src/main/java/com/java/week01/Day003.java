package com.java.week01;

import java.util.Scanner;

public class Day003 {
	
	public static void main(String [] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		String reverseStr = reverseString(str);		
		if(str.equals(reverseStr)) {
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}	
	}
	
	public static String reverseString(String message) {
		char[] letters = new char[message.length()];
		
		int index=0;
		for(int i = message.length()-1; i>=0; i--) {
			letters[index]=message.charAt(i);
			index++;
		}		
		return String.valueOf(letters);
	}

}
