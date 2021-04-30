package com.tyss.factorymethod.Assignment;

public  abstract class Plan {
	static final int cost=20;
	public  abstract void setRate();
	
	public double generateBill(double units) {
		return cost*units;
	}
	
	

}
