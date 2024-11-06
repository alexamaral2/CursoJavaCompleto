package entities;

public class Company extends TaxPayer {

	private Integer numberofEmployees;

	public Company(String name, Double anuallncome, Integer numberofEmployees) {
		super(name, anuallncome);
		this.numberofEmployees = numberofEmployees;
	}

	public Integer getNumberofEmployees() {
		return numberofEmployees;
	}

	public void setNumberofEmployees(Integer numberofEmployees) {
		this.numberofEmployees = numberofEmployees;
	}

	@Override
	public double tax() {
		if (numberofEmployees > 10) {
			return super.getAnuallncome() * 0.14;
		} else {
			return super.getAnuallncome() * 0.14;
		}
	}
}
