// WAP to print integers from 1 to 10 using loop
// Take an integer N as 


import java.util.*;
class Main{
        public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    
    while(i<=n)
    {
        System.out.println("Number : " + i);
        i++;
    }
  }
}
