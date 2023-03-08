// Take an integer N as input. Print odd integers  from 1 to N using loop.

import java.util.*;


class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for( int i = 1 ; i <=n ; i++)
        {
            if (i % 2 != 0){
              System.out.println("Odd number : "+i);
            }

        }
    }
}
