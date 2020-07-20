package day_07;

public class MyCar extends Vehicle {
	
	 //Vehicle = Parent of MyCar class. MyCar is child class
    //Why do we need inheritance in Java?
    //Reusability: Whatever inside Vehicle is inside MyCar
    //Attention: We cannot reach the objects in the child class using the parent class

	
	int maxSpeed;
	public void doUber() {
		System.out.println("Doing Uber after java classes");
	}

	public static void main(String[] args) {
		MyCar myCar= new MyCar();
		myCar.maxSpeed=120;
		System.out.println("Max Speed: "+myCar.maxSpeed);
		myCar.doUber();
		myCar.model="Honda Accord";
		myCar.year=2004;
		myCar.mileage=130000;
		System.out.println("Max Speed: "+myCar.maxSpeed+
				"\nMy Car Model: "+myCar.model+
				"\nMy Car Year: "+myCar.year+
				"\nMyCar Mileage: "+myCar.mileage);
	}

}
