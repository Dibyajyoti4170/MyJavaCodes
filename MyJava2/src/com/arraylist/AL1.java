package com.arraylist;

	import java.util.ArrayList;
	class AL1 {

		public static void main(String[] args) {
			ArrayList al=new ArrayList();
			System.out.println(al.size());
			System.out.println(al.isEmpty());
			al.add(10);
			al.add(20);
			al.add("NEHA");//Heterogeneous allowed
			System.out.println(al);// order maintained
			al.add(1, "DIBYA");
			System.out.println(al);
			al.add("ALOK");
			al.add("ADITYA");
			System.out.println(al.isEmpty());//false
			System.out.println(al.size());//6
			Object ob=al.set(5, "HEMANTH");
			System.out.println(ob);//
			System.out.println(al);
			System.out.println(al.contains("KARTHIK"));//false
			System.out.println(al.add(20));//true //duplicate allowed
			System.out.println(al);
			System.out.println(al.indexOf(20));//2
			System.out.println(al.lastIndexOf(20));//6
			System.out.println(al.indexOf("ALLOK"));//-1
			System.out.println(al.size());
			System.out.println(al);
			al.clear();
			System.out.println(al.isEmpty());//true
			System.out.println(al.size());//0
		}

	}
