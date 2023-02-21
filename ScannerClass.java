import java.util.Scanner;

class ScannerClass{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");

		String name = sc.nextLine();
		System.out.println("Username is : "+name);
	}
}