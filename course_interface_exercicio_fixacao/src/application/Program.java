package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");

        System.out.print("Numero: ");
        int number = sc.nextInt();

        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double amount = sc.nextDouble();

        System.out.print("Entre com o numero de parcelas:");
        int months = sc.nextInt();

        Contract contract = new Contract(number, date, amount);

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, months);
        
        for (Installment installment : contract.getList()) {
            System.out.println(
            		installment.getDueDate().format(fmt)  + " - " + String.format("%.2f", installment.getAmount()));
        }

        sc.close();
    }

}
