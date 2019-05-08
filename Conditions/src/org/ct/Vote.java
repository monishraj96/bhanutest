package org.ct;

import java.util.Scanner;

public class Vote 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	int age=sc.nextInt();
	System.out.println(age);
      if (age>=18)
      {
    	 System.out.println("Eligible to vote");
	  }
else
{
	System.out.println("not eligible");
}

	}}
	
			


