package org.sam;

public class IciciBank implements ReserveBank ,StateBank {

	@Override
	public void current() {
		// TODO Auto-generated method stub
		System.out.println("Current 7%");
	}

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("Savings 8%");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
        System.out.println("Deposit 9%");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan 5%");
	}

	public static void main(String[] args) {
		
		IciciBank e= new IciciBank();
		e.current();
		e.savings();
		e.deposit();
		e.loan();
		
		
		
		
		
	}
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
