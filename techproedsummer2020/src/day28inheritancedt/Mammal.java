package day28inheritancedt;

public class Mammal extends Animal{
	
	public Mammal() {
		super("Johnny"); //Bu constructor dan Animal a gidip oradan String e ("Johny" string) ulasiyor
						 //If you try to use non-existing constructor for super(int)  you will get CTE
		System.out.println("M");
	}
	
	public Mammal (String name) {
		super();// Without a parameters here we get A because Animal class give us A
				//Without superb also gives us A it comes parent child relationship gives us that automaticly
		System.out.println("M with P");
	}
	/*
	 If you try to use non-existing constructor you will get 
	 Compile Time Error
	*/

	public static void main(String[] args) {
		Mammal mammal = new Mammal();
		
	}
	

}
