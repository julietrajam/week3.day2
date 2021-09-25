package week3.day2.list;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		//Declare Array
		int[] data = { 5, 9, 3, 6, 2, 8 };
		
		//Declare List
		List<Integer> list = new ArrayList<Integer>();
		
		for (int arr : data) {
			list.add(arr);
		}
		System.out.println("Before Sorting: " + list + "\n");
		Collections.sort(list);
		System.out.println("After sorting: " + list + "\n");
		int index = list.size() - 2;
		System.out.println("Second largest number is: " + list.get(index));

	}

}