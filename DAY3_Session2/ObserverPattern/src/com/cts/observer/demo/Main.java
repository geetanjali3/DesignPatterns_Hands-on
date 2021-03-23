package com.cts.observer.demo;
public class Main

{

	public static void main(String[] args)

	{

		MessageSubscriberOne s1 = new MessageSubscriberOne();
		MessageSubscriberTwo s2 = new MessageSubscriberTwo();
		MessageSubscriberThree s3 = new MessageSubscriberThree();
		MessagePublisher p = new MessagePublisher();
		p.setState("state1");
		p.attach(s1);
		p.attach(s2);
		p.attach(s3);
		p.notifyUpdate(new Message("First Message"));
		p.detach(s1);
		p.setState("state2");
		p.notifyUpdate(new Message("Second Message"));
	}

}