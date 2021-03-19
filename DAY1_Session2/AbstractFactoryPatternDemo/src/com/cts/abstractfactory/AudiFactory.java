package com.cts.abstractfactory;

public class AudiFactory extends AbstractFactory{

	@Override
	Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		Headlight audiHeadlight=new AudiHeadlight();
		return audiHeadlight;
	}

	@Override
	Tire makeTire() {
		// TODO Auto-generated method stub
		Tire audiTire=new AudiTire();
		
		
		return audiTire;
	}

}
