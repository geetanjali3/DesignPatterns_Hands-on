package com.cts.chainofresponsibility.demo;

public class HR  implements ILeaveRequestHandler{

	private ILeaveRequestHandler nextHandler = null;
	
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		
		if(leaveRequest.getLeaveDays()>5 )
		{
			System.out.println("Leave Request Approved for the employee "+leaveRequest.getEmployeeName()+" by HR");
		}
		
		
	}

}
