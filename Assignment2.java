import java.util.Scanner;

public class Assignment2 {
	public static void main (String [] args) {
		int n1,n2,n3,n4,n5;
		int sum,average;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter five number for sum and average.");
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		n3 = keyboard.nextInt();
		n4 = keyboard.nextInt();
		n5 = keyboard.nextInt();

		sum = n1+n2+n3+n4+n5;
		average = sum/5;

		System.out.println("sume is " + sum + " and average is " + average + ".");

	}
}
		
