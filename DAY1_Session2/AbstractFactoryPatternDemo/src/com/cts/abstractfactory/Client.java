package com.cts.abstractfactory;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your choice as text:\n -Mercedes \n -Audi \n -Exit");
			String typeOfFactory = in.nextLine();
			if (!typeOfFactory.equalsIgnoreCase("exit")) {
				AbstractFactory factory = FactoryProducer.getFactory(typeOfFactory);

				System.out.println("Choose what to manufacture: \n -Tire \n -Headlight");
				String itemChoice = in.nextLine();
				if (itemChoice.equalsIgnoreCase("headlight")) {
					Headlight makeHeadlight = factory.makeHeadlight();
					makeHeadlight.headLight();
				} else if (itemChoice.equalsIgnoreCase("tire")) {
					Tire makeTire = factory.makeTire();
					makeTire.tire();
				} 
			}
			System.exit(0);
		}
	}

}
