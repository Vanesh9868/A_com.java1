package Day6_object;

public class child {

	static parent p = new parent();

	void c1() {
		p.m1();
	}

	void c2() {
		p.m2();
	}

	void c3() {
		p.m3();
	}

	public static void main(String[] args) {

		child x = new child();
		x.c1();
		x.c2();
		x.c3();
		p.m1();
		p.m2();
		p.m3();

		
	}

}
