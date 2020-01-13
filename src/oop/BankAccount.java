package oop;

public class BankAccount implements IRate {
 

private static final String routingNumber = "12345";
private String name;
private String ssn;
private String accountType;
private String accountNumber;
private double balance;
 
 
 BankAccount() {
	 System.out.println("Hello");
 }
 
 BankAccount( String ssn){
	 System.out.println("Social Security:" + ssn );
 }
 
 
 BankAccount(String name ,String accountNumber , double balance ){
	 this.name = name;
	 this.accountNumber = accountNumber;
	 this.balance = balance;
 }
 
 // Getters and Setters 

 
 
public String getName() {
	return name;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public void setName(String name) {
	this.name = name;
}

public String getSsn() {
	return ssn;
}

public void setSsn(String ssn) {
	this.ssn = ssn;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}


//Methods

public void setRate(){
	System.out.println("Set Rate");
}

public void increaseRate(){
	System.out.println("Increase Rate");
}
public  void deposit( double amount){
	 balance = balance + amount;
	 showActivity("Deposit");
 }
 
 void withdraw(double amount){
	 balance = balance - amount;
	 showActivity("Withdraw");
 }
 
 void checkBalance(){
	 System.out.println("Balance :" + balance);
 }
 
 void getStatus(){
	 
 }
 
private void showActivity(String activity){
	 System.out.print( "You Recent Activity: " +activity);
	 System.out.println("Your new Balance is: " + balance);
 }
 
 @Override
 public String toString(){
	 return "[ Name: " + name + " . Account Numer:  " + accountNumber + ". Balance: $" + balance + "]";
 }
 

}
