package a2_Even_Odd;

public class a6_Even_and_odd_number_1_100 {

	public static void main(String[] args) {

	    int a =100;
		
		for (int i=2; i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i);
				System.out.println(" = even number");
			}
			
		}
		
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");

		
		for (int b =2; b<=100;b++)
		{
			if(b%2!=0)
			{
				System.out.print(b);
				System.out.println(" = odd number");
			}
			
			
		}
		
		
}

}
