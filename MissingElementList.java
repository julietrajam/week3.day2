package week3.day2.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		int[] arr = { 51, 52, 53, 55, 56, 57, 65 };
		int j = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int arrData : arr) {
			list.add(arrData);
		}
		Collections.sort(list);
		 
		int length=list.size();
		
		for (int i = list.get(0); i <= list.get(0)+length; i++) {
			if (i != list.get(j)) {
				System.out.println("Missing number in the list is: "+i);
				break;
			};
			j++;
		}

	}

}