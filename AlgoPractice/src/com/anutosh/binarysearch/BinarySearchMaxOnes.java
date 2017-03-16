package com.anutosh.binarysearch;

public class BinarySearchMaxOnes {

	public static void main(String[] args) {
		int[][] mat = new int[][]{{0, 1, 1, 1}, {0,0,1,1}, {1, 1, 1, 1}, {0,0,0,0}};
		System.out.println(rowWithMaxOnes(mat, 4, 4));

	}

	private static int rowWithMaxOnes(int[][] mat, int row, int col) {
		int maxRow = 0;
		int maxCount = 0;
		for (int i = 0; i < row; i++) {
			int[] col_arr = mat[i];
			int pos = findFirstOne(col_arr, 0, col - 1);
			if (pos != -1) {
				int count = col - pos;
				if (count > maxCount) {
					maxRow = i;
					maxCount = count;
				}
			}
		}
		return maxRow;
	}

	private static int findFirstOne(int[] arr, int left, int right) {
		if (left > right) {
			return -1;
		}
		int middle = (left + right) / 2;

		if (arr[middle] == 1) {
			if ((middle - 1) < left || (middle + 1) > right) {
				return middle;
			} else if ((middle - 1) >= left && arr[middle - 1] == 0) {
				return middle;
			} else {
				return findFirstOne(arr, left, middle - 1);
			}
		} else {
			if ((middle + 1) <= right && arr[middle + 1] == 1) {
				return middle + 1;
			} else {
				return findFirstOne(arr, middle + 1, right);
			}
		}
	}

}
