package a1_GreaterThan_LessThan;

public class a4_smaller_of_3 {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int c=30;
		int d=5;
		
		if (a<b && b<c && c<d)
		{
			System.out.println("a is smaller");
		}
		else if (b<a && b<c && b<d)
		{
			System.out.println("b is smaller");
		}
		else if (c<a && c<b && c<d )
		{
			System.out.println("c is smaller");
		}
		else 
		{
			System.out.println("d is smaller");
		}
		
		
		
	}

}
