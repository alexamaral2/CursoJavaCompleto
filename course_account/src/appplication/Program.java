package appplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double amount = 0.0;
		Account account;

		System.out.println("Enter account number:");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter account holder:");
		String holder = sc.nextLine();

		System.out.println("Is there na initial deposit (y/n)? ");
		char isInitialDeposit = sc.next().charAt(0);

		if (isInitialDeposit == 'y') {
			System.out.println("Enter initial deposit value:");
			amount = sc.nextDouble();
			account = new Account(number, holder, amount);
		} else {
			account = new Account(number, holder);
		}
		System.out.println("Account data:");
		System.out.println(account.toString());

		System.out.print("Enter deposit value: ");
		amount = sc.nextDouble();
		account.deposit(amount);

		System.out.println("Updated account data:");
		System.out.println(account.toString());

		System.out.print("Enter withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);

		System.out.println("Updated account data:");
		System.out.println(account.toString());

		sc.close();
	}

}
