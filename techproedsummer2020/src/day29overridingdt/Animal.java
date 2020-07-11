package day29overridingdt;

public class Animal {
	
	public static void main(String[] args) {
		
	}
	
	public void sound() {
		System.out.println("Animals make sound");
	}
	
	public void eat() {//overridden method the name which in parent 
		System.out.println("Eat all");
	}
	
	//In the following method; return type is Animal. We can use class names as return type in methods.
	//When you use return type different from "void" you have to use return keyword.
	//After the "return" keyword you must type sth whose data type is matching with the return type of the method.
	//To create an object we use "new" keyword and "constructor" but sometimes Java gives us different
	//ways to create ab object from a class like String str = "Ali";
	
	public Animal drink() {
		return new Animal(); // for new object use "new + String" 
	}
	
	public int add() {
		return 4;
	}
	
	//If a method is "final" it means you cannot update its body
	public final void product() {
		System.out.println("Multiplication");
	}
	
	
	//Java does not allow to override static methods because
	//static methods are shared by all objects so 1) no need to override
	//2)if a class updates the body it will affect all other classes this can
	//cause some problems	
	public static void division() {
		System.out.println("Division");
		}
	
	//You cannot access to private methods from other classes so you 
	//cannot override private methods.
	private void m1() {
		System.out.println("Method one");
	}
	
	void m2() {
		System.out.println("Method 2");
	}
	
	/*
	 The return type of overriding methods (methods inside the child class) must be 
	 1)same with the return type of overridden (methods inside the parent class) methods.
	 2) the child of the return type of overridden(methods inside the parent class) methods
	 */
	/*
    If the return type of overridden method is primitive then
	 the return type of overriding method must be same with the
	 return type of overridden method. Because there must be 
	 "IS-A" relationship between the return type in overriding
	 and "IS-A" relationship can be between the classes but primitives
	 are not classes so we cannot talk about "IS-A" relationship between 
	 primitives.
	 */
	
	/*
	 The overriding methods(methods inside the child class) cannot use 
	 more restricted access modifiers than overridden(methods inside the parent class) methods.
	 The access modifiers of overriding methods can be same with or wider than overridden methods.
	 For example; if overridden method's access modifier is "default" then overridingn method's access modifier 
	 can be "default", "protected", and "public"
	 */
	
	//Animal icerisinde kullanilan access modifier la child ayni veya daha genis olmali
	//eger parent default sa child default - protected veya public olabilir
	//eger parent protechted sa child  protechted ve public olabilir 

}
