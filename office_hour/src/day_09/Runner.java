package day_09;

public class Runner {

	public static void main(String[] args) {
		
		CarSeller car1 = new CarSeller ("Opel", "Astra", 2000, 120000, "white", 5000);
		//car1.carPrinter(car1);
		CarSeller.carFeatures(car1);
	}

}
