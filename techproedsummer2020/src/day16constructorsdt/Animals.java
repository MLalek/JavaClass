package day16constructorsdt;

public class Animals {
	
	int height=50;
	String name = "Rabbit";
	boolean mammal = true;
	
	Animals(){
		
	}
	
	Animals(String name, boolean mammal, int height ){
		this.name=name;
		this.mammal=mammal;
		this.height=height;
	}

	public static void main(String[] args) {
		/*
		 Create 2 constructors one is with parameters, the other one is without
		 parameters
		 By using that constructor create at least 2 object then print their features
		 */
		
		Animals your = new Animals();
		System.out.println(your.name);
		System.out.println(your.mammal);
		System.out.println(your.height);
		System.out.println("===========");
		Animals my = new Animals("Chicken", false, 40);
		System.out.println(my.name);
		System.out.println(my.mammal);
		System.out.println(my.height);
		
	}

}
