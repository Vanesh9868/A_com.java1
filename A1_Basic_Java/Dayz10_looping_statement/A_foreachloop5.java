package Dayz10_looping_statement;

import java.util.ArrayList;

public class A_foreachloop5 {
	
	public ArrayList getSmallerValue(String currentValue, String b[]) {
		
		String current = currentValue;
		ArrayList list = new ArrayList();
		
		for (String i : b) {
			if (i.compareTo(current) < 0) {
				list.add(i);
			}

		}
	
		return list;
	}

	public static void main(String[] args) {

		String current = "50";
		String b[] = { "10", "20", "30", "40", "50", "60", "70", "80" };
		
		for (String i : b) {
			if (i.compareTo(current) < 0) {
				System.out.println(i);
			}

		}

	}

}
