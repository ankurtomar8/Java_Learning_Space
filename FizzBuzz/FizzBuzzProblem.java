//WAP that takes in a N as input and does following:
// if N is a multiple of 3 , print Fizz
// if N is a multiple of 5 , print Buzz
// if N is multiple of both 3 and 5, print FizzBuzz
//  
import java.util.*;

class Main {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
   		
	if (s%3 == 0 && s%5 == 0){
			
			System.out.println(" FizzBuzz");
	}
	
	else if(s%5 == 0){
			
			System.out.println("  Buzz ");
	}
	
	else if (s%3 == 0){   //   if (s%3 == 0 && s%5 == 0) // check order otherwise fail for 15
			System.out.println("  Fizz ");
	} 
	
	}
}

