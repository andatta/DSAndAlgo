package com.anutosh.heap;

public class TournamentTree {

	public static void main(String[] args) {
		int[] players = new int[] {10, 4, 12, 9, 3, 1, 7, 8, 6, 11, 5, 2};
		int playersInOneMatch = 5;
		startTournament(players, playersInOneMatch * 2 - 1);
	}
	
	private static void startTournament(int[] arr, int n){
		for(int i = n/2 - 1; i >= 0; i--){
			heapifyMin(arr, n, i);
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	private static void heapify(int[] arr, int n, int i){
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
	
	private static void heapifyMin(int[] arr, int n, int i){
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

}
