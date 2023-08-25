package Dayz18_String;

public class hello2 {

	public static boolean containsCharacter(String input) {
		for (int i = 0; i < input.length(); i++) {
			char[] b = input.toCharArray();
			if (Character.isLetter(b[i])) {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {

		boolean output = hello2.containsCharacter("123456");

		System.out.println(output);

	}

}
