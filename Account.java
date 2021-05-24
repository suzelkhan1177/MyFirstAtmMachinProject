package AtmMachineProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double checkBalance =0;
	private double savingBalance =0;
	
	Scanner input = new  Scanner(System.in);
	
	DecimalFormat moneyFormat = new DecimalFormat(" '$' , ###, ##0.00 ");
	
	
    // Equal Methord Define
     public int setCustomerNumber(int customerNumber) {
    	 this.customerNumber = customerNumber;
    	 return customerNumber;
     }
     
     public int getCustomerNumber() {
    	 return customerNumber;
     }
     
     public int setPinNumber(int pinNumber) {
    	 this.pinNumber = pinNumber;
    	 return pinNumber;
     }
     
     public int getPinNumber() {
    	return pinNumber;
     }
     
     public double getCheakBalance() {
    	 return checkBalance;
     }
     
     public double getSavingBalance() {
    	 return savingBalance;
     }
     
     public double calcCheckingCredit(double amount) {
    	 checkBalance = (checkBalance - amount);
    	 return checkBalance;
     }
     
     public double calcSavingCredit(double amount) {
    	 savingBalance = (savingBalance - amount);
    	 return savingBalance;
     }
     
     public double calcCheckingDeposit(double amount) {
    	 checkBalance = (checkBalance + amount);
    	 return checkBalance;
     }
     
     public double calcSavingDeposit(double amount) {
    	 savingBalance = (savingBalance = amount);
    	 return savingBalance;
     }
     
     public void getCheckingCreditInput() {
    	 System.out.println("Cheaking Acount Balance: " + moneyFormat.format(checkBalance));
    	 System.out.print("Amount you want to Withdraw from Cheaking Account: ");
    	 double amount = input.nextDouble();
    	 
    	 if((checkBalance - amount) >= 0) {
    		 calcCheckingCredit(amount);
    		 System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkBalance));
    	 }else {
    		 System.out.println("Balance Cannot Be Negative"  + "\n");
    	 }
    	 
     }
     
     public void getSavingCreditInput() {
    	 System.out.println("Saving Acount Balance: "+ moneyFormat.format(savingBalance));
    	 System.out.print("Amount you want to Withdraw from Saving Account: ");
    	 double amount = input.nextDouble();
    	 
    	 if((savingBalance -amount) >= 0) {
    		 calcSavingCredit(amount);
    		 System.out.println("New Saving Account Balance: "+ moneyFormat.format(savingBalance));
    	
    	 }
     }
     
     
     public void getCheckingDepositInput() {
    	 System.out.println("Cheaking Acount Balance: " + moneyFormat.format(checkBalance));
    	 System.out.print("Amount you want to  Credit from Cheaking Account: ");
    	 double amount = input.nextDouble();
    	 
    	 if((checkBalance + amount) >= 0) {
    		 calcCheckingDeposit(amount);
    		 System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkBalance));
    	 }else {
    		 System.out.println("Balance Cannot Be Negative"  + "\n");
    	 }
    	 
     }
     
     public void getSavingDepositInput() {
    	 System.out.println("Saving Acount Balance: "+ moneyFormat.format(savingBalance));
    	 System.out.print("Amount you want to Credit from Saving Account: ");
    	 double amount = input.nextDouble();
    	 
    	 if((savingBalance +amount) >= 0) {
    		 calcSavingDeposit(amount);
    		 System.out.println("New Saving Account Balance: "+ moneyFormat.format(savingBalance));
    	
    	 }
     }

}
