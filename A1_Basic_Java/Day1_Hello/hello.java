package Day1_Hello;

public class hello {

	public static int a = 10;

	void m1() {
		System.out.println("m1");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");

		System.out.println(a);

		hello h = new hello();
		h.m1();
	}
}
