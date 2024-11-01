package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();

		Employee employee = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

		if (employee == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		}

		System.out.println("\nList of employees:");
		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}
}
