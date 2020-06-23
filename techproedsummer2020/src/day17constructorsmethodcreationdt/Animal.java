package day17constructorsmethodcreationdt;

public class Animal {
	
	int age = 7;
	String name = "Dog";//Default value Strings is "" or null
	boolean mammal;//Default value for booleans is false
	
	Animal(){
		this(false); //Constroctor call must be in the first line always
					//Do not use more then one constructor call inside a constructor
					//because when you use a second one call it cannot be
					//in the first line.When you do it you will get CTE(Comp.TimErr)
		System.out.println("No parameter");
	}
	
	Animal(boolean mammal){
			
		System.out.println("boolean");
	}
	
	Animal(int age, String name){
	
		System.out.println("int and String");
	}
	

	public static void main(String[] args) {
		Animal a1 = new Animal();

	}

}
