package com.cts.chainofresponsibility.demo;

public interface ILeaveRequestHandler {
	
	public static final ILeaveRequestHandler nextHandler = null;
	
	public void handleRequest(LeaveRequest leaveRequest);

}
