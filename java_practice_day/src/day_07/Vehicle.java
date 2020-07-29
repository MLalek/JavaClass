package day_07;
	/*
	 1. Create a class: Vehicle
	create public Variables and methods:
	String model;
	int year;
	int mileague;
	create a void method and print "Driving the car": drive
	create a void method oilChange and print "Changing the Oil"
	2. Create another class: MyCar and extend Vehicle
	create variables and methods: 
	int maxSpeed; 
	coid method doUber
	 */

public class Vehicle {
	
	public String model;
	public int year;
	public int mileage;
	
	public void drive() {
		System.out.println("Driving the car");
	}
	
	public void oilChange() {
		System.out.println("Changing the Oil");
	}
	
	

}
