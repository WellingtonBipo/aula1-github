package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double amount;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		Client client = new Client(numberAccount, name);
		
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			amount = sc.nextDouble();
			client.deposit(amount);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		client.deposit(amount);
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		client.withdraw(amount);
		System.out.println(client);
		
		sc.close();

	}

}
