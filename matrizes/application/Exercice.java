package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many lines: ");
		int n = sc.nextInt();
		System.out.print("How many coluns: ");
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		System.out.println();
		
		for(int i=0; i<mat.length; i++) {
			System.out.printf("Enter the %d number(s) of line #%d:", m, i);
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println();
		System.out.print("Enter the number to search: ");
		int number = sc.nextInt();
		
		boolean found = false;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == number){
					found = true;
					System.out.println();
					System.out.printf("Position: %d, %d", i, j);
					System.out.println();
					if (j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
					System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[1].length-1) {
					System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
					System.out.println("Down: " + mat[i+1][j]);
					}	
				}
			}
		}
		
		if (found == false) {
			System.out.println("Number not found!");
		}
		
		
		sc.close();

	}

}
