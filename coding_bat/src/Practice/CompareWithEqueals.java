package Practice;

public class CompareWithEqueals {

	public static void main(String[] args) {
		
/* 
 * length 3'e esit veya buyuk olursa ilk 3 element icerisinde
   not varsa yazdir yoksa not kelimesini ekle
 Given a string, return a new string where "not " has been added to the front. 
 However, if the string already begins with "not", return the string unchanged. 
 Note: use .equals() to compare 2 strings.
 */
		
		
		String str= "notbad da dad fesrt";
		
		if(str.length() >= 3 && str.substring(0,3).equals("not")) { // length 3'e esit veya buyuk olursa ilk 3 element icerisinde
																	// not varsa yazdirir. Sunlari yazdirir: 
																	//not
																	//notHdm
																	//not bad
			System.out.println(str);
		}else {
			System.out.println("not "+str); // yoksa bosluk birakarak not + str yazdir
		}

	}

}
