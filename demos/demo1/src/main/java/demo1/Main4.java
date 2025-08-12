package demo1;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int choice = 0;
		int n1=0, n2=0;
		int ans = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number 1:");
			n1 = sc.nextInt();
			System.out.println("Enter number 2:");
			n2 = sc.nextInt();
			ans = n1 + n2;
			System.out.println("Result: "+ans);
			System.out.println("Do you wish to repeat ? (0=No) Press any other number to repeat");
			choice = sc.nextInt();
		}while(choice!=0);//Repeat if choice is NOT "0"
		
	}

}
