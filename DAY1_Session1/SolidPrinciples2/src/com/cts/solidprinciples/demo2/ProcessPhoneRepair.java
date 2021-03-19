package com.cts.solidprinciples.demo2;

public class ProcessPhoneRepair {

	public void repairSteps(IPhone phone)
	
	{
		String phonePart1 = phone.getPhonePart1();
		System.out.println(phonePart1+" repaired");
		
		double part1Cost = phone.getPart1Cost();
		System.out.println("Repair cost: "+part1Cost*0.5);
	}
	
}
