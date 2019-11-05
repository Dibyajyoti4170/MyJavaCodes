package com.assignment_03;

public class LoanCls 
{
   public static void main(String[] args) 
   {
     Loan l1 = new Loan("Jyothi", 25.0);
     Loan l2 = new Loan("nandini", 30.0);
     System.out.println("name is : "+l1.name);
     System.out.println("roi : "+l1.roi);
     System.out.println("name is : "+l2.name);
     System.out.println("roi : "+l2.roi);
}
}
