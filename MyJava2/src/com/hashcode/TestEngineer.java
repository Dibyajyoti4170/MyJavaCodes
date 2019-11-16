package com.hashcode;
	
	public class TestEngineer extends Emp{
		String tool;
		TestEngineer()
		{
			
		}
		TestEngineer(int id,String name,double salary,String tool)
		{
			super(id,name,salary);
			this.tool=tool;
		}
		
		public String toString()
		{
			return super.toString()+ " "+ tool;
		}

		public boolean equals(Object ob)
		{
			TestEngineer temp=(TestEngineer) ob;
			return super.equals(temp) && this.tool.equals(temp.tool);
					
					
			
		}
		public int hashCode()
		{
			int hc;
			hc=super.hashCode() + tool.hashCode();
			return hc;
		}
	}


