
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     for(int i=1; i<=100; i++){
             
             
             if (i%3 == 0) {
            	 System.out.println("Fizz");
            	 if (i%3 ==0 && i%5 == 0) {
            	 System.out.println("FizzBuzz");
            	 }
            	 if (i%9 == 0){
            		 System.out.println("Fizzy");
            	 }
             }
             else if (i%5 == 0) {
            	 System.out.println("Buzz");
            	 if (i%20 ==0) {
            		 System.out.println("Buzzy");
            	 }
             
            } 
            
             else {
            	 System.out.println("Count is: " + i);
             }
	}
}
}