package day_03;

public class CheckString {
	
	static boolean result=true;
	
    public static void main(String[] args) {
    	/* 
         * write a return method that check if a string is build out of the same letters
         * as another string (Without case sensitivity)
         * 
         * Eg: input : “abc” and check String: “cab” returns true 
         * Input :"Istanbul1453" Check String : "abcdefghijklmnopqrstuwyz1234567890!@#$%^&*()_+-/"
         * output :false
         */
        
        String input = "abc";
        String checkString = "cab";
        
        checkStringMethod(input,checkString );
        System.out.println("result is : " + result);
        
    }
    
    public static boolean checkStringMethod(String input, String checkString) {
        
        for (int i = 0; i < input.length(); i++) {
            
            if (!checkString.contains(input.toLowerCase().substring(i, i+1))) {
                result=false;
            }
            
        }
        
        return result;
    }


}
