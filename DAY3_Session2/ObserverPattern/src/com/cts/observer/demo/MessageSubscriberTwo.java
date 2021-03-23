package com.cts.observer.demo;
public class MessageSubscriberTwo implements Observer

{

	@Override

	public void update(Message m) {

		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent()+"  "+MessagePublisher.state);

	}

}