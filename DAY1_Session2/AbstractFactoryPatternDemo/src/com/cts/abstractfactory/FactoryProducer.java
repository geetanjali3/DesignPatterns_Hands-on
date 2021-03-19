package com.cts.abstractfactory;

public class FactoryProducer {
	
	
	public static AbstractFactory getFactory(String typeOfFactory)
	{
		if(typeOfFactory.equalsIgnoreCase("mercedes"))
		{
			return new MercedesFactory();
		}
		else if(typeOfFactory.equalsIgnoreCase("audi"))
		{
			return new AudiFactory();
		}
		else
			return null;
			
	}

}
