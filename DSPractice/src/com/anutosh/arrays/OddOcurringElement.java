package com.anutosh.arrays;

public class OddOcurringElement {

	public static void main(String[] args) {
		int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		System.out.println(oddOccurence(arr));
	}
	
	private static int oddOccurence(int[] arr){
		int res = 0;
		for(int i = 0; i < arr.length; i++){
			System.out.println(res);
			res = res ^ arr[i];
		}
		return res;
	}

}
