package lab4;

public class SavingsAcc_Test{
	public static void main(String[] args) {
		SavingsAcc ac1=new SavingsAcc();
		SavingsAcc ac2=new SavingsAcc();
		ac1.setSavingsBalance(2000.00);
		ac2.setSavingsBalance(3000.00);
		SavingsAcc.modifyInterestRate(6);
		ac1.calculteMonthlyInterest();
		ac2.calculteMonthlyInterest();
		System.out.printf("The new Balance for Saver 1 =%f\n",ac1.getSavingsBalance());
		System.out.printf("The new Balance for Saver 2 =%f\n",ac2.getSavingsBalance());
		
		SavingsAcc.modifyInterestRate(6);
		ac1.calculteMonthlyInterest();
		ac2.calculteMonthlyInterest();
		System.out.printf("The new Balance for Saver 1 =%f\n",ac1.getSavingsBalance());
		System.out.printf("The new Balance for Saver 2 =%f\n",ac2.getSavingsBalance());
	}
}