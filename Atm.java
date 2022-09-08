package atm;
import java.util.Scanner;

class atmm{
	private String accNumber;
	private String name;
	private String phNumber;
	private String email;
	private int pin;
	private double balance;
	
	public atmm(String accNumber, String name, String phNumber, String email, int pin, double balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.phNumber = phNumber;
		this.email = email;
		this.pin = pin;
		this.balance = balance;
	}
	
	public void balanceEnquiry() {
		System.out.println("Your current balance is = " + this.balance);
	}
	
	public void depositMoney(int balance) {
		this.balance += balance;
		System.out.println("Money deposited successfully.");
		System.out.println("Your current balance is = " + this.balance);
	}
	
	public void withdrawMoney(int balance) {
		if(this.balance - balance < 0) {
			System.out.println("Can't withdraw balance is low!!!");
		}
		else {
			this.balance-=balance;
			System.out.println("Money withdraw successful.");
			System.out.println("Your current balance is = " + this.balance);
		}
	}
	
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}

public class Atm {

	public static void main(String[] args) {
		
		atmm a = new atmm("2354789654", "Subhadip Mukherjee", "+91-8240290251", "babai.puja3@gmail.com", 3465, 0.0);
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Press 1 for balance enquiry");
			System.out.println("Press 2 for Deposit");
			System.out.println("Press 3 for Withdrawl");
			System.out.println("press 4 to exit");
			
			int ch = sc.nextInt();
			
			if(ch==1) {
				a.balanceEnquiry();
			}
			else if(ch==2) {
				System.out.println("Enter the amount to be deposited = ");
				int dep = sc.nextInt();
				a.depositMoney(dep);
			}
			else if(ch==3) {
				System.out.println("Enter the amount to be withdrawn = ");
				int wit = sc.nextInt();
				a.withdrawMoney(wit);
			}
			else if(ch==4) {
				System.out.println("Thank you for using us!!! Have a great day");
				break;
			}
			else {
				System.out.println("Wrong input!!!");
				break;
			}
		}
		sc.close();
	}

}

