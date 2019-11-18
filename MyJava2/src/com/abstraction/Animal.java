package com.abstraction;

abstract class Animal {
	
	double height;
	double weight;
	public Animal() {
	
	}
	Animal(double height,double weight)
	{
		this.height = height;
		this.weight = weight;
	}
	abstract void talk();

}
