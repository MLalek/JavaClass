package day04;

public class OCAType02 {

	public static void main(String[] args) {
		
		 String str = "M ";      //M
		 str = str.concat("E "); //M E
		 String add = "S ";      //M E  
		 str = str.concat(add);  //M E S
		 str.replace("S", "T");  //M E S // burada str= diyerek str ye yeni degerini vermiyor, Bir sey degistirmiyor
		 str = str.replace("S", "T"); //M E T 
		 str = str.concat(add);   //M E T S Burada S "add" den aliyor 
		 System.out.println(str); // str=M E S 
		 

	}

}
