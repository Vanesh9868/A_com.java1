package Dayz18_String;

public class subString2 {

	public static void main(String[] args) {

		String a = "https://website.docquity.com/#/cme/detail/1730";

		String b[] = a.split("detail/");
		System.out.println(b[0]);
		System.out.println(b[1]);

	}

}
