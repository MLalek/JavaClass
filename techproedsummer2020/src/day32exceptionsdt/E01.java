package day32exceptionsdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
	//31. gune gidip textFile dosyasina gidip sag tiklayip proporities acilan pencerede path i kopyala
		/*
		 To handle a Compile Time Exception you have 2 options
		 						a) You can use "throws" keyword between ")" and"{"
		 						b) You can use "try-catch" block. This is better to use
		 */
	/*
	 If you use more than 1 catch block and if there is parent-child relationship between
	 exception classes you have to use child exception class first. Otherwise, you will get Compile Time Error
	 */

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		try {
		fis = new FileInputStream("src/day31exceptionsdt/TextFile");
		int i = 0;
		while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
			
		
		System.out.println(5/2);
		
		}catch (FileNotFoundException e) {
			System.out.println("The path is wrong or the file is not accessible");
		}catch(IOException e) {
			System.out.println("Rhe file is not okay to read or close");
		}catch(ArithmeticException e) {
			System.out.println("Do not divide by 0");
		}finally {
			fis.close();
			System.out.println("Done");
		}

	}

}
