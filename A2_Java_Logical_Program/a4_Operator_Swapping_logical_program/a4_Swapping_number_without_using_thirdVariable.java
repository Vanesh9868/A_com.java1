package a4_Operator_Swapping_logical_program;

public class a4_Swapping_number_without_using_thirdVariable {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		b=a+b-(a=b);	
	
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
	}

}

