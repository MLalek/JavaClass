package Practice;

public class First3Letter {

	public static void main(String[] args) {
		
		String str = "Chocolate";
		
		String front;
		
		if (str.length() >=3 ) {
			front = str.substring(0,3);
		}else {
			front = str;
		}
		System.out.println(front + front + front);

	}

}
