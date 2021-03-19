package com.cts.solidprinciples.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productDetail,productType;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String choice=in.nextLine().toLowerCase();
		
		switch(choice)
		{
		
		case "order" : System.out.println("Please provide the Model Name:");
					   productDetail=in.nextLine().toLowerCase();
					   IProcessOrder processOrderObj=new ProcessOrderImpl();
					   processOrderObj.processOrder(productDetail);
					   break;
					 
		case "repair" :System.out.println("Is it the phone or the accessory that you want to be repaired?");
					   productType=in.nextLine().toLowerCase();
					   if(productType.equals("phone"))
					   {
						   System.out.println("Please provide the phone model name:");
						   productDetail=in.nextLine();
						   IProcessPhoneRepair phoneRepairObj=new ProcessPhoneRepairImpl();
						   phoneRepairObj.processPhoneRepair(productDetail);
					   }
					   else
					   {
						   System.out.println("Please provide the accessory detail, like headphone, tempered glass");
						   productDetail=in.nextLine();
						   IProcessAccessoryRepair accessoryRepairObj=new ProcessAccessoryRepairImpl();
						   accessoryRepairObj.processAccessoryRepair(productDetail);
					   }
					   break;
		
		default : break;
		}

	}

}
