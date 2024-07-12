package day4;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Saranya",45000);
		Employee e2 = new Employee(101,"Saranya",45000);
		
		//String s = new String("TNSIF");
		//System.out.println(s);
		
		System.out.println(e1.toString());
		System.out.println(e1.hashCode());
		System.out.println(e1.equals(e2));
		

	}

}
