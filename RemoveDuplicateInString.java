package week3.day2.string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;



public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str=text.split(" ");
		List<String> strList=new ArrayList<String>();
		strList.addAll(Arrays.asList(str));
		System.out.println(strList);
		Set<String> strSet=new LinkedHashSet<String>(strList);
		System.out.println(strSet);
		
	}

}