package week3.day2.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInList {

	public static void main(String[] args) {

		int[] arr = { 24,56,46,67,89,21,34,24,34,46 };
		List<Integer> arrList = new ArrayList<Integer>();
		Set<Integer> dupSet = new LinkedHashSet<Integer>(arrList);
		for (int i : arr) {
			arrList.add(i);
		}
		System.out.println("*** Duplicate numbers in the list are ***");
		for (int i = 0; i < arrList.size(); i++) {
			boolean addStatus=dupSet.add(arrList.get(i));
			if(addStatus!=true) {
				System.out.println(arrList.get(i));
			}
		}

	}
}