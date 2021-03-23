package com.cts.chainofresponsibility.demo;

public class ProjectManager implements ILeaveRequestHandler{

	
	private ILeaveRequestHandler nextHandler=new HR();
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		
		if(leaveRequest.getLeaveDays()>=3 && leaveRequest.getLeaveDays()<5)
		{
			System.out.println("Leave Request Approved for the employee "+leaveRequest.getEmployeeName()+" by the Project Manager");
		}
		else
		{
			nextHandler.handleRequest(leaveRequest);
		}
		
	}

}
