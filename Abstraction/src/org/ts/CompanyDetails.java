package org.ts;

public class CompanyDetails extends Employee{

	@Override
	public void employeeID() {
System.out.println("1234");		
	}

	@Override
	public void employeePh() {
System.out.println("9087426646");		
	}
public static void main(String[] args) {
	CompanyDetails cd=new CompanyDetails();
	cd.employeeID();
	cd.employeePh();
	cd.employeeDob();
}
}
