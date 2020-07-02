package day23passbyvaluedatedt;

public class Quiz { //3

		    public static void main(String[] args){ 

		        int x = 5; 

		        change(x); 

		        System.out.println(x); 

		    } 

		    public static void change(int x){ 

		        x = 20; 

		    } 
		    
		    
		    class Test{ 

		        int x; 

		        Test(int i) { x = i; } 

		        Test()      { x = 0; } 

		    } 

		      

//		    class A{ 
//
//		        public static void main(String[] args){ 
//
//		            Test t = new Test(5);  
//
//		            change(t); 
//
//		            System.out.println(t.x); 
//
//		        } 
//
//		        public static void change(Test t){ 
//
//		            t = new Test(); 
//
//		            t.x = 10; 
//					}
//		        } 

//		    class Test{ 
//
//		        int x; 
//
//		        Test(int i) { x = i; } 
//
//		        Test()      { x = 0; } 
//
//		    } 
//
//		      
//
//		    class A{ 
//
//		        public static void main(String[] args){ 
//
//		            Test t = new Test(5);  
//
//		            change(t); 
//
//		            System.out.println(t.x); 
//
//		        } 
//
//		        public static void change(Test t){ 
//
//		            t.x = 10; 
//
//		        } 
//
//		    } 
		     
		    
//		    for(int i=1; i<4; i++) {
//
//				for(int k=3; k>1; k--) {
//
//					System.out.println(i + "==>" + k);
//
//				}

	}
		    
		    
		    



