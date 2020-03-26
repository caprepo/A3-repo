package org.cap.boot;

import org.cap.model.SalesClass;

public class MainClass {

	public static void main(String[] arg) {
		SalesClass obj=new SalesClass();
		obj.print();
		show();
	}
	
	public static void show() {
		int[] arr= {1,2,3,4,4,6,6,7,66,90};
		int sum=0;
		for(int num:arr)
			sum+=num;
		System.out.println("Summation : " + sum);
		System.out.println("Hello! this is Show Method!");
		System.out.println("greet User - Here!");
	}
}
