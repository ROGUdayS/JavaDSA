import java.util.*;
import java.lang.Math;

interface CentralBank{
	int minimumInterestRate=10;
	int minimumBalance=2000;
	int minimumWithdrawlimit=25000;
}
interface Customer{
	int customerNumber=987654321;
	String ifsc="NBD001";
	int accountNumber=12345678;
}
class Account implements CentralBank,Customer{
	void openAccount(String name,String adress,long phone) {}
	void closeAccount() {}
	void deposit(int dep) {}
	void withdraw(int wdraw) {}
	void balance() {}
}
class UNB extends Account implements CentralBank{
	String n,adr;
	long p;
	void openAccount(String name,String adress,long phone) {
		n=name;
		adr=adress;
		p=phone;
		System.out.println("Account Created!");
		System.out.println("Name : "+n);
		System.out.println("Address : "+adr);
		System.out.println("Phone No : "+p);
	}
	void closeAccount() {
		System.out.println("Account Closed!");
	}
	void deposit(int dep) {
		System.out.println("Deposited Amount : Rs."+dep);
	}
	void withdraw(int wdraw) {
		System.out.println("Withdrawn Amount : Rs."+wdraw);
	}
	void balance() {
		int min=2000,max=10000;
		int bal=(int)(Math.random()*(max-min+1)+min);
		System.out.println("Balance Amount : Rs."+bal);
	}
}
class NBD extends Account implements CentralBank{
	String n,adr;
	long p;
	void openAccount(String name,String adress,long phone) {
		n=name;
		adr=adress;
		p=phone;
		System.out.println("Account Created!");
		System.out.println("Name : "+n);
		System.out.println("Address : "+adr);
		System.out.println("Phone No : "+p);
	}
	void closeAccount() {
		System.out.println("Account Closed!");
	}
	void deposit(int dep) {
		System.out.println("Deposited Amount : Rs."+dep);
	}
	void withdraw(int wdraw) {
		System.out.println("Withdrawn Amount : Rs."+wdraw);
	}
	void balance() {
		int min=1000,max=10000;
		int bal=(int)(Math.random()*(max-min+1)+min);
		System.out.println("Balance Amount : Rs."+bal);
	}
}
class FGB extends Account implements CentralBank{
	String n,adr;
	long p;
	void openAccount(String name,String adress,long phone) {
		n=name;
		adr=adress;
		p=phone;
		System.out.println("Account Created!");
		System.out.println("Name : "+n);
		System.out.println("Address : "+adr);
		System.out.println("Phone No : "+p);
	}
	void closeAccount() {
		System.out.println("Account Closed!");
	}
	void deposit(int dep) {
		System.out.println("Deposited Amount : Rs."+dep);
	}
	void withdraw(int wdraw) {
		System.out.println("Withdrawn Amount : Rs."+wdraw);
	}
	void balance() {
		int min=1500,max=10000;
		int bal=(int)(Math.random()*(max-min+1)+min);
		System.out.println("Balance Amount : Rs."+bal);
	}
}
public class Banking {
	public static void main(String[]args) {
		Scanner a=new Scanner(System.in);
		String name,adress,close,CLOSE="yes";
		int DepositAmount,withdrawAmount;
		int bankId;
		long phone;
		Account b1=new UNB();
		Account b2=new NBD();
		Account b3=new FGB();
		int i=0;
		do {
			int input=0;
			System.out.println("-----------------------------------------------------");
			System.out.println("         Welcome To the Banking Application");
			System.out.println("-----------------------------------------------------");
			System.out.println("   Select your bank :");
			System.out.println("1. UNB");
			System.out.println("2. NBD");
			System.out.println("3. FGB");
			i=a.nextInt();
			int k=0;
			while(k==0) {
				System.out.println("-----------------------------------------------------");
				System.out.println("Banking Options :");
				System.out.println("-----------------------------------------------------");
				System.out.println("1. Open Account");
				System.out.println("2. Withdraw");
				System.out.println("3. Deposit");
				System.out.println("4. Balance");
				System.out.println("5. Close Account");
				System.out.println("6. Back to Bank options");
				input=a.nextInt();
				switch(input) {
				case 1:
					System.out.println("Enter Name :");
					name=a.next();
					System.out.println("Enter Address :");
					adress=a.next();
					System.out.println("Enter Phone Number :");
					phone=a.nextLong();
					if(i==1) {
						b1.openAccount(name,adress,phone);
					}
					else if(i==2){
						b2.openAccount(name,adress,phone);
					}
					else if(i==3){
						b3.openAccount(name,adress,phone);
					}
					break;
					
				case 2:
					System.out.println("Enter the Amount you would like to withdraw from your Account :");
					withdrawAmount=a.nextInt();
					if(i==1) {
						b1.withdraw(withdrawAmount);
					}
					else if(i==2){
						b2.withdraw(withdrawAmount);
					}
					else if(i==3){
						b3.withdraw(withdrawAmount);
					}
					break;
					
				case 3:
					System.out.println("Enter the Amount you would like to deposit into your Account :");
					DepositAmount=a.nextInt();
					if(i==1) {
						b1.deposit(DepositAmount);
					}
					else if(i==2){
						b2.deposit(DepositAmount);
					}
					else if(i==3){
						b3.deposit(DepositAmount);
					}
					break;
					
				case 4:
					System.out.println("Balance");
					if(i==1) {
						b1.balance();
					}
					else if(i==2){
						b2.balance();
					}
					else if(i==3){
						b3.balance();
					}
					break;
				case 5:
					System.out.println("Do you want to close Account :yes/no");
					close=a.next();
					if(close.equals(CLOSE)) {
						if(i==1) {
							b1.closeAccount();
						}
						else if(i==2){
							b2.closeAccount();
						}
						else if(i==3){
							b3.closeAccount();
						}
					}
					else {
						System.out.println("Account not closed!\nsTry Again");
					}
					break;
				case 6:
					k=1;
					break;
				}	
			}
		}while(i!=0);
	}
}

