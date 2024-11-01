package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Rent[] vect = new Rent[10];

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d%n", i);
			System.out.printf("Name: ");
			String name = sc.nextLine();

			System.out.printf("Email: ");
			String email = sc.nextLine();

			System.out.printf("Room: ");
			int roomNumber = sc.nextInt();

			vect[roomNumber] = new Rent(name, email);
		}

		System.out.println("Bussy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
		}

		sc.close();
	}

}
