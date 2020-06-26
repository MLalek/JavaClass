package day18statickeyworddt;

public class MyConstructor {
	
	int x =5;
	
	MyConstructor(){
		System.out.println("-x"+ x);
		//System.out.println(x);//5
	}
	MyConstructor(int x){
		this();//-x5 bu bos constructor da olan outputlarin hepsi demek ikinci syso da acik olsaydi 5 verecekti
		System.out.println("-x"+ x);
		//System.out.println(x); //4
	}	

	public static void main(String[] args) {
		MyConstructor mc1 = new MyConstructor(4);//-x4
		MyConstructor mc2 = new MyConstructor();//-x5

	}

}
