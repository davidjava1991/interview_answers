package com.q2;

public class Answer2 {
// Swap two numbers using the third variable. 20
	public static void main(String[] args) {
		int a = 10, b = 20, c = 0;
		System.out.println("initial a = " + a + " , b= " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("Swapped : a = " + a + " , b= " + b);

	}
}
