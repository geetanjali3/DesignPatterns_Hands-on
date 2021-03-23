package com.cts.observer.demo;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
	
	private List<Observer> observers = new ArrayList<>();
	static String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);

	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);

	}

	@Override
	public void notifyUpdate(Message m) {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.update(m);
		}

	}

}
