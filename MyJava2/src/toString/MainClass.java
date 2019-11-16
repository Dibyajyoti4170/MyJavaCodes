package toString;

public class MainClass {
	
	public static void main(String[]args)
	{
		Employee e = new Employee(1,"Dibya", 80.0);
		TestEngineer t = new TestEngineer(2,"Deeksha", 70.0, "ALM");
		Developer d = new Developer (3,"Neha", 60.0, "selenium");
		System.out.println(e);
		System.out.println(t);
		System.out.println(d);
		
	}

}
