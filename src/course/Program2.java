package course;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	
	public static double area(double a, double b, double c) {
		double p = (a+b+c)/2;
		double A = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return A;
		
	}
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the measures of triangle X: ");
		double Xa = sc.nextDouble();
		double Xb = sc.nextDouble();
		double Xc = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		double Ya = sc.nextDouble();
		double Yb = sc.nextDouble();
		double Yc = sc.nextDouble();
		
		double AX = area(Xa, Xb, Xc);
		double AY = area(Ya, Yb, Yc);
		
		char large;
		
		if (AX > AY) {
			large = 'X';
		}
		else {
			large = 'Y';
		}
		
		System.out.printf("Triangle X area: %.4f%n", AX);
		System.out.printf("Triangle Y area: %.4f%n", AY);
		System.out.println("Larger area: "+ large);
	
		
		sc.close();

	}

}
