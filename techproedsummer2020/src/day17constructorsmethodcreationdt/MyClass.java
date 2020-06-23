package day17constructorsmethodcreationdt;

public class MyClass {
	
		int num1;
		static String name = "Ali";
		
		MyClass(String a, int n){
		char letter = 'c';
		System.out.println(letter);
		
		}
		MyClass(int num1){
		this("sasa", 5);
		this.num1 = num1;
		System.out.println(num1);
		}
		MyClass(String num){
		num1++;
		System.out.println(num);
		
		
		}
		
		
	public static void main(String[] args) {
		MyClass a = new MyClass(10);
		System.out.println(a);
		
	}
	
	
}

