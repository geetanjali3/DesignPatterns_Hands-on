package com.cts.observer.demo;
public class MessageSubscriberThree implements Observer

{

	@Override

	public void update(Message m) {

		System.out.println("MessageSubscriberThree :: " + m.getMessageContent()+"  "+MessagePublisher.state);

	}

}