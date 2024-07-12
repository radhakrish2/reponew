package task1;

public class Run {

	public static void main(String[] args) {
		
		Account[] accounts =new Account[] {new SB(4000), new CA(10000),new FD(50000)};
				
		for(int i=0;i<accounts.length;i++)
		{
			System.out.println(accounts[i]);
		}
		
		
//		String[] s = new String[] {"Apple","Banana","Orange","Grape"};
//		
//		
//		for(int i=0;i<s.length;i++)
//		{
//			System.out.println(s[i]);
//		}
//	
		
		
		
	
	}

}
