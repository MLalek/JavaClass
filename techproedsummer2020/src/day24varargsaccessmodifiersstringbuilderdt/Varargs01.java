package day24varargsaccessmodifiersstringbuilderdt;

public class Varargs01 {

	public static void main(String[] args) {
		/*
		 * Sometimes we need flexible number of parameters If you use varargs as a
		 * parameter in a method, your method runs for every number of arguments To
		 * create a varargs use "..." after the data type. The syntax is like "int... x"
		 * Varargs is actually an array because of that in varargs we use Array methods
		 * Varargs is like a bottomless pit, you can put infinitely many number of
		 * elements into it, there is no limit. If you want do not put any element into
		 * a varargs, it is fine because empty array is fine 
		 * 
		 * Note: length, collections (array and list) kullaniliyor 
		 * 
		 * Rule 1: If you use varargs in a method it must be the last parameter. 
		 * If you use varargs at the beginning or in the middle you will get 
		 * Compile Time Error Rule 2: If you use more than 1 varargs in a
		 * method as a parameter you will get Compile Time Error.
		 */
		add();// 0
		add(2);// 2
		add(2, 3);// 5
		add(2, 3, 4);// 9
		add(2, 3, 4, 5, 6, 7, 8, 9);// 44

		join('S', 'u', 'l', 'e', 'y', 'm', 'a', 'n');

		System.out.println();

		join('m', 'a', 'n');

	}

	public static void add(int... x) {
		int sum = 0;
		for (int w : x) {
			sum = sum + w;
		}
		System.out.println(sum);
	}

	/*
	 * Create a method The method will accept the characters and return the
	 * characters after joining The method should run for every number of characters
	 * For example; a, l, i ==> ali
	 */
	public static void join(char... c) {
		for (char w : c) {
			System.out.print(w);
		}
	}

//	test(1,2,3,4,5,);
//
//	public static void test(int...i, double k)// Is not possible to put varargs as a first argument 
//	}

	//test(1,2,3,4,5,);

	public static void test(int i, short j, double... k) {// varargs son da olmali ve birden fazla 
		System.out.println(i);//1
		System.out.println(j);//2
		System.out.println(k);//3 4 5
		
	}
	
	//num(A, b, c, d);
	//num()://CTE you shoul send a value for it
	//num(5)://5 String s e verilen deger ve method c.length i sordugu icin bu "0" olur 

	public static int num(String s, char...c) {
		return c.length;//3 olacak bcd harflarini sayiyor 
	}
	
	
	
}
