package com.cts.chainofresponsibility.demo;

public class Supervisor implements ILeaveRequestHandler {

	
	private ILeaveRequestHandler nextHandler=new ProjectManager();
	
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		if(leaveRequest.getLeaveDays()>=1 && leaveRequest.getLeaveDays()<3)
		{
			System.out.println("Leave Request Approved for the employee "+leaveRequest.getEmployeeName()+" by Supervisor");
		}
		else
		{
			nextHandler.handleRequest(leaveRequest);
		}
		
	}

	

	
}
