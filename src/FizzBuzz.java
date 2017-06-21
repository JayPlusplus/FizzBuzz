import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FizzBuzz upgrade version.
		// enter starting number and ending number.
		
		Scanner keyboard = new Scanner(System.in);
		int x,y;
		System.out.println("What is your starting number?");
		x = keyboard.nextInt();
		System.out.println("What is your ending number?");
		y = keyboard.nextInt();
		
	     for(int i=x; i<=y; i++){
             
             
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