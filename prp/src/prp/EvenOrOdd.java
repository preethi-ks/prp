package prp;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println((n%2==0)?"EVEN":"ODD");
	}
}
