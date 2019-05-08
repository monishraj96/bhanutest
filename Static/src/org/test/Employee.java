package org.test;


public class Employee {

	public  Employee() {
		this(23.46f);
		System.out.println("Bhanu");
	}
	public  Employee(int i, String name) {
		System.out.println(i+name);
		
	}
	public  Employee(float sal) {
		this(23,"bhna");
		System.out.println(sal);
	}
public static void main(String[] args) {
	Employee e=new Employee();
}

	}
		


