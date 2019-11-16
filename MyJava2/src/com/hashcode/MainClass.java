package com.hashcode;

public class MainClass {
	
public static void main(String[] args) {
		
		Emp e1=new Emp(1,"A",8435);
		TestEngineer t1=new TestEngineer(2,"B",347,"DATA SCIENCE");
		TestEngineer t2=new TestEngineer(21,"B1",8974,"ALM");
		Developer d1=new Developer (3,"C",6577,"java");
		Developer d2=new Developer (32,"C2",65.87,"PYTHON");
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t1));
		System.out.println(d1.equals(d2));
		System.out.println(d2.equals(d1));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());

}
}
