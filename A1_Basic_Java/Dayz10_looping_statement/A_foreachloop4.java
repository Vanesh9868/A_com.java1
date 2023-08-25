package Dayz10_looping_statement;

public class A_foreachloop4 {
	
	public static boolean stringCompair(String compairValue, String MinValue) {
		boolean value = false;
		String a = compairValue;
		String b = MinValue;
		int max = a.compareTo(b);
		if (max == 1) {
			value = true;
		}
		return value;
	}

	public static void main(String[] args) {

		String current = "50";

		String b[][] = { { "10", "20", "30", "40", "50", "60", "70", "80" } };

		for (String[] i : b) {

			for (String n : i) {
				System.out.println(n.compareTo(current));
				while (stringCompair(current, n)) {
					System.out.println(n);
				}


			}
		}

	}

}
