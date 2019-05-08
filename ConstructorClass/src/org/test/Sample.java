package org.test;

import java.awt.image.SampleModel;

public class Sample {
	public Sample() {
		System.out.println("Sample");
	}
public Sample(int num) {
	this("bhanu",9347723111l);
	System.out.println(num);
}
public Sample(String name,long phonenumber) {
	System.out.println(name+"\n"+phonenumber);
}
public static void main(String[] args) {
	Sample v=new Sample();
	Sample v1=new Sample(123);
}
}
