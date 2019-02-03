package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + funcionario);
		
		System.out.println();
		System.out.print("Wich percentage to increse salary: ");
		double percent = sc.nextDouble();
		funcionario.increaseSalary(percent);
		
		System.out.println();
		System.out.println("Updated data: " + funcionario);
		
		
		sc.close();

	}

}
