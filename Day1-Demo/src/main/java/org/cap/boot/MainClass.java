package org.cap.boot;

import org.cap.model.SalesClass;

public class MainClass {

	public static void main(String[] arg) {
		SalesClass obj=new SalesClass();
		obj.print();
		show();
	}
	
	public static void show() {
		System.out.println("Hello! this is Show Method!");
		System.out.println("greet User - Here!");
	}
}
