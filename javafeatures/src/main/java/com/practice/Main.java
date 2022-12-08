package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1, 1, 2, 4 };
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {

			if (!Main.isDuplicate(arr[i], arr, i)) {
				list.add(arr[i]);
			}
		}

		System.out.println(list);
	}

	public static boolean isDuplicate(int element, int arr[], int startPosition) {

		for (int j = startPosition; j < arr.length; j++) {

			if (arr[j] == element) {
				return true;
			}
		}
		return false;
	}

}
