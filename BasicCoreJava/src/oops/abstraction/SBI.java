package oops.abstraction;

public class SBI implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("saving account in SBI");
	}

	@Override
	public void currentAccount() {
	System.out.println("current Account in SBI");
	}

	@Override
	public void debitCard() {
System.out.println("debit card in SBI");		
	}

	@Override
	public void creditCard() {
System.out.println("credit card in SBI");		
	}
	
	

}
