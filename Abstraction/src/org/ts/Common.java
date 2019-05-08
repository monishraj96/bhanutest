package org.ts;

public class Common implements BankDetails{

	@Override
	public void saving() {
System.out.println("5%");		
	}

	@Override
	public void deposit() {
System.out.println("7%");		
	}

	@Override
	public void fixed() {
System.out.println("8%");		
	}

	public static void main(String[] args) {
	Common bd=new Common();
		bd.saving();
		bd.deposit();
		bd.fixed();
	}
}
