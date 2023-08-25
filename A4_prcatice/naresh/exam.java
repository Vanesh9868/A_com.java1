package naresh;

class parent{
	
	void m1() {
		System.out.println("m1");
	}
}

class child extends parent{
	void m1() {
		System.out.println("m2");
	}
}

public class exam {

	public static void main(String[] args) {
		
		child c = new child();

		parent p = (parent)c;
		p.m1();
		
		byte a=5;
		short b=9;
		
		int x=a+b;
		

//		int a= 5;
//		char b=(char) a;
//		
//		System.out.println(b);
		
		
	}

}
