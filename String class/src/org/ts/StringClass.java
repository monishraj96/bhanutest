package org.ts;

public class StringClass {
	public static void main(String[] args) {
	String S="Bhanub";
	String S7="bhanub";
	String s10="";
			//To find out the length of the String
	int len=S.length();
	{
		System.out.println(len);
	}
	
	//to find out the particular character
	char C=S.charAt(3);
	{
		System.out.println(C);
	}
	//Everything in upper case
	String S1=S.toUpperCase();
	{
		System.out.println(S1);
	}
	//every thing in lower case
	String S2=S.toLowerCase();
	{
		System.out.println(S2);
	}
	//Check weather it starts with particular letter
	boolean b=S.startsWith("B");
	{
		System.out.println(b);
	}
	
	//ends with the particular letter
	boolean b1=S.endsWith("p");
	{
		System.out.println(b1);
	}
	// index of the character
   int I=S.indexOf("h");
   {
	   System.out.println(I);
   }
   int I1=S.indexOf("m");
   {
	   System.out.println(I1);
   }
   //last index of
  int I2=S.lastIndexOf("B");
  {
	  System.out.println(I2);
  }
  //contains
 boolean b2=S.contains("bh");
 {
	 System.out.println(b2);
 }
 //contains equalsS
 boolean b3=S.contentEquals(S7);
 {
	 System.out.println(b3);
 }
 
 boolean b4=S.equalsIgnoreCase(S7);
 {
	 System.out.println(b4);
 }
  //change
String S8=S.replace("B", "k");
{
	System.out.println(S8);
}

boolean b5=s10.isEmpty();
{
	System.out.println(b5);
}

int j=S.compareTo(S7);
{
	System.out.println();
}
 String S15="Hello world";
 String S17=S15.substring(4,10);
 {
	 System.out.println(S17);
 }
 String S18=S15.substring(5);
	{
		System.out.println(S18);
		}
  
  
  
  
	}

}
