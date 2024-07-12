package day4;

public class Account {

	int accNo;
	double balance;
	int pin;
	
	public Account(int accNo, double balance, int pin) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.pin = pin;
	}
	
	 void getBalance(int pin)
	{
		if(this.pin == pin)
		  System.out.println(balance); 
			
		
		else
		{
			System.out.println("Invalid pin");
		}
	}
	
	
}
