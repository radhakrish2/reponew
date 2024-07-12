package task1;

public class FD implements Account {

double balance;
	
	FD(double bal)
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
