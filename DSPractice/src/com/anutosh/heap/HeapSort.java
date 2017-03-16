package com.anutosh.heap;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = new int[] {4, 10, 3, 5, 1};
		//heapSort(arr);
		int n = arr.length;
		for(int i = n/2 -1; i >= 0; i--){
			heapify(arr, n, i);
		}
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(replaceMax(arr, 2));
		
		System.out.println();
		
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void heapSort(int[] arr){
		int n = arr.length;
		
		for(int i = n/2 -1; i >= 0; i--){
			heapifyMin(arr, n, i);
		}
		
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = n - 1; i >= 0; i--){
			int temp = arr[0];
			arr[0] = arr[i]; 
			arr[i] = temp;
			
			heapifyMin(arr, i, 0);
		}
		
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void heapify(int[] arr, int n, int i){
		int largest = i;
		int left = (2 * i) + 1;
		int right = (2 * i) + 2;
		
		if(left < n && arr[left] > arr[largest]){
			largest = left;
		}
		
		if(right < n && arr[right] > arr[largest]){
			largest = right;
		}
		
		if(largest != i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, n, largest);
		}
	}
	
	public static void heapifyMin(int[] arr, int n, int i){
		int smallest = i;
		
		int left = (2 * i) + 1;
		int right = (2 * i) + 2;
		
		if(left < n && arr[left] < arr[smallest]){
			smallest = left;
		}
		
		if(right < n && arr[right] < arr[smallest]){
			smallest = right;
		}
		
		if(smallest != i){
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			
			heapifyMin(arr, n, smallest);
		}
	}
	
	public static int replaceMax(int[] arr, int key){
		int max = arr[0];
		arr[0] = key;
		
		heapify(arr, arr.length, 0);
		return max;
	}
	
	public static int replaceMin(int[] arr, int n, int key){
		int min = arr[0];
		arr[0] = key;
		
		heapifyMin(arr, n, 0);
		return min;
	}

}
