package day26encapsulationdt;

public class E02 {

	public static void main(String[] args) {
		E01 obj1 = new E01();
		System.out.println(obj1.retired);//false
		
		//Bu iki datayi E01 den gizli olmasina ragmen E01 de olusturdugumuz get method sayesinde
		//onlari cagirabildik.
		System.out.println(obj1.getName());//Suleyman Alptekin
		
			
		System.out.println(obj1.getSalary());//80000
		obj1.setSalary(90000);
		System.out.println(obj1.getSalary());
		
		//Create an object from E03 Class
		E03 obj2 = new E03();
		System.out.println(obj2.getDisease());
		System.out.println(obj2.isOld());//false
		
		
		
		
	}

}
