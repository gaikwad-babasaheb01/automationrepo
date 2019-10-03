package oops.abstraction;

public class PNB implements RBI{
	@Override
	public void savingAccount() {
		System.out.println("saving account in PNB");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("current account in canara PNB");
		
	}

	@Override
	public void debitCard() {
System.out.println("debit card in canara PNB");		
	}

	@Override
	public void creditCard() {
System.out.println("credit card in canara PNB");		
	}


}
