package task1;

public class SB implements Account{

	double balance;
	
	SB(double bal)
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
