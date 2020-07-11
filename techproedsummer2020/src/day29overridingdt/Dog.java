package day29overridingdt;

public class Dog extends Animal {

	public static void main(String[] args) {
		
	}
	
	public void sound() {
		System.out.println("Dogs bark");
	}

	@Override // Override annotation 
	//bize hata olup olmadigini gosterir extends(uzanti) 
	// baglantisinin saglikli olup olmadigini gosterir
	
	public void eat() { //its name is overriding method in child 
		System.out.println("Eat meat"); 
	}
	
	
	
	
}
