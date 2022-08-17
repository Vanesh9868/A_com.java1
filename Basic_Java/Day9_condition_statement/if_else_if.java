package Day9_condition_statement;

public class if_else_if {

	public static void main(String[] args) {

		int a=30;
		int b=10;
		int c=50;
		
		if      (a<b) {System.out.println("ok-1" + " = "+"a<b");}
		else if (b>a) {System.out.println("ok-2" + " = "+"b>a");}
		else if (a>b) {System.out.println("ok-3" + " = "+"a>b");}
		
		if      (b>c) {System.out.println("accept-1");}
		else if (b==c) {System.out.println("accept-2");}
		else if (c<b) {System.out.println("accept-3");}
		else if (c>b) {System.out.println("accept-4");}
		
	}

}
