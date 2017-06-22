package com.zbartholomew.example1;

// Blueprint for classes that will have decorators

public interface Pizza {

    public String getDescription();

    public double getCost();
}

// Wrong way - a lot more effort and inefficient
/*
public abstract class Pizza{


	public abstract void setDescription(String newDescription);
	public abstract String getDescription();

	public abstract void setCost(double newCost);
	public abstract double getCost();

	// I could use getter and setter methods for every
	// potential Pizza topping

}
*/
