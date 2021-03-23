package com.cts.observer.demo;

public interface Subject {
	
	public String state=null;
	public void attach(Observer o);
	public void detach(Observer o);
	public void notifyUpdate(Message m);

}
