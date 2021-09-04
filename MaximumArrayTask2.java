package com.shabbir.fullstack.array;

public class MaximumArrayTask2 {

//	public static void main(String[] args) {
//		int arr[]= new int[] {10,22,32,21,14};
//	    int max=arr[0];     //It will first index value as a maximum value
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {     //It will compare 
//				max=arr[i];
//			}
//			System.out.println("Largest value of the arrays is:"+max);
//		}
//
//}
//}
	
	public static void main(String[] args) {
		int a[]= {55,78,80,100,500};
		int max=a[0];
		for(int i=1; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
				//System.out.println("Maximum value is"+max);
			}
			//System.out.println("Maximum value is"+max);
		}
		System.out.println("Maximum value is:" +max);
	}
}