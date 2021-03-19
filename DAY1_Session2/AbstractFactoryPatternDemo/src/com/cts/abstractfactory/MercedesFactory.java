package com.cts.abstractfactory;

public class MercedesFactory extends AbstractFactory{

	@Override
	Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		Headlight mercedesHeadlight=new MercedesHeadlight();
		return mercedesHeadlight;
	}

	@Override
	Tire makeTire() {
		// TODO Auto-generated method stub
		Tire mercedesTire=new MercedesTire();
		return mercedesTire;
	}

}
