package oop;

public class BankAccountApp {

	public static void main(String[] args) {
	
		BankAccount acc1 = new BankAccount();
		acc1.setName("Alfanso Barr");
		acc1.setAccountNumber("234136");
		acc1.setBalance(234000);
		
		
		//Polymorphism through overriding 
		System.out.println(acc1.toString());
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Alfanso Barr","232445", 3000000);
		System.out.println(acc2.toString());
		
		
		
		
		

	}

}
