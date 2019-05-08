package org.ts;

import java.util.Scanner;

public class EvenNumOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(num);
		if(num%2==0) {
			System.out.println("given number is even");}
		else
		{System.out.println("given num is odd");
		}
		
	}

}
