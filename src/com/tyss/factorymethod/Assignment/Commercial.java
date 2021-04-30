package com.tyss.factorymethod.Assignment;

public class Commercial extends Plan {

	@Override
	public void setRate() {
		Commercial comm=new Commercial();
		System.out.println("the bill is="+comm.generateBill(10));
		
	}

}
