package entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;

	public Individual(String name, Double anuallncome, double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if (super.getAnuallncome() < 2000.00) {
			return super.getAnuallncome() * 0.15 - healthExpenditures * 0.5;
		} else {
			return super.getAnuallncome() * 0.25 - healthExpenditures * 0.5;
		}

	}

}
