// WAP to print following pattern problem  01
//  *  *  *  *  * 
//  *  *  *  *  * 
//  *  *  *  *  * 
//  *  *  *  *  * 
//  *  *  *  *  * 
import java.util.*;

class Main {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
   	
	   for (int row = 1 ; row <= s ; row++){
		   
		      for (int col = 1  ; col <= s ; col++)
			  {
		   System.out.print(" * ");
		   
		   for (int space = 1  ; space <= row ; space++)
		   {
		   System.out.print("");
	 	   }
		   
	   }
	   
	   System.out.println(); // row
	   }
	    
	
	}
}

