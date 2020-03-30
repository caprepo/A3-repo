package org.cap.model;

public class SalesClass {
	
	int[] arr= {23,45,67,-90,2,1};
	
	public void print() {
		int sum=0;
		for(int num:arr)
		{
			sum+=num;
			System.out.println(num);
		}
		System.out.println("Summation:" + sum);
	}
	
	public void display() {
		System.out.println("Display Sales details Here!");
	}

}
