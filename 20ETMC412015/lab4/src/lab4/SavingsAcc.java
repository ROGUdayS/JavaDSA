package lab4;
public class SavingsAcc{
	public static double annualInterestRate;
	private double savingsBalance;
	public void SavingsAccount() {
		annualInterestRate=5;
		savingsBalance=0.0;
	}
	public void SavingsAccount(double intRate, double savBal) {
		annualInterestRate=intRate;
		savingsBalance=savBal;
	}
	public double calculteMonthlyInterest() {
		double intRate=(savingsBalance*annualInterestRate/12);
		savingsBalance=savingsBalance+intRate;
		return intRate;
	}
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate=newInterestRate;
	}
	public void setSavingsBalance(double newBal) {
		savingsBalance=newBal;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

}