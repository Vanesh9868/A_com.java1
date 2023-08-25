package constructor_use;

public class hello extends Base {

//	static t1 x;
//	static t2 y;
//	static t3 z;
//
//	hello() {
//		x = new t1();
//		y = new t2();
//		z = new t3();
//	}

	void test1() {
		x.m1();
		y.m2();
		z.m3();
	}

	void test2() {
		x.m1();
		y.m2();
		z.m3();
	}

	void test3() {

		x.m1();
		y.m2();
		z.m3();
	}

	public static void main(String[] a) {

		hello obj = new hello();

		obj.test1();
		obj.test2();
		obj.test3();
	}
}
