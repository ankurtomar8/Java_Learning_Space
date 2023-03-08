// Take an integer N as input. Print odd integers from N to 1 using loop.

import java.util.*;


class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for( int i = n ; i >=0 ; i--)
        {
            if (i % 2 != 0){
              System.out.println("Odd number : "+i);
            }

        }
    }
}
