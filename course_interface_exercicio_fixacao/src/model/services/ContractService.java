package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double baseInstallment = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			LocalDate datePayment = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(baseInstallment, i);
			double finalAmount = onlinePaymentService.payment(interest);

			contract.getList().add(new Installment(datePayment, finalAmount));
		}

	}
}
