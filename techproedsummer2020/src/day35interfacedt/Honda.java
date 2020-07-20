package day35interfacedt;

public class Honda implements Gas, AirCondition {
	/*
	 1)When you make a concrete class child of an interface 
	 use "implements" keyword instead of "extends"
	 2) In parent interfaces you can use variables whose names are same
	 When you call the variables you have to use interface names 
	 otherwise you will get CTE. 
	 */

	public static void main(String[] args) {
		Honda hondaCar = new Honda();
		hondaCar.seat();
		hondaCar.cold();
		hondaCar.refresh();
		hondaCar.power();
		hondaCar.speed();
		
		System.out.println("The Price with gas: "+Gas.price);//1
		System.out.println("The Price with engine: "+Engine.price);//3
		System.out.println("The Price with AirCo: "+AirCondition.price);//2
		
	}
	
	public void seat() {
		System.out.println("It has leather seats");
	}

	@Override
	public void cold() {
		System.out.println("It Colds well");
		
	}

	@Override
	public void refresh() {
		System.out.println("It Refreshs well");
		
	}

	@Override
	public void speed() {
		System.out.println("Very speed car");
		
	}

	@Override
	public void power() {
		System.out.println("It hs 215 horse-power");
		
	}

	@Override
	public void eco() {
		System.out.println("It is eco car");
		
	}

}
