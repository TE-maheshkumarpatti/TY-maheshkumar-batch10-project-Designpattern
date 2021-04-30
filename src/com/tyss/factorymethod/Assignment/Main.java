package com.tyss.factorymethod.Assignment;

import java.util.Scanner;

public class Main {
	static Plan plan=null;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the type of load");
		String res=scanner.next();
		plan=Getplan.getPlan(res);
		plan.setRate();
		
		
		
	}

}
