package com.q1;

import java.util.Scanner;

public class Question1 {
 public static void main(String[] args) {
 // Reverse a string without using String inbuilt function reverse(). 20
	 String str ="" , rev= "";
	 System.out.println("Enter the String : \n");
	 Scanner sc = new Scanner(System.in);
	 str = sc.nextLine();
	 sc.close();
	 for( int i = str.length() - 1; i >= 0; i--) {
		 rev += str.charAt(i);
	 }
	 System.out.println("Reverse : "+rev);
 }
}
