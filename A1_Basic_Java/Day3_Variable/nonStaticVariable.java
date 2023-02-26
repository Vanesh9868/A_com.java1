package Day3_Variable;

public class nonStaticVariable{

	
	int k =200;
	int l =300;
	int m =400;
	int n =500;


	public static void main(String[] args) {


		nonStaticVariable ref = new nonStaticVariable ();
	
		System.out.println(ref.k);
		System.out.println(ref.l);
		System.out.println(ref.m);
		System.out.println(ref.n);
		
	}

}
