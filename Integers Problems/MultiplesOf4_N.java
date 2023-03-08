//Take an integer N as input. Print multiples of 4 till N.


import java.util.*;


class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for( int i = 1 ; i <= n ; i++)
        {
            if (i % 4 == 0){
              System.out.println("Multiple of 4  : "+i);
            }

        }
    }
}
