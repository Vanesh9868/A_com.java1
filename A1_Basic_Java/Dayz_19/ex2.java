package Dayz_19;

public class ex2 {

	public static String addSpaceBeforeUppercase(String input) {
		StringBuilder StringBuild = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char characterInput = input.charAt(i);
			if (Character.isUpperCase(characterInput)) {
				StringBuild.append(" ");
			}
			StringBuild.append(characterInput);
		}
		String result = StringBuild.toString();
		return result;
	}

	public static void main(String[] args) {
		String data = ex2.addSpaceBeforeUppercase("verifyProfileIconDisplayed");
		System.out.println(data);
	}

}
