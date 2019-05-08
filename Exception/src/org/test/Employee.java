package org.test;

public class Employee {
	public static void main(String[] args) {
		System.out.println("start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try {
			
			String name=null;
			System.out.println(name.length());
			System.out.println(10/0);
			}
	
		catch (NullPointerException e) {
			System.out.println("Bhanu");
			 }
		catch (ArithmeticException e) {
			System.out.println("10/0");	
			}
		System.out.println("4");
		System.out.println("end");
	}
	

}
