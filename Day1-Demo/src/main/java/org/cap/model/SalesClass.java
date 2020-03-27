package org.cap.model;

public class SalesClass {
	
	int[] arr= {23,45,67,-90,2,1};
	
	public void print() {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Summation:" + sum);
	}
	
	public void display() {
		System.out.println("Display Sales details Here!");
	}

}
