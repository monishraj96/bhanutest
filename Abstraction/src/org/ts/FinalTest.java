package org.ts;

public class FinalTest implements ar1,ar2{

	@Override
	public void test2() {
System.out.println("123");		
	}

	@Override
	public void test1() {
System.out.println("456");		
	}

	@Override
	public void test3() {
System.out.println("789");		
	}
public static void main(String[] args) {
	FinalTest ft=new FinalTest();
	ft.test1();
	ft.test2();
	ft.test3();
}
}
