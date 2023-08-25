package Dayz_19;

public class ex3 {
	public static void getUserData(String data) {
		StringBuilder UserName = new StringBuilder();
		StringBuilder Age = new StringBuilder();
		for (int i = 1; i < data.length(); i++) {
			char dataCharcter = data.charAt(i);
			if (Character.isDigit(dataCharcter) == false) {
				UserName.append(dataCharcter);
			}
			if (Character.isDigit(dataCharcter) == true) {
				Age.append(dataCharcter);
			}
		}
		char Gender = data.charAt(0);
		System.out.println("Gender   : " + Gender);
		System.out.println("UserName : " + UserName);
		System.out.println("Age      : " + Age);
	}

	public static void main(String[] args) {
		ex3.getUserData("MyogeshShinde27");
		System.out.println("*****************************");
		ex3.getUserData("GHimaDasl80");
		System.out.println("*****************************");
		ex3.getUserData("MArjitSingh45");
		System.out.println("*****************************");
		ex3.getUserData("GAmruta120");
	}

}
