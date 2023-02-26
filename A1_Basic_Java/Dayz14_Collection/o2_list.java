package Dayz14_Collection;

import java.util.ArrayList;
import java.util.List;

public class o2_list {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String> ();
		
		list.add("yogesh");
		list.add("manish");
		list.add("niraj");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println();
	
		
		ArrayList<String> list1 = new ArrayList<String> ();
	
		list1.add("priya");
		list1.add("pranita");
		list1.add("neha");
		list1.addAll(list);

		
		System.out.println(list1);
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));
		System.out.println(list1.get(5));
		
	
	
	
	}

}
