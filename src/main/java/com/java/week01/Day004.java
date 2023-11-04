package com.java.week01;

public class Day004 {
	
	public static void main(String [] args) {
		int noOfBooks= 10;
		
		while(noOfBooks>0) {
			System.out.println("Total "+ noOfBooks + " books on the Table.");
			
			System.out.println("Put "+ noOfBooks + " book in the shelf.");
			noOfBooks--;
			
			if(noOfBooks ==0) {
				System.out.println("No more book left in the table.");
			}
		}
	}


}
