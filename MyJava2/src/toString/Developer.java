package toString;

import com.hashcode.Emp;

public class Developer extends Employee{

	String language;
	
	Developer()
	{
		
	}
	Developer(int id,String name,double salary,String language)
	{
		super(id,name,salary);
		this.language=language;
		
	}
	public String toString()
	{
		return super.toString() + " "+language;

}
} 