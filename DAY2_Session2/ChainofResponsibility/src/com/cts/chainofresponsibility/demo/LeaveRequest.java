package com.cts.chainofresponsibility.demo;

public class LeaveRequest {
	
	private String employeeName;
	private int leaveDays;
	public LeaveRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveRequest(String employeeName, int leaveDays) {
		super();
		this.employeeName = employeeName;
		this.leaveDays = leaveDays;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	
	
	
	
	

}
