package Dayz12_String_methods;

public class o6_split_trim {

	public static void main(String[] args) {
		String product="Tomato - 1 Kg";
		String productR=product.split("-")[0].trim();
		
		System.out.println(product);
		System.out.println(productR);
	}

}
