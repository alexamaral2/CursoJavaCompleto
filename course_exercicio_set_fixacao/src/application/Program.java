package application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();

		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			courseA.add(sc.nextInt());
		}
	
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			courseB.add(sc.nextInt());
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			courseC.add(sc.nextInt());
		}

		Set<Integer> totalStudents = new HashSet<>(courseA);

		totalStudents.addAll(courseB);
		totalStudents.addAll(courseC);

		System.out.println("Total students: " + totalStudents.size());

		sc.close();
	}
}
