package arraydemo;

public class ArrayEx {

	public static void main(String[] args) {
		
		//Single dimensional Array to to store students name
		
		String[] names = {"Priyanka","Akshata","Keerthana"};
		
		
		int[][] marks ={ {98,99,96,95,98}, 
						{98,90},
						{99}
		               };
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
			int total=0;
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.println(marks[i][j]);
				total+=marks[i][j];
			}
			
			System.out.println("Total:"+total);
		}
		

	}

}
