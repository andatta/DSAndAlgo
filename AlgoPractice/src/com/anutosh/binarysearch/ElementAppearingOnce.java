package com.anutosh.binarysearch;

public class ElementAppearingOnce {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 1, 3, 3, 4, 4, 5, 5, 7, 7, 8};
		findSingleElement(arr, 0, arr.length - 1);
	}
	
	private static void findSingleElement(int[] arr, int left, int right){
		if(left > right){
			return;
		}
		
		if(left == right){
			System.out.println(arr[left]);
			return;
		}
		
		int middle = (left + right)/2;
		
		if(middle % 2 == 0){
			if(arr[middle] == arr[middle + 1]){
				findSingleElement(arr, middle + 2, right);
			}else{
				findSingleElement(arr, left, middle);
			}
		}else{
			if(arr[middle] == arr[middle - 1]){
				findSingleElement(arr, middle + 1, right);
			}else{
				findSingleElement(arr, left, middle - 1);
			}
		}
		
		
	}

}
