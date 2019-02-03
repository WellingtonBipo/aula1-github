package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class StudentsGrade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.next();
		System.out.print("First semester: ");
		student.firstGrade = sc.nextDouble();
		System.out.print("Second semester: ");
		student.secondGrade = sc.nextDouble();
		System.out.print("Third semester: ");
		student.thirdGrade = sc.nextDouble();
		
		System.out.printf("Final grade: " + "%.2f%n", student.finalGrade());
		
		if (student.finalGrade() > 60) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
			System.out.printf("Missing " + String.format("%.2f", student.missing()) + " points");
		}
		
		
		sc.close();

	}

}
