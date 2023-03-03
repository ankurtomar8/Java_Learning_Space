 // WAP to print following Pattern
 //  *  *  *  *  *  * 
 //  *  *  *  *  *  * 
 //  *  *  *  *  *  * 
 //  *  *  *  *  *  * 
 //  *  *  *  *  *  * 
 //  *  *  *  *  *  * 
 //   n = 5


import java.util.*;
class Main{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for (int row = 1 ; row <= n ; row++){  // row changer
        for(int col = 1 ; col <=n ; col++){ // column changer
            System.out.print(" * ");

    
        }
        System.out.println("");
    }


}
}