package com.tyss.factorymethod.Assignment;

public class Getplan {
	public static Plan getPlan(String planname)
	{
		if(planname.equalsIgnoreCase("commercial")) {
			return new Commercial();
		}
		else if(planname.equals("demostic"))
		{
			return new Demostic();
		}
		else if(planname.equals("industrial"))
		{
			return new Industrial();
		}
		return null;
	

	}

}
