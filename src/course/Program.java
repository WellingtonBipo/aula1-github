package course;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the measures of triangle X: ");
		double Xa = sc.nextDouble();
		double Xb = sc.nextDouble();
		double Xc = sc.nextDouble();
		
		System.out.print("Enter the measures of triangle Y: ");
		double Ya = sc.nextDouble();
		double Yb = sc.nextDouble();
		double Yc = sc.nextDouble();
		
		double pX = (Xa+Xb+Xc)/2;
		double AX = Math.sqrt(pX*(pX-Xa)*(pX-Xb)*(pX-Xc));
		
		double pY = (Ya+Yb+Yc)/2;
		double AY = Math.sqrt(pY*(pY-Ya)*(pY-Yb)*(pY-Yc));

		System.out.printf("Triangle X area: %.4f%n", AX);
		System.out.printf("Triangle Y area: %.4f%n", AY);

		sc.close();

	}
}
