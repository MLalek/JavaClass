package day36interfacesiteratorsdt;

public class Accounting implements  Employee  {

	
	public static void main(String[] args) {
		

	}

	
	@Override
	public void personelInfo() {

		
	}


	@Override
	public void task() {
		System.out.println("Automation Tester");
		
	}


	@Override
	public double sallary() {
		double task= 5000;
		double education = 500;
		double kids=200;
		double rate = 8000;
		double salary = task + education+ kids+ rate;
		return salary;
	}

}
