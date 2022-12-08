package Day9_condition_statement;

public class a3_if_else_if {

	public static void main(String[] args) {

		int a=30;
		int b=10;
		int c=50;
		
		if(a<b) 
			{
				System.out.println("1st block");
			}
		else if (b>a) 
		{
			System.out.println("2nd block");
		}
		else if (a>b) 
		{
			System.out.println("3rd block");
		}
		else
		{
			System.out.println("else block");
		}
		
		
	}

}
