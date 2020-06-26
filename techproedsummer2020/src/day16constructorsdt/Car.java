package day16constructorsdt;

public class Car {
	
	int price = 20000;
	int year = 2015;
	String make = "Honda";
	String type = "Civic";
	
	//Bu sekilde de tanimlanabilir ve degersiz bos constructor "Car()" da da hicbir deger cikmaz
//	int price;   
//	int year;
//	String make; 
//	String type; 
	
	//Create a condtructor without paramaters
	Car(){
		
	} //Note: Yukarida fiyat yil vs dolu olmz ise asgida bu Car() Class in constructorunda da degerler 
	//(fiyat vs olmaz) asagidaki gibi olur
	//0
	//0
	//null
	//null
	
	
	//Create a constructor with 1 parameter
	Car(int price){
		this.price = price;
	}
	
	//Create 2
	Car(String make, int price, int year, String type){
		this.price= price;
		this.make= make;
		this.type=type;
		this.year=year;
	}
	
	//Everything is in your class (should have copy) is displayed inside the instance	
	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println(c1.price);//20000
		System.out.println(c1.year); //2015
		System.out.println(c1.make);//Honda
		System.out.println(c1.type);//Civic
				System.out.println("------------");
		Car c2 = new Car(10000);
		System.out.println(c2.price);
		System.out.println(c2.make);
		System.out.println(c2.year);
		System.out.println(c2.type);
		
		System.out.println("-------------");
		
		Car c3 = new Car("Infinity", 24000, 2018,"Q50");
		System.out.println(c3.make);
		System.out.println(c3.price);
		System.out.println(c3.year);
		System.out.println(c3.type);
		
		
		
	}

}
