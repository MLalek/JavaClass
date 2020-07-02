package day24varargsaccessmodifiersstringbuilderdt;

public class A {

	private int x = 12;
	int y = 13; // y is a default access modifier. To make something default do not type any
				// access modifier.

	public static void main(String[] args) {

		A obj1 = new A();
		System.out.println(obj1.x);
	}

}
