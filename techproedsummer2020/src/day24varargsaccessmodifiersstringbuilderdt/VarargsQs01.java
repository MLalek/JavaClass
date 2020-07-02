package day24varargsaccessmodifiersstringbuilderdt;

public class VarargsQs01 {

	public static void main(String[] args) {
		// What is the result of the following code?
		
		String a ="";
		a+=2;
		a+='c';
		a+=false;
		
		if(a=="2cfalse") {
			System.out.println("==");
		}if(a.equals("2cfalse")) {
			System.out.println("equals");
		}
		

	}

}
