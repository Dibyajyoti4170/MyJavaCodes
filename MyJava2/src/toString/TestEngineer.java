package toString;

public class TestEngineer extends Employee {
	
	String tool;
	
	TestEngineer()
	{
		
	}
	TestEngineer(int id,String name, double salary, String tool)
	{
		super(id,name,salary);
		this.tool = tool;
	}
public String toString()
{
   return super.toString()+" "+tool;
		   }

}

