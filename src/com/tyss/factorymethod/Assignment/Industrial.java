package com.tyss.factorymethod.Assignment;

public class Industrial extends Plan {

	@Override
	public void setRate() {
		Industrial industrial=new Industrial();
		System.out.println("the rate is "+industrial.generateBill(20));
		
	}

}
