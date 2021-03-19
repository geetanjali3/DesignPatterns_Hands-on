package com.cts.adapterpattern.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBugattiVeyron {

	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() 
	{ 
		
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
		
	}
	
	@Test
	public void whenConvertingUSDTOEURO_thenSuccessfullyConverted() 
	{ 
		
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getCost(), 169.491525424,0.000001);
		
	}
	

}
