package day1;

public class Calc {
	
	int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	int pow(int n,int p)
	{
		int r=1;
		for(int i=1;i<=p;i++)
		{
			r=r*n;
		}
		return r;
	}

}
