package _01BasicPrograms;

import java.util.Scanner;

public class _09DiscountStandard {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost:");
		int cost = sc.nextInt();
		
		System.out.println("Enter the Discount Percentage:");
		double discount = sc.nextDouble();
		
		double result = cost-(cost/discount);
		
		System.out.println(result);
	}

}
