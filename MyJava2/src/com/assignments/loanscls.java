package com.assignments;

public class loanscls {
	 public static void main(String[] args) 
	   {
	     loans l1 = new loans("home loan", 8.0);
	     loans l2 = new loans("education loan", 11.0);
	     System.out.println("name is : "+l1.name);
	     System.out.println("roi : "+l1.roi);
	     System.out.println("name is : "+l2.name);
	     System.out.println("roi : "+l2.roi);
	}

}
