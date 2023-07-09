package BankProject;

import java.util.Scanner;
public class BankProject {
	    private double balance;

	    public BankProject() {
	        balance = 0.0;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposit successful. New balance: " + balance);
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: " + balance);
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    public void checkBalance() {
	        System.out.println("Current balance: " + balance);
	    }

	    public static void main(String[] args) {
	        BankProject bank = new BankProject();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Bank Menu");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    bank.deposit(depositAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    bank.withdraw(withdrawAmount);
	                    break;
	                case 3:
	                    bank.checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	            System.out.println();
	        } while (choice != 4);

	        scanner.close();
	    }
	}
