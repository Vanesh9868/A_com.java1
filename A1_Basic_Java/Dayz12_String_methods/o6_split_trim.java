package Dayz12_String_methods;

public class o6_split_trim {
	
	 public static String addSpaceBeforeUppercase(String input) {
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            if (i > 0 && Character.isUpperCase(currentChar)) {
	                result.append(" ");
	            }
	            result.append(currentChar);
	        }

	        return result.toString();
	    }

	public static void main(String[] args) {
		
		String ot=addSpaceBeforeUppercase("verifySearchIconDisplay");
		
		System.out.println(ot);
		
//		String product="Tomato - 1 Kg";
//		String productR=product.split("-")[0].trim();
//		
//		System.out.println(product);
//		System.out.println(productR);
//		
		String a= "verifySearchIconDisplay";
//		char b='V';
//		System.out.println("Char in upper : "+Character.isUpperCase(b));
//		
//		for (int i = 0; i < a.length(); i++) {
//			if(Character.isUpperCase(a.charAt(i))) {
//				char x=a.charAt(i);
//				
//				System.out.println(x);
//				String b[]=a.split(x);
//
//			}
//		}
//		
//		String b[]=a.split("S");
//		System.out.println(b[1]);
	}

}
