package day_04;

public class Division {
	
	public static void main(String[] args) {
        /*
         * Interview Question :
         * 
         * 
         * write a return method that can divide two numbers without division operator
         * and prints quotient and remainder
         * 
         * Input : number= 44 and divisor=5 
         * Output : Quotient=8 Remainder=4
         */
        
        int input=44;
        int divisor=5;
        division(input,divisor);
        
        
    }
    
      public static void division(int input, int divisor) {
          int quotient =0;
          int remainder=input;
          
          while (remainder>divisor) {
        	 
            
            //remainder=remainder-divisor;
              remainder-=divisor;
            //System.out.println(remainder); // remainder 44 den 5 er duserek en son kalan 4
            //System.out.println(divisor); // 12345678
              quotient++;
              System.out.print(quotient);//8 
        }
         
          System.out.println("Quotient = " + quotient + " and remainder = "+ remainder);
      } 


}
