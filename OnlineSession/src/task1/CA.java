package task1;

public class CA implements Account{

 double balance;
	

	CA(double bal)
	{
		balance=bal;
	}

	@Override
	public double getBalance() {
		
		return balance;
	}
	
	public String toString()
	{
		return balance+"";
	}
	
	
}
