package day29overridingdt;

public class Cat extends Animal {

	public static void main(String[] args) {
		
	}
	public void sound() {
		System.out.println("Cats meow");
	}
	@Override //Override in Source
	public void eat() {
		System.out.println("Eat cheese");
	}
	
	@Override
	//Animal bir return type bunu Animal dan aldik. 
	//Eger Cat yazarsak guncellemis oluyoruz ve Cat oluyor.
	public Cat drink() { 
		return new Cat();
	}
	@Override
	public int add() {		
		return 5;
	}
		
		//default methods can be accessed from other classes if 
		//you are "in the same package" so from the same package you can override
		//default methods. But if you are in a different package you cannot access
		//to the default methods because of that you cannot override
	
		//@Override
		void m2() {
		}
	
	//public and protected methods can be overridden without any issue 
	
	

}
