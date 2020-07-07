package day24varargsaccessmodifiersstringbuilderdt;

public class Quiz {
//	
//	
//	public static void m3(String x, int... y) {
//
//		int p = 1;
//
//		for(int w: y) {
//
//			p = p * w;
//
//		}
//
//		System.out.print(x);
//
//		System.out.println(p);
//	}
//}


//	public class Test1 {
//
//		public static void main(String args[]) {
//
//			m1(10);
//
//			m1(11, 12, 13, 14);
//
//		}
//
//		static void m1(int... a) {
//
//			System.out.println("==> " + a.length);
//
//			for (int i : a) {
//
//				System.out.print(i + " "); 
//
//			}
//
//			System.out.println(); //==> 1  10  ==> 4  11 12 13 14 
//
//		}
//
//	} 

//4)
//A
//package pack1;	 
//
//public class A{ }
// 
//
//package pack2;	 
//
//public class B {
//
//	public static void main(String[] args) {
//
//		A obj = new A();
//
//	}
//
//}
//B)
//package pack1;	 
//
//public class A{ } 
//
//package pack2;	 
//
//class B {
//
//	public static void main(String[] args) {
//
//		A obj = new A();
//
//	}
//
//}
//C)
//package pack1;	 
//
//class A{ }
//
// 
//
//package pack2;	 
//
//class B {
//
//	public static void main(String[] args) {
//
//		A obj = new A();
//
//	}
//
//}
//D)
//package pack1;	 
//
//class A{ }
//
// 
//
//package pack2;	 
//
//public class B {
//
//	public static void main(String[] args) {
//
//A obj = new A();//
//	}
//}
//
//package pack1;
//
//public class Test3 {
//
//	protected int i = 12;
//
//	void m3() {
//
//		System.out.println(i); //12
//
//	}
//
//}
//
//
//
//package pack1;
//
//public class Test4 {
//
//	public static void main(String[] args) {
//
//		Test3 obj = new Test3();
//
//		System.out.println(obj.i);//12
//
//		obj.m3();
//}
	}


	
