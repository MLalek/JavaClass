package day04;

public class FindingPalindrome {

	public static void main(String[] args) {

//		Create a string variable
//		 If the string is palindrome then print “Palindrome”
//		 If the string is not palindrome then print “Not Palindrome” 1234321
//		abcba
//		"Able was I ere I saw Elba”
//		 A string is palindrome if reversed is equal to the string

		
		String original="Able was I ere I saw Elba";
		//     lenght:25 LAST INDEX:24
		String reversed="";
		//FIRST FIND THE REVERSED
		for(int i=original.length()-1;i>=0;i--) {
			reversed+=original.charAt(i);
		}
		System.out.println(reversed);
		System.out.println(original);
		///CHECKING IF IT IS PALINDROME OR NOT
		if(original.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	
		
		//Create a string : name and assign a 3 word sentences
		//if name is one or two words print “enter 3 words sentences”
		//otherwise reverse the order of the words
		//e.g: I love java ==> java love I 
				String name = "I love Java";//IloveJava 11-9 =2 spaces
				// check if there are 3 words. There must be 2 paces.
				int firstSpace = name.indexOf(" ");// 1 //This will give the first one
				
				int secondSpace = name.indexOf(" ", firstSpace + 1);
			
				String firstWord=name.substring(0,firstSpace);
				System.out.println(firstWord);
				String secondWord=name.substring(firstSpace+1,secondSpace);
				System.out.println(secondWord);
				String lastWord=name.substring(secondSpace+1);
				System.out.println(lastWord);
				if (firstSpace != -1 && secondSpace != -1) {// indexof returns-1 when there is no space
					System.out.println(lastWord+" "+secondWord+" "+firstWord);
					
				}		
	}

}
