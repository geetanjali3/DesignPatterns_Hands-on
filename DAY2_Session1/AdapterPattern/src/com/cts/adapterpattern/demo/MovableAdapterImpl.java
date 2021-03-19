package com.cts.adapterpattern.demo;

public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars; // standard constructors

	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {

		return mph * 1.60934;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return convertUSDtoEURO(luxuryCars.getCost());
	}

	public double convertUSDtoEURO(double usd)
	{
		return usd/1.18;
	}
}
