package week3.day2.string;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> car1=new ArrayList<String>();
		car1.add("Audi");
		car1.add("BMW");
		car1.add("Amaze");
		car1.add("Creta");
		
		System.out.println("Car Set1");
		System.out.println(car1);
		
		System.out.println("*********************");
		
		List<String> car2=new ArrayList<String>();
		car2.add("Venue");
		car2.add("Nexon");
		car2.add("Amaze");
		car2.add("Benz");
		car2.add("Jaguar");
		
		System.out.println("*********************");
		System.out.println("Car Set2");
		System.out.println(car2);
		
		System.out.println("*********************");
		System.out.println("Common Cars in Car1 List and Car2 List");
		car1.retainAll(car2);
		
		System.out.println("Car Set1");
		System.out.println(car1);
		
		System.out.println("Car Set2");
		System.out.println(car2);
		
		
		
		
		
	}

}
