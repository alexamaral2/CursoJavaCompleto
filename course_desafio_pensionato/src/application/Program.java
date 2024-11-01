package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Rent[] rent = new Rent[10];

		for (int i = 0; i < rent.length; i++) {
			sc.nextLine();
			System.out.printf("Rent #%d%n", i + 1);
			System.out.printf("Name: ");
			String name = sc.nextLine();

			System.out.printf("Email: ");
			String email = sc.nextLine();

			System.out.printf("Room: ");
			int room = sc.nextInt();

			rent[room] = new Rent(name, email);
		}

		System.out.println("Bussy rooms:");
		for (int i = 0; i < rent.length; i++) {
			if (rent[i] != null) {
				System.out.println(i + ": " + rent[i].toString());
			}
		}

		sc.close();
	}

}
