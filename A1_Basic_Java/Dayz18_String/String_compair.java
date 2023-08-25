package Dayz18_String;

public class String_compair {

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

		System.out.println(stringCompair("20", "10"));

//		String a="20";
//		String b="10";

//		System.out.println(a.compareTo(b)==1);
//		System.out.println(a.compareTo(a));
//		System.out.println(b.compareTo(a));

	}

}
