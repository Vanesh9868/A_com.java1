package Dayz12_String_methods;

public class split {

	public static String splitString(String input, String data) {
		String result = null;
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains(data)) {
				result = arr[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {

		String number = split.splitString("!@#$%^& 1234567 1234567 ASDFGHJ QWERTY", "1234567");

		System.out.println(number);
	}

}
