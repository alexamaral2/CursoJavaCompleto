package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();

		List<Employee> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			List<String> emails = list.stream().filter(e -> e.getSalary() > salary)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());

			emails.forEach(System.out::println);

			double avg = list.stream().filter(p -> p.getName().startsWith("M")).mapToDouble(Employee::getSalary).sum();

			System.out.println("The average salary of employees whose name starts with 'T' is: " + avg);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
