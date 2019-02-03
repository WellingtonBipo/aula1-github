package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rooms;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int quantity = sc.nextInt();
		
		
		Rooms[] room = new Rooms[10];
		
		for (int i=1 ; i <= quantity ; i++ ) {
			System.out.println();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int nRoom = sc.nextInt();
			room[nRoom] = new Rooms(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
			
		for (int i=1 ; i < 10 ; i++ ) {
			if (room[i] != null) {
			System.out.printf("%d: %s",i ,room[i]);
			System.out.println();
			}
		}
		
		sc.close();

}

}
