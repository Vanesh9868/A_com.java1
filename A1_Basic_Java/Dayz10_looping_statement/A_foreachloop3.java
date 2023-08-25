package Dayz10_looping_statement;

import java.util.ArrayList;

public class A_foreachloop3 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		String current = "50";
		String b[] = { "10", "20", "30", "40", "50", "60", "70", "80" };

		for (String i : b) {
			if (i.compareTo(current) < 0) {
//				System.out.println(i);
				list.add(i);
			}

		}
		

		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}

		
	}

}
