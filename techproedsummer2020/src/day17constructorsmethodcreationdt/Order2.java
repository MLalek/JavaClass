package day17constructorsmethodcreationdt;

public class Order2 {	
	int a;
    int b;

   Order2 (int a, int b) { 
          this.a = a;
          this.b = b;
    }

   Order2() {
   }

	public static void main(String[] args) {
		Order2 or = new Order2 (3, 5); //8
        //or = new Order2 ();//0  bu son bos olan degeri verir ve 0 olur  

       System.out.println(or.a + or.b);

	}

}
