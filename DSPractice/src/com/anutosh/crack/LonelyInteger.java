package com.anutosh.crack;

public class LonelyInteger {

	public static void main(String[] args) {
		int[] a = new int[] {1, 1, 2};
		
		int val = 0;
		
		for(int i = 0; i < a.length; i++){
			val = val ^ a[i];
		}
		
		System.out.println(val);
	}

}
