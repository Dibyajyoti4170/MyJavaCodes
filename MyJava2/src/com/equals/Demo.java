package com.equals;

public class Demo {
	
	public static void main(String[] args) {
		String s1="hello world";
		String s2="hello kitty";
		String s3="hi";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("hi".equals("hello world"));
		System.out.println("hi".equals("HI"));
		System.out.println("hi".equalsIgnoreCase("HI"));
	}

}
